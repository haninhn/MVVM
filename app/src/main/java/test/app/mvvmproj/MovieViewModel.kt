package test.app.mvvmproj

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel: ViewModel() {

    //parametre fih il movie name ykon live bach il ui kif ytab3ha yl9aha 93da tt4ayr bchkil mobachir
     val movieNameMutableLiveData : MutableLiveData<String> = MutableLiveData()
    //lfar9 bin live data w MutableLiveData enti il MutableLiveData njmo nbdlo valeur mat3ha manuellement

     fun getMovieName(){
        val movieName = getMovieFromDB().movieName
        movieNameMutableLiveData.value = movieName
    }
   private fun getMovieFromDB(): moviModel {
        return moviModel("noura")
    }
}


