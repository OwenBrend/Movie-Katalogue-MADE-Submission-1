package com.example.submissionpertama;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int photo;
    private String title;
    private String description;
    private String release;
    private String director;
    private String runTime;
    private String detail;
    private String budget;
    private String revenue;
    private String genre;
    private String status;
    private String language;

    public Movie() {

    }


    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getRunTime() {
        return runTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;


    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(photo);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(release);
        dest.writeString(director);
        dest.writeString(rating);
        dest.writeString(runTime);
        dest.writeString(detail);
        dest.writeString(status);
        dest.writeString(language);
        dest.writeString(budget);
        dest.writeString(revenue);
        dest.writeString(genre);
    }
    protected Movie(Parcel in) {
        photo = in.readInt();
        title = in.readString();
        description = in.readString();
        release = in.readString();
        director = in.readString();
        rating = in.readString();
        runTime = in.readString();
        detail = in.readString();
        status = in.readString();
        language = in.readString();
        budget = in.readString();
        revenue = in.readString();
        genre = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

}
