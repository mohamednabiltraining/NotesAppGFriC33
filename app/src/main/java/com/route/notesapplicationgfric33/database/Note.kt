package com.route.notesapplicationgfric33.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note (@PrimaryKey(autoGenerate = true) val id:Int, // primary key
                 @ColumnInfo val title:String,
                 @ColumnInfo val description:String,
                 @ColumnInfo val date:String)