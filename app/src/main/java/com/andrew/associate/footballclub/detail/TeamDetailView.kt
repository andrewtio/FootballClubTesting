package com.andrew.associate.footballclub.detail

import com.andrew.associate.footballclub.model.Team

interface TeamDetailView {
    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(data: List<Team>)
}