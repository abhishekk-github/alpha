package com.genius.amateur.alpha.core.di.module

import com.genius.amateur.alpha.app.MainActivity
import com.genius.amateur.alpha.app.MainActivityModule
import com.ixigo.lib.utils.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityInjectorModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}