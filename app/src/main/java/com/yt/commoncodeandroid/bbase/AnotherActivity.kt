package com.yt.commoncodeandroid.bbase

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class AnotherActivity : BaseActivity() {

    @Composable
    override fun Content() {
        val bundle = intent.extras
        Text(text = bundle?.getString("name")!!)
    }

}