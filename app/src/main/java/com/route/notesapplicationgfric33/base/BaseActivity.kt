package com.route.notesapplicationgfric33.base

import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {


    var alertDialoge:AlertDialog? = null;

    fun showMessage(
        title: String? = null, message: String,
        posActionName: String? = null,
        posAction: DialogInterface.OnClickListener? = null,
        negActionName: String? = null,
        negAction: DialogInterface.OnClickListener? = null,
        isCancelable: Boolean = true
    ) {

        alertDialoge = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(posActionName,posAction)
            .setNegativeButton(negActionName,negAction)
            .setCancelable(isCancelable)
            .show()

    }

    fun hideMessage(){
        alertDialoge?.dismiss()
    }
}