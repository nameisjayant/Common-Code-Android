package com.yt.commoncodeandroid.bbase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.yt.commoncodeandroid.ui.theme.CommonCodeAndroidTheme

class AnotherActivity : BaseActivity() {

    @Composable
    override fun Content() {
        Text(text = "Hello ")
    }

}