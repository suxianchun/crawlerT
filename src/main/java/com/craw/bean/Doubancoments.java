package com.craw.bean;

public class Doubancoments {
    private String iddoubancomentsid;

    private String image;

    private String name;

    private String date;

    private String isuse;

    private String usenumber;

    public String getIddoubancomentsid() {
        return iddoubancomentsid;
    }

    public void setIddoubancomentsid(String iddoubancomentsid) {
        this.iddoubancomentsid = iddoubancomentsid == null ? null : iddoubancomentsid.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse == null ? null : isuse.trim();
    }

    public String getUsenumber() {
        return usenumber;
    }

    public void setUsenumber(String usenumber) {
        this.usenumber = usenumber == null ? null : usenumber.trim();
    }

    @Override
    public String toString() {
        return "Doubancoments{" +
                "iddoubancomentsid='" + iddoubancomentsid + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", isuse='" + isuse + '\'' +
                ", usenumber='" + usenumber + '\'' +
                '}';
    }
}