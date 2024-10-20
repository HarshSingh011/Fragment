package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class secondPage : Fragment(R.layout.fragment_second_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val createAccTextView: TextView = view.findViewById(R.id.createAcc)
        createAccTextView.setOnClickListener {
            val thirdPageFragment = thirdPage()

            parentFragmentManager.beginTransaction()
                .replace(R.id.main, thirdPageFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}

