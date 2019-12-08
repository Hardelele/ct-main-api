package com.hardelele.api.models;

import org.springframework.data.annotation.Id;

public class InfoBoardModel {

    @Id
    private long id;

    private String title;
    private String massage;
    private String imgUrl;

    public InfoBoardModel() {
    }

    public InfoBoardModel(String title, String massage, String imgUrl) {
        this.title = title;
        this.massage = massage;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "InfoBoardModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", massage='" + massage + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
