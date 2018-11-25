package com.andrew.associate.footballclub.main

import com.andrew.associate.footballclub.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}