package com.example.category_list.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.category_list.data.model.CategoryData

/**
 * Created by Ajith V M on 22-03-2022.
 */
@Database(
    entities = [CategoryData::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getCategoryDao(): CategoryDao

    companion object {

        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }


        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "categoryDatabase.db"
            ).fallbackToDestructiveMigration().allowMainThreadQueries().build()

    }



}