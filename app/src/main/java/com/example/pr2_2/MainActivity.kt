package com.example.pr2_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.pr2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Инициализация binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Получение NavController из NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // Навигация по кнопкам
        binding.buttonOne.setOnClickListener {
            navController.navigate(R.id.fragmentOne)
        }

        binding.buttonTwo.setOnClickListener {
            navController.navigate(R.id.fragmentTwo)
        }

        binding.buttonThree.setOnClickListener {
            navController.navigate(R.id.fragmentThree)
        }
    }
}
