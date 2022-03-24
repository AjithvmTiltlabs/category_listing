package com.example.category_list.data.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


/**
 * Created by Ajith V M on 23-03-2022.
 */


class Category : Serializable {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

    @SerializedName("data")
    @ColumnInfo(name = "data")
    @Expose
    val data: List<CategoryData>? = listOf()
}