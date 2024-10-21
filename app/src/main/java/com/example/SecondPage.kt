package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraph.R

class SecondPage : Fragment(R.layout.fragment_second_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val createAccTextView: TextView = view.findViewById(R.id.createAcc)
        createAccTextView.setOnClickListener {
            findNavController().navigate(R.id.action_secondPage_to_thirdPage)
        }
    }
}
