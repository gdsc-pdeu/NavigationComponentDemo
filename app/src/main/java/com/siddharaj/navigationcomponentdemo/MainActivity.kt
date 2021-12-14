package com.siddharaj.navigationcomponentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import com.siddharaj.navigationcomponentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //declaring navcontroller and binding variable
    private lateinit var mBinding:ActivityMainBinding
    private lateinit var mNavController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //initializing navcontroller
        mNavController = findNavController(R.id.nav_host_fragment_content_main)

       //setting action bar with navcontroller
        NavigationUI.setupActionBarWithNavController(this,mNavController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return mNavController.navigateUp() || super.onSupportNavigateUp()
    }

}