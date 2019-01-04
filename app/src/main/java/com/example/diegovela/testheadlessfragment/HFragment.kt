package com.example.diegovela.testheadlessfragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment

class HFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onResume() {
        super.onResume()
        AlertDialog.Builder(context)
            .setTitle("title")
            .show()
    }
}