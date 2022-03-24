package com.example.category_list.di

import dagger.Module

/**
 * Created by Ajith V M on 23-03-2022.
 */
@Module(
    includes = [
        ViewModelModule::class,
        DataModule::class
    ]
)
class AppModule