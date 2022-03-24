package com.example.category_list.di

import com.example.category_list.data.repositories.CategoryRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
/**
 * Created by Ajith V M on 23-03-2022.
 */

@Module
object DataModule {
    @Singleton
    @Provides
    fun providesRepository(): CategoryRepository =
        CategoryRepository()

}