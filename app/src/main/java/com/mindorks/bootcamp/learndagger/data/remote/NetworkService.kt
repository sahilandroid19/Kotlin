package com.mindorks.bootcamp.learndagger.data.remote

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo
import javax.inject.Inject

class NetworkService @Inject constructor(@ApplicationContext private var context: Context,
                                         @NetworkInfo private var apiKey: String) {

    fun getDummyData() = "NETWORK_DUMMY_DATA"
}