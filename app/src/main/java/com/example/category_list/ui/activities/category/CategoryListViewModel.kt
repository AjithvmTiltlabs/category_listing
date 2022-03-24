package com.example.category_list.ui.activities.category

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.category_list.data.model.Category
import com.example.category_list.data.model.CategoryData
import com.example.category_list.data.repositories.CategoryRepository
import com.google.gson.Gson
import javax.inject.Inject

/**
 * Created by Ajith V M on 23-03-2022.
 */

class CategoryListViewModel @Inject constructor(private val repository: CategoryRepository) :ViewModel(){

    val categories = MutableLiveData<LiveData<MutableList<CategoryData>>>()
    var alMainCategories : MutableList<CategoryData> = mutableListOf()

    fun fetchCategoryList(context: Context){
        val gson = Gson()
        val result = gson.fromJson(repository?.getFileFromAssets(context), Category::class.java)
        var alCategories = result?.data

        alCategories?.forEach {
            repository?.insertCategory(it,context)
        }
        getCategoryListFromDb(context)
    }
    fun getCategoryListFromDb(context: Context){
        categories?.postValue(repository?.fetchCategoryList(context))
    }



}