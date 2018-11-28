package com.andrew.associate.footballclub.detail

import com.andrew.associate.footballclub.api.ApiRepository
import com.andrew.associate.footballclub.api.TheSportDBApi
import com.andrew.associate.footballclub.model.TeamResponse
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TeamDetailPresenter (private val view: TeamDetailView,
                           private val apiRepository: ApiRepository,
                           private val gson: Gson){

    fun getTeamDetail(teamId: String){
        view.showLoading()

        GlobalScope.launch(Dispatchers.Main){
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getTeamDetail(teamId)).await(),
                TeamResponse::class.java
            )

            view.hideLoading()
            view.showTeamDetail(data.teams)
        }
    }
}