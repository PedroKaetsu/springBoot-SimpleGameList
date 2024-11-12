package com.kaetsu.gamelist.dto;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgURL;
    private String shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(Long id, String title, Integer year, String imgURL, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgURL = imgURL;
        this.shortDescription = shortDescription;
    }

    public GameMinDTO(Game source) {
        this.id = source.getId();
        this.title = source.getTitle();
        this.year = source.getYear();
        this.imgURL = source.getImgURL();
        this.shortDescription = source.getShortDescription();
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }
     public String getShortDescription() {
        return shortDescription;
    }

    public String getImgURL() {
        return imgURL;
    }

    public Integer getYear() {
        return year;
    }

}