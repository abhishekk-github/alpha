package com.genius.amateur.alpha.core.di.component

import com.genius.amateur.alpha.core.AlphaApplication
import com.genius.amateur.alpha.core.di.module.CoreServicesModule
import com.ixigo.lib.utils.scope.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [ CoreServicesModule::class,AndroidSupportInjectionModule::class ])
interface ApplicationComponent {

    fun inject(alphaApplication: AlphaApplication)

    @Component.Factory
    interface Factory{

        fun application(@BindsInstance application: AlphaApplication): Factory

        fun build(): ApplicationComponent
    }
}