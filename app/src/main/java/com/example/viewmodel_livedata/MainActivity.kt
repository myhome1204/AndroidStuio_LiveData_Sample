package com.example.viewmodel_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.FrameMetrics
import android.view.LayoutInflater
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var FirstFragment : FirstFragment
    private lateinit var exampleViewModel : ExampleViewModel
    private lateinit var observer : Observer<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        exampleViewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(ExampleViewModel::class.java)
        FirstFragment = FirstFragment()
        supportFragmentManager.beginTransaction()
            .add(binding.fragmentview.id,FirstFragment)
            .commit()
        exampleViewModel.testLiveData.observe(this){ value->
            binding.test.text = value.toString()

        }

    }
}