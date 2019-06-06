package com.mindorks.bootcamp.learndagger.ui.main

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(private var databaseService: DatabaseService,
                                        private var networkService: NetworkService) {

    fun getSomeData() = "${databaseService.getDummyData()} : ${networkService.getDummyData()}"
}