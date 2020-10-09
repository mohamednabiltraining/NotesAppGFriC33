package com.route.notesapplicationgfric33.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Note::class), version = 1, exportSchema = false)
abstract class NotesDataBase : RoomDatabase() {

    abstract fun notesDao(): NotesDao

    companion object {
        private val DB_NAME = "notesDatabase"
        fun getInstance(context: Context): NotesDataBase {
            // singleton - how to create single object in the lifetime of application
            // how to make migrations in room -> Ahmed mostafa
            val db = Room.databaseBuilder(
                context,
                NotesDataBase::class.java, DB_NAME
            ).allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
            return db;
        }
    }

}