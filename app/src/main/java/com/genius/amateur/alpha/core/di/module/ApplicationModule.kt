package com.genius.amateur.alpha.core.di.module

import android.app.Application
import android.content.Context
import com.genius.amateur.alpha.core.AlphaApplication
import com.ixigo.lib.utils.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ApplicationModule() {

    @Provides
    @ApplicationScope
    fun provideApplication(application: AlphaApplication): Application {
        return application
    }

    @Named("applicationContext")
    @Provides
    @ApplicationScope
    fun provideApplicationContext(application: AlphaApplication): Context {
        return application.applicationContext
    }

}