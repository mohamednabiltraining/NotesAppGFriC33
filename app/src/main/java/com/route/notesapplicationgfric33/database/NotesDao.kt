package com.route.notesapplicationgfric33.database

import androidx.room.*

@Dao
interface NotesDao {
    // operations

    @Insert
    fun addNote(note:Note)

    @Delete
    fun deleteNote(note: Note)

    @Query("delete from notes where id = :id")
    fun deleteNoteById(id :Int)

    @Update
    fun updateNote(note:Note)

    @Insert
    fun insertAll(notes:List<Note>)

    @Query("select * from notes")
    fun getAllNotes():List<Note>
}