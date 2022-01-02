package test.app.mvvmproj

import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.newFixedThreadPoolContext

class MovieViewModel: ViewModel() {

    //parametre fih il movie name ykon live bach il ui kif ytab3ha yl9aha 93da tt4ayr bchkil mobachir
     var MovieNameMutableLiveData : MutableLiveData<String> = MutableLiveData()
    //lfar9 bin live data w MutableLiveData enti il MutableLiveData njmo nbdlo valeur mat3ha manuellement

     fun getMovieName(){
        var MovieName = getMovieFromDB().movieName
        MovieNameMutableLiveData.value = MovieName
    }
   private fun getMovieFromDB(): moviModel {
        return moviModel("noura")
    }
}


