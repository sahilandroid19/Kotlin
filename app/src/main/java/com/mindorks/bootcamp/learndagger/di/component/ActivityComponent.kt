package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope
import com.mindorks.bootcamp.learndagger.ui.main.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationModule::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
}