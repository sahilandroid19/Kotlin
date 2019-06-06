package com.mindorks.bootcamp.learndagger.data.local

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(@ApplicationContext private var context: Context,
                                          @DatabaseInfo private var info: String,
                                          @DatabaseInfo private var version: Int) {

    fun getDummyData() = "DATABASE_DUMMY_DATA"
}