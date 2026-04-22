package uta.edu.app_kotlin_003

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uta.edu.app_kotlin_003.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = MoviesAdapter(
            listOf(
                Movie("Title 1", "https://loremflickr.com/320/240?lock=1"),
                Movie("Title 2", "https://loremflickr.com/320/240?lock=2"),
                Movie("Title 3", "https://loremflickr.com/320/240?lock=3"),
                Movie("Title 4", "https://loremflickr.com/320/240?lock=4"),
                Movie("Title 5", "https://loremflickr.com/320/240?lock=5"),
                Movie("Title 6", "https://loremflickr.com/320/240?lock=6"),
                Movie("Title 7", "https://loremflickr.com/320/240?lock=7"),
                Movie("Title 8", "https://loremflickr.com/320/240?lock=8"),
                Movie("Title 9", "https://loremflickr.com/320/240?lock=9"),
                Movie("Title 10", "https://loremflickr.com/320/240?lock=10"),
                Movie("Title 11", "https://loremflickr.com/320/240?lock=11"),
                Movie("Title 12", "https://loremflickr.com/320/240?lock=12")
            ),
            { movie ->
                Toast.makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT).show()
            }
        )
    }
}


/*

object : MovieClickedListener {
                override fun onMovieClicked(movie: Movie) {
                    Toast.makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT).show()
                }

            }

 */