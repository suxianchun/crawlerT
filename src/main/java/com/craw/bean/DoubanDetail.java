package com.craw.bean;

public class DoubanDetail {

    private String title;

    private String star;

    private String author;

    private String content;

    private String imageUrl;

    private String press;

    private String detailHref;

    private String rate_num;

    private String num_comments;

    private String simpleAbstract;

    public String getSimpleAbstract() {
        return simpleAbstract;
    }

    public void setSimpleAbstract(String simpleAbstract) {
        this.simpleAbstract = simpleAbstract;
    }

    public String getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(String num_comments) {
        this.num_comments = num_comments;
    }

    public String getRate_num() {
        return rate_num;
    }

    public void setRate_num(String rate_num) {
        this.rate_num = rate_num;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDetailHref() {
        return detailHref;
    }

    public void setDetailHref(String detailHref) {
        this.detailHref = detailHref;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
}
