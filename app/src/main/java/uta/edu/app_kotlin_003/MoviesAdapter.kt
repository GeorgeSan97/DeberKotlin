package uta.edu.app_kotlin_003

import android.view.LayoutInflater
//import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uta.edu.app_kotlin_003.databinding.ViewMovieItemBinding

class MoviesAdapter (private val  movies: List<Movie>,
                     private val movieClickedListener: (Movie) -> Unit): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewMovieItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.bind(movies[position])
        val movie = movies[position]
        holder.bind(movie)

        holder.itemView.setOnClickListener{
            movieClickedListener (movie)
        }
    }

    override fun getItemCount(): Int = movies.size

    class ViewHolder(private val binding: ViewMovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (movie: Movie){
            binding.textViewTitle.text = movie.title

            Glide
                .with(binding.root.context)
                .load(movie.cover)
                .into(binding.imageViewCover)

        }
    }
}

/*
interface MovieClickedListener{
    fun onMovieClicked(movie: Movie) // (Movie) -> Unit
}
 */