package com.yt.commoncodeandroid.extension

import android.content.Context
import android.content.Intent


inline fun<reified T:Any> createIntent(
    context:Context
) = Intent(context,T::class.java)


inline fun<reified T:Any> Context.launchActivity(
    noinline bundle: Intent.()->Unit = {}
){

    val intent = createIntent<T>(this)
    intent.bundle()
    startActivity(intent)

}