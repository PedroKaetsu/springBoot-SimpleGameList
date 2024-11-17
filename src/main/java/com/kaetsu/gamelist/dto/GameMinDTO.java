package com.kaetsu.gamelist.dto;

import com.kaetsu.gamelist.entities.Game;
import com.kaetsu.gamelist.projections.GameMinProjection;

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

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getYear();
        this.imgURL = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
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