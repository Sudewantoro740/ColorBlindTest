package com.example.colorblindtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_soal.*

class SoalFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonSubmit.setOnClickListener { view: View ->
            val checkedId =
                radioGroup.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.Jwbn1 -> answerIndex = 0
                    R.id.Jwbn2 -> answerIndex = 1
                    R.id.Jwbn3 -> answerIndex = 2
                    R.id.Jwbn4 -> answerIndex = 3
                }
                if (answerIndex == 2) {
                    view.findNavController()
                        .navigate(R.id.action_soalFragment_to_benarFragment)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_soalFragment_to_salahFragment)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_soal, container, false)
    }

}