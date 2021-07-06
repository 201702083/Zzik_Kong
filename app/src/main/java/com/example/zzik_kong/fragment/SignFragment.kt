package com.example.zzik_kong.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.zzik_kong.R
import com.example.zzik_kong.databinding.FragmentSignBinding

class SignFragment:Fragment() {
    private var mBinding : FragmentSignBinding? = null
    private val binding get() = mBinding!!
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSignBinding.inflate(inflater,container,false)
        mBinding = binding
        return mBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.registerBtn.setOnClickListener {
            navController.navigate(R.id.action_signFragment_to_loginFragment)
        }
    }
    override fun onDestroyView() {
        mBinding=null
        super.onDestroyView()
    }
}