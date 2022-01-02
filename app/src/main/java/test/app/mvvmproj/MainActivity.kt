package test.app.mvvmproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import test.app.mvvmproj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var binding : ActivityMainBinding //viewbinding
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         binding.button.setOnClickListener {
         }
    }
}