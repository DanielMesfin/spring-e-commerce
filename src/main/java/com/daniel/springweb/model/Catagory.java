package com.daniel.springweb.model;

public class Catagory {
    private Long categoryID;
    private  String categoryName;

    public Catagory(Long categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long catagoryID) {
        this.categoryID = catagoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String catagoryName) {
        this.categoryName = catagoryName;
    }
}
