package com.example.submissionpertama;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    String title;
    String release;
    String director;
    String rating;
    String runTime;
    String detail;
    String status;
    String language;
    String budget;
    String revenue;
    String genre;
    int photo;

    public static final String EXTRA_MOVIE = "extra_movie";

    TextView txtTitle;
    TextView txtRelease;
    TextView txtDirector;
    TextView txtRating;
    TextView txtRuntime;
    TextView txtDetail;
    TextView txtStatus;
    TextView txtLanguage;
    TextView txtBudget;
    TextView txtRevenue;
    TextView txtGenre;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = findViewById(R.id.txt_title);
        txtRelease = findViewById(R.id.txt_date);
        txtDirector = findViewById(R.id.txt_director);
        txtRating = findViewById(R.id.txt_rating);
        txtRuntime = findViewById(R.id.txt_runTime);
        txtDetail = findViewById(R.id.txt_detail);
        txtStatus = findViewById(R.id.txt_status);
        txtLanguage = findViewById(R.id.txt_language);
        txtBudget = findViewById(R.id.txt_budget);
        txtRevenue = findViewById(R.id.txt_revenue);
        txtGenre = findViewById(R.id.txt_genres);
        imgPhoto = findViewById(R.id.img_photo);


        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if(movie != null){
            title = movie.getTitle();
            txtTitle.setText(title);

            release = movie.getRelease();
            txtRelease.setText(release);

            director = movie.getDirector();
            txtDirector.setText(director);

            rating = movie.getRating();
            txtRating.setText(rating);

            runTime = movie.getRunTime();
            txtRuntime.setText(runTime);

            detail = movie.getDetail();
            txtDetail.setText(detail);

            status = movie.getStatus();
            txtStatus.setText(status);

            language = movie.getLanguage();
            txtLanguage.setText(language);

            budget = movie.getBudget();
            txtBudget.setText(budget);

            revenue = movie.getRevenue();
            txtRevenue.setText(revenue);

            genre = movie.getGenre();
            txtGenre.setText(genre);

            photo = movie.getPhoto();
            imgPhoto.setImageResource(photo);

        }

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }
}
