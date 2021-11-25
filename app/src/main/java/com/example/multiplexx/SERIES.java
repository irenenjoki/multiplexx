package com.example.multiplexx;

public class SERIES {
    int id;
    String seriesName;
    String ImageUrl;
    String FileUrl;

    public SERIES(int id, String seriesName, String imageUrl, String fileUrl) {
        this.id = id;
        this.seriesName = seriesName;
        ImageUrl = imageUrl;
        FileUrl = fileUrl;
    }

    public int getId() {
        return id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public String getFileUrl() {
        return FileUrl;
    }
}
