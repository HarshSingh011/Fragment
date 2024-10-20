package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class thirdPage : Fragment(R.layout.fragment_third_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val logAccTextView: TextView = view.findViewById(R.id.logAcc)
        logAccTextView.setOnClickListener {
            val secondPageFragment = secondPage()

            parentFragmentManager.beginTransaction()
                .replace(R.id.main, secondPageFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}

