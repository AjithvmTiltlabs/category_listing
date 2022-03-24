package com.example.category_list.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.category_list.ViewModelFactory
import com.example.category_list.ui.activities.category.CategoryCreateViewModel
import com.example.category_list.ui.activities.category.CategoryListViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass
/**
 * Created by Ajith V M on 23-03-2022.
 */
@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CategoryListViewModel::class)
    abstract fun bindCategoryListViewModel(categoryListViewModel: CategoryListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CategoryCreateViewModel::class)
    abstract fun bindCategoryDetailsViewModel(categoryCreateViewModel: CategoryCreateViewModel): ViewModel



    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)
