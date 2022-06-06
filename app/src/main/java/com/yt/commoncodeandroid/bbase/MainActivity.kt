package com.yt.commoncodeandroid.bbase

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import com.yt.commoncodeandroid.extension.launchActivity

class MainActivity : BaseActivity() {

    @Composable
    override fun Content() {

        Button(onClick = {}) {
            launchActivity<AnotherActivity> {
                putExtra("name","jayant")
            }
        }
    }

}
