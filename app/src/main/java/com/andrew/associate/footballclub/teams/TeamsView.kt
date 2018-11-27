package com.andrew.associate.footballclub.teams

import com.andrew.associate.footballclub.model.Team

interface TeamsView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}