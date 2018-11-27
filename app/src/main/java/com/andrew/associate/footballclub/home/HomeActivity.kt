package com.andrew.associate.footballclub.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.andrew.associate.footballclub.R
import com.andrew.associate.footballclub.R.id.favorites
import com.andrew.associate.footballclub.R.id.teams
import com.andrew.associate.footballclub.R.layout.activity_home
import com.andrew.associate.footballclub.favorites.FavoriteTeamsFragment
import com.andrew.associate.footballclub.teams.TeamsFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_home)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                teams -> {
                    loadTeamsFragment(savedInstanceState)
                }
                favorites -> {
                    loadFavoritesFragment(savedInstanceState)
                }
            }
            true
        }
        bottom_navigation.selectedItemId = teams
    }

    private fun loadTeamsFragment(savedInstanceState: Bundle?){
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container,TeamsFragment(), TeamsFragment::class.java.simpleName)
                .commit()
        }
    }

    private fun loadFavoritesFragment(savedInstanceState: Bundle?){
        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container,
                    FavoriteTeamsFragment(), FavoriteTeamsFragment::class.java.simpleName)
                .commit()
        }
    }
}
