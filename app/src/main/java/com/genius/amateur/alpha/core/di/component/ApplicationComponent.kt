package com.genius.amateur.alpha.core.di.component

import com.genius.amateur.alpha.core.AlphaApplication
import com.genius.amateur.alpha.core.di.module.ActivityInjectorModule
import com.genius.amateur.alpha.core.di.module.ApplicationModule
import com.genius.amateur.alpha.core.di.module.CoreServicesModule
import com.ixigo.lib.utils.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [ApplicationModule::class, CoreServicesModule::class, AndroidSupportInjectionModule::class, ActivityInjectorModule::class])
interface ApplicationComponent {

    fun inject(alphaApplication: AlphaApplication)
/*
    @Component.Factory
    interface Factory {

        fun create(@BindsInstance application: Application,@BindsInstance applicationModule : ApplicationModule): ApplicationComponent
    }*/

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: AlphaApplication): Builder

        fun build(): ApplicationComponent
    }

}