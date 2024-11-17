package com.kaetsu.gamelist.projections;

public interface GameMinProjection {

    // You must define the getters for all the fields you use in the query
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

    // You can also define additional methods if needed
}
