package com.example.likit.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.likit.swoosh.utilities.EXTRA_LEAGUE
import com.example.likit.swoosh.R
import com.example.likit.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }


    var skillSelected = ""
    fun beginnerBtnClicked(view: View) {

        proBtn.isChecked = false

        skillSelected = "beginner"

    }

    fun proBtnClicked(view: View) {

        beginnerBtn.isChecked = false
        skillSelected = "pro"
    }

    fun skillFinishClicked(view: View) {
        if (skillSelected != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skillSelected)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}