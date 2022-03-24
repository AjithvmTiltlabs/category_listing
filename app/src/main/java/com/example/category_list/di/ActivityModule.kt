package com.example.category_list.di

import com.example.category_list.ui.activities.category.CategoryCreateActivity
import com.example.category_list.ui.activities.category.CategoryListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
/**
 * Created by Ajith V M on 22-03-2022.
 */
@Suppress("unused")
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun  contributeMainActivity() : CategoryListActivity

    @ContributesAndroidInjector
    abstract fun  contributeCategoryDetailsActivity() : CategoryCreateActivity
}