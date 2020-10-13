package com.example.pavilionx360.recycardview;

public class Movie {

    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;

    public Movie(){

    }

    public Movie(String title, String category, String description, int thumbnail){

        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;

    }

    //Getter
    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    //Setter


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

