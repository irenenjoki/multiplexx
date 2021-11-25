package com.example.multiplexx.model;
import java.util.List;

public class AllCategory {
    String categoryTitle;
    Integer categoryId;


        private List<categoryitem>categoryitemList;

    public AllCategory(int categoryId, String categoryTitle, List<categoryitem> categoryitemList) {
        this.categoryId = categoryId;
        this.categoryTitle = categoryTitle;
        this.categoryitemList = categoryitemList;
        this.setCategoryitemList (categoryitemList);
        this.setCategoryTitle (categoryTitle);
        this.getCategoryId (categoryId);
        this.setCategoryId (categoryId);



    }



    public List<categoryitem> getCategoryitemList() {
        return categoryitemList;
    }

    public void setCategoryitemList(List<categoryitem> categoryitemList) {
        this.categoryitemList = categoryitemList;
    }

    public String getCategoryTitle() {

        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public void getCategoryId(Integer categoryId) {
        this.categoryId = categoryId;

    }

        public void setCategoryId(Integer categoryId){ this.categoryId = categoryId;
        }
    }
