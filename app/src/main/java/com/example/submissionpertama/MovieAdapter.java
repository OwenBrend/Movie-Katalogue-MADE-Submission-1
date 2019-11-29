package com.example.submissionpertama;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Movie> movies = new ArrayList<>();

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if( itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false);
        }
        ViewHolder viewHolder = new ViewHolder (itemView);
        Movie movie = (Movie) getItem(i);
        viewHolder.bind(movie);
        return itemView;
    }
    private class ViewHolder{
        private TextView txtTitle;
        private TextView txtDescription;
        private TextView txtDate;
        private ImageView imgPhoto;

        ViewHolder(View view){
            txtTitle = view.findViewById(R.id.txt_title);
            txtDate = view.findViewById(R.id.txt_date);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
        }

        void bind(Movie movie){
            txtTitle.setText(movie.getTitle());
            txtDate.setText(movie.getRelease());
            txtDescription.setText(movie.getDescription());
            imgPhoto.setImageResource(movie.getPhoto());
        }
    }
}
