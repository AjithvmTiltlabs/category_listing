package com.example.category_list.di

import com.example.category_list.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton
/**
 * Created by Ajith V M on 23-03-2022.
 */
@Singleton
@Component(modules = [ AndroidInjectionModule::class, ActivityModule::class,
    AppModule::class])
interface AppComponent : AndroidInjector<com.example.category_list.Application> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(app: com.example.category_list.Application)
}