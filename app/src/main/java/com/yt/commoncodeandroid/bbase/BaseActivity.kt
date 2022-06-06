package com.yt.commoncodeandroid.bbase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.yt.commoncodeandroid.ui.theme.CommonCodeAndroidTheme

abstract class BaseActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CommonCodeAndroidTheme() {
                Surface {
                    Content()
                }
            }
        }
    }

    @Composable
    abstract fun Content()
}