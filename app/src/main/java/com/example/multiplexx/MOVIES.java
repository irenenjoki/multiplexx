package com.example.multiplexx;

public class MOVIES {
    int id;
    String movieName;
    String ImageUrl;
    String FileUrl;


    public MOVIES(int id, String movieName, String imageUrl, String fileUrl) {
        this.id = id;
        this.movieName = movieName;
        ImageUrl = imageUrl;
        FileUrl = fileUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getFileUrl() {
        return FileUrl;
    }

    public void setFileUrl(String fileUrl) {
        FileUrl = fileUrl;
    }
}
