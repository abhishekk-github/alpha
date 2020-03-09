package com.genius.amateur.alpha.app

import com.ixigo.lib.utils.scope.ActivityScope
import dagger.Module
import dagger.Provides


@Module
class MainActivityModule {

    @ActivityScope
    @Provides
    fun provideExtraString(): String {
        return "This is extra string"
    }


}