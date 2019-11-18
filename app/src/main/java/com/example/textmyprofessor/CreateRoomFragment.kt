package com.example.textmyprofessor

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.textmyprofessor.databinding.FragmentCreateRoomBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CreateRoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCreateRoomBinding>(inflater,
            R.layout.fragment_create_room,container,false)
        // Inflate the layout for this fragment

        binding.createRoomBtn.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_createRoomFragment_to_ChatRoomFragment)
        }
//        return inflater.inflate(R.layout.fragment_create_room, container, false)
        return binding.root
    }

}
