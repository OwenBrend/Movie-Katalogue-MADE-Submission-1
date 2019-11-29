package com.example.submissionpertama;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private MovieAdapter adapter;
    private String[] dataTitle;
    private String[] dataRelease;
    private String[] dataDescription;
    private String[] dataDirector;
    private String[] dataRating;
    private String[] dataRunTime;
    private String[] dataDetail;
    private String[] dataStatus;
    private String[] dataLanguage;
    private String[] dataBudget;
    private String[] dataRevenue;
    private String[] dataGenre;
    private TypedArray dataPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv_list);
        adapter = new MovieAdapter( this);
        listView.setAdapter(adapter);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Movie Catalogue");
        }

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailActivity = new Intent(MainActivity.this, DetailActivity.class);

                Movie movie = new Movie();
                movie.setPhoto(dataPhoto.getResourceId(position,-1));
                movie.setTitle(dataTitle[position]);
                movie.setRelease(dataRelease[position]);
                movie.setDescription(dataDescription[position]);
                movie.setDirector(dataDirector[position]);
                movie.setRating(dataRating[position]);
                movie.setRunTime(dataRunTime[position]);
                movie.setDetail(dataDetail[position]);
                movie.setStatus(dataStatus[position]);
                movie.setLanguage(dataLanguage[position]);
                movie.setBudget(dataBudget[position]);
                movie.setRevenue(dataRevenue[position]);
                movie.setGenre(dataGenre[position]);

                detailActivity.putExtra(DetailActivity.EXTRA_MOVIE, movie);
                startActivity(detailActivity);
            }
        });
    }
    private void addItem() {
        ArrayList<Movie> movies = new ArrayList<>();
        for ( int i = 0; i < dataTitle.length; i++){
            Movie movie = new Movie();
            movie.setPhoto(dataPhoto.getResourceId(i,-1));
            movie.setTitle(dataTitle[i]);
            movie.setRelease(dataRelease[i]);
            movie.setDescription(dataDescription[i]);
            movie.setDirector(dataDescription[i]);
            movie.setRating(dataRating[i]);
            movie.setRunTime(dataRunTime[i]);
            movie.setDetail(dataDetail[i]);
            movie.setStatus(dataStatus[i]);
            movie.setLanguage(dataLanguage[i]);
            movie.setBudget(dataBudget[i]);
            movie.setRevenue(dataRevenue[i]);
            movie.setGenre(dataGenre[i]);
            movies.add(movie);
        }
        adapter.setMovies(movies);
    }

   private void prepare() {
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        dataTitle = getResources().getStringArray(R.array.data_title);
        dataRelease = getResources().getStringArray(R.array.date_release);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataDirector = getResources().getStringArray(R.array.data_director);
        dataRating = getResources().getStringArray(R.array.data_rating);
        dataRunTime = getResources().getStringArray(R.array.data_runTime);
        dataDetail = getResources().getStringArray(R.array.data_detail);
        dataStatus = getResources().getStringArray(R.array.data_status);
        dataLanguage = getResources().getStringArray(R.array.data_language);
        dataBudget = getResources().getStringArray(R.array.data_budget);
        dataRevenue = getResources().getStringArray(R.array.data_revenue);
        dataGenre = getResources().getStringArray(R.array.data_genre);
    }

    @Override
    public void onClick(View v) {

    }
}
