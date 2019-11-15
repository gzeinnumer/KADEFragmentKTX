package com.gzeinnumer.kadefragmentktx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commitNow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val FRAGMENT_TAG = "FRAGMENT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFragment = BlankFragment()
        btn_set.setOnClickListener{
            // implementation 'androidx.fragment:fragment-ktx:1.1.0'
            supportFragmentManager.commitNow(allowStateLoss = true) {
                replace(R.id.fragmentContainer, myFragment, FRAGMENT_TAG)
            }

//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragmentContainer, myFragment, FRAGMENT_TAG)
//                .commitAllowingStateLoss()
        }
    }
}
