package com.tlh.retrofitlearn;

import java.util.Date;

/**
 * Created by hup on 2016/6/2.
 */
public class News {

    private int count;
    private String description;
    private int fcount;
    private int id;
    private String img;
    private int infoclass;
    private String keywords;
    private String message;
    private int rcount;
    private boolean status;
    private Date time;
    private String title;
    private String url;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getInfoclass() {
        return infoclass;
    }

    public void setInfoclass(int infoclass) {
        this.infoclass = infoclass;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "News{" +
                "count=" + count +
                ", description='" + description + '\'' +
                ", fcount=" + fcount +
                ", id=" + id +
                ", img='" + img + '\'' +
                ", infoclass=" + infoclass +
                ", keywords='" + keywords + '\'' +
                ", message='" + message + '\'' +
                ", rcount=" + rcount +
                ", status=" + status +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
