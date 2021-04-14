package com.craw.bean;

public class DoubanList {
    private String doubanid;

    private String title;

    private String star;

    private String author;

    private String content;

    private String imageurl;

    private String press;

    private String detailhref;

    private String rateNum;

    private String numComments;

    private String simpleabstract;

    public String getDoubanid() {
        return doubanid;
    }

    public void setDoubanid(String doubanid) {
        this.doubanid = doubanid == null ? null : doubanid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star == null ? null : star.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getDetailhref() {
        return detailhref;
    }

    public void setDetailhref(String detailhref) {
        this.detailhref = detailhref == null ? null : detailhref.trim();
    }

    public String getRateNum() {
        return rateNum;
    }

    public void setRateNum(String rateNum) {
        this.rateNum = rateNum == null ? null : rateNum.trim();
    }

    public String getNumComments() {
        return numComments;
    }

    public void setNumComments(String numComments) {
        this.numComments = numComments == null ? null : numComments.trim();
    }

    public String getSimpleabstract() {
        return simpleabstract;
    }

    public void setSimpleabstract(String simpleabstract) {
        this.simpleabstract = simpleabstract == null ? null : simpleabstract.trim();
    }
}