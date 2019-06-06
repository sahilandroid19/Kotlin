package com.mindorks.bootcamp.learndagger.ui.home

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import javax.inject.Inject

@FragmentScope
class HomeViewModel @Inject constructor(private var databaseService: DatabaseService,
                                        private var networkService: NetworkService,
                                        private var networkHelper: NetworkHelper) {

    fun getSomeData() = "${databaseService.getDummyData()} : " +
            "${networkService.getDummyData()} : " +
            "${networkHelper.isNetworkConnected()}"
}