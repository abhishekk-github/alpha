package com.genius.amateur.alpha.core.di.module

import dagger.Module

@Module(includes = [NetworkModule::class, AnalyticsModule::class, AuthModule::class])
abstract class CoreServicesModule {

}