package com.route.notesapplicationgfric33

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.notesapplicationgfric33.base.BaseActivity
import com.route.notesapplicationgfric33.database.Note
import com.route.notesapplicationgfric33.database.NotesDataBase
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNote : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        add.setOnClickListener{
            addNote()
        }
    }

    private fun addNote() {
        val noteTitle = note_title.text.toString()
        val noteDesc = description.text.toString();
        val noteDate = date.text.toString();

        val note = Note(title=noteTitle,description = noteDesc,date = noteDate)
        NotesDataBase.getInstance(applicationContext)
            .notesDao()
            .addNote(note)
        // show dialoge
        showMessage(message = "note added successfully",
        posActionName = "ok",posAction = DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
                finish()
            },isCancelable = false)
    }
}