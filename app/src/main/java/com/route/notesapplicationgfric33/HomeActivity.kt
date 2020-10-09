package com.route.notesapplicationgfric33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.notesapplicationgfric33.database.NotesDataBase
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        add.setOnClickListener{
            startActivity(Intent(this,AddNote::class.java))
        }


        // recycler view contains all notes
       val notes =  NotesDataBase.getInstance(applicationContext)
            .notesDao()
            .getAllNotes()
        // swipe to delete in recycler
        // click on note -> show note in new activity to be able to update
    }
}