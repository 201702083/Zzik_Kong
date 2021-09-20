package com.example.zzik_kong.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.zzik_kong.MainActivity
import com.example.zzik_kong.MenuActivity
import com.example.zzik_kong.R
import com.example.zzik_kong.databinding.FragmentLoginBinding

class LoginFragment : Fragment(){
    private var mBinding : FragmentLoginBinding? = null
    private val binding get() = mBinding!!
    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding  = FragmentLoginBinding.inflate(inflater, container, false)
        mBinding = binding
        return mBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.loginBtn.setOnClickListener {
            val intent = Intent(getActivity(),MenuActivity::class.java)
            startActivity(intent)
//            navController.navigate(R.id.action_loginFragment_to_mainFragment)

        }
        binding.signBtn.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_signFragment)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        mBinding= null
    }
}