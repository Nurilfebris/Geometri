package org.d3ifcool.geometri


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

import org.d3ifcool.geometri.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class title : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding =DataBindingUtil.inflate<FragmentTitleBinding>(
            inflater,R.layout.fragment_title,container,false
        )
        binding.persegiPanjang.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_title2_to_persegiPanjang2)
        }
        //setHasOptionsMenu(true)
       return binding.root



        }
    }



