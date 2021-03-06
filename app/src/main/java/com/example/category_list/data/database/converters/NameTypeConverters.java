package com.example.category_list.data.database.converters;

import androidx.room.TypeConverter;

import com.example.category_list.data.model.CategoryName;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
/**
 * Created by Ajith V M on 23-03-2022.
 */
public class NameTypeConverters {
    @TypeConverter
    public static List<CategoryName> stringToCategoryName(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<CategoryName>>() {}.getType();
        List<CategoryName> categoryNames = gson.fromJson(json, type);
        return categoryNames;
    }

    @TypeConverter
    public static String categoryNameToString(List<CategoryName> categoryNames) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<CategoryName>>() {}.getType();
        String json = gson.toJson(categoryNames, type);
        return json;
    }
}

