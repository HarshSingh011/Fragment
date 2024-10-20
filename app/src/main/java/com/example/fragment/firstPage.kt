package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class FirstPage : Fragment(R.layout.fragment_first_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.log).setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.main, secondPage())
                addToBackStack(null)
            }
        }

        view.findViewById<Button>(R.id.Reg).setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.main, thirdPage())
                addToBackStack(null)
            }
        }
    }
}


