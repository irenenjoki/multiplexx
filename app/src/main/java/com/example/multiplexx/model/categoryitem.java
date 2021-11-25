package com.example.multiplexx.model;

public class categoryitem {

    int id;
    String movieName;
    String ImageUrl;
    String FileUrl;

    public categoryitem(int id, String MovieName, String imageUrl, String fileUrl) {
        this.id = id;
        this.movieName = MovieName;
        ImageUrl = imageUrl;
        FileUrl = fileUrl;
        this.setMovieName (movieName);
        this.setImageUrl (imageUrl);
        this.getFileUrl (fileUrl);
        this.setFileUrl (FileUrl);

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

    public void setImageUrl(String imageUrl) { ImageUrl = imageUrl; }

    public void getFileUrl(String fileUrl) { FileUrl=fileUrl; }

    public void setFileUrl(String fileUrl) {
        FileUrl =  fileUrl;
    }
}