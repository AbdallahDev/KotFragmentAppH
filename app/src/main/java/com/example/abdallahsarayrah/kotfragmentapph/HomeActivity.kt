package com.example.abdallahsarayrah.kotfragmentapph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var fragmenManager = fragmentManager.beginTransaction()
        var fragmentObject = LoginFragment()
        fragmenManager.replace(R.id.fragmentContainer, fragmentObject)
        fragmenManager.commit()

        buttonSignUp.setOnClickListener {
            var fragmenManager = fragmentManager.beginTransaction()
            var fragmentObject = SignUpFragment()
            fragmenManager.replace(R.id.fragmentContainer, fragmentObject)
            fragmenManager.commit()
            buttonSignUp.visibility = View.GONE
        }
    }
}

