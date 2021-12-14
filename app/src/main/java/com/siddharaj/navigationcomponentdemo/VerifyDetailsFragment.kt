package com.siddharaj.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.siddharaj.navigationcomponentdemo.databinding.FragmentEnterDetailsBinding
import com.siddharaj.navigationcomponentdemo.databinding.FragmentShowDetailsBinding


class VerifyDetailsFragment : Fragment() {

    private lateinit var mBinding:FragmentShowDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentShowDetailsBinding.inflate(layoutInflater,container,false)

        //accessing fragment's argument
       val args :VerifyDetailsFragmentArgs by navArgs()

       //get values from argument and set it to text views
       mBinding.tvName.text=args.name
        mBinding.tvRollNumber.text=args.rollnumber

        return mBinding.root
    }


}