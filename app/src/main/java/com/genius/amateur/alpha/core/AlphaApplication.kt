package com.genius.amateur.alpha.core

import android.app.Application
import com.genius.amateur.alpha.core.di.component.DaggerApplicationComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class AlphaApplication : Application(), HasAndroidInjector {

    @Inject
   lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>


    override fun onCreate() {

        DaggerApplicationComponent.builder()
            .application(this)
            .build()
            .inject(this)
        super.onCreate()


    }

    override fun androidInjector(): DispatchingAndroidInjector<Any> {
        return activityDispatchingAndroidInjector;
    }

}