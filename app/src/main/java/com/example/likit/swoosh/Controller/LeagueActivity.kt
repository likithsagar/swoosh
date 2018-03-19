package com.example.likit.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.likit.swoosh.utilities.EXTRA_LEAGUE
import com.example.likit.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }



    var selectedLeague = ""

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked= false
        coedLeagueBtn.isChecked=false
         selectedLeague="men's"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked= false
        coedLeagueBtn.isChecked=false
        selectedLeague="women's"
    }
    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked= false
        womensLeagueBtn.isChecked= false
        selectedLeague="coed"

    }
    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {

            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)

            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
