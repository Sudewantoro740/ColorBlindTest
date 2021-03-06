package com.example.colorblindtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_benar.*
import kotlinx.android.synthetic.main.fragment_salah.*

class SalahFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttontryagain.setOnClickListener { view: View ->
            view.findNavController().
            navigate(R.id.action_salahFragment_to_soalFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_salah, container, false)
    }

}