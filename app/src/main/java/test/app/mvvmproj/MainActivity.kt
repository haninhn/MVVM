package test.app.mvvmproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import test.app.mvvmproj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var binding : ActivityMainBinding //Viewbinding for layout
     private lateinit var viewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         binding.button.setOnClickListener {
             viewModel.getMovieName()
         }
        //observe y3ni o9ed 5lik mostmi3 bach ybzevi fil activity hathi
        viewModel.movieNameMutableLiveData.observe(this , {
            binding.textView.text = it
        })
       //il activty hathi 93det tobservi 3ala  movieNameMutableLiveData awil mysir change fil valeur mt3ha t7ot il valeur fil textView
    }

}