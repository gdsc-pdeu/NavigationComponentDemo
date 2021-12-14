package com.siddharaj.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.siddharaj.navigationcomponentdemo.databinding.FragmentEnterDetailsBinding


class EnterDetailsFragment : Fragment() {

  private lateinit var mBinding:FragmentEnterDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentEnterDetailsBinding.inflate(inflater,container,false)



        mBinding.btnSend.setOnClickListener {
            val studentName  = mBinding.etName.text.toString()
            val rollNumber = mBinding.etRollNumber.text.toString()
            if(studentName.isNotEmpty() && rollNumber.isNotEmpty()) {
                findNavController().navigate(
                    EnterDetailsFragmentDirections.actionEnterDetailsFragmentToShowDetailsFragment(
                        studentName,
                        rollNumber
                    )
                )
            }else{
                Toast.makeText(requireContext(),"Please enter all feilds",Toast.LENGTH_SHORT).show()
            }
        }
        return mBinding.root
    }


}