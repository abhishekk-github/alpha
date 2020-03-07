package com.genius.amateur.alpha.core

import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class AlphaApplication : Application(), HasAndroidInjector {

    @Inject
   lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): DispatchingAndroidInjector<Any> {
        return activityDispatchingAndroidInjector;
    }

}