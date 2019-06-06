package com.mindorks.bootcamp.learndagger.di.module

import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private var fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext() = fragment.context
}