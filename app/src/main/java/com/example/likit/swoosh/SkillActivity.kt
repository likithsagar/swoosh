package com.example.likit.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league= intent.getStringExtra(EXTRA_LEAGUE)
    }


    var skillSelected = ""
    fun beginnerBtnClicked(view: View) {

        proBtn.isChecked=false

        skillSelected="beginner"

    }

    fun proBtnClicked(view: View) {

        beginnerBtn.isChecked=false
        skillSelected="pro"
    }
}
