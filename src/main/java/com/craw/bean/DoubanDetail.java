package com.craw.bean;

public class Doubandetail {

    private String iddoubandetailid;

    private String image;

    private String author;

    private String apress;

    private String apresses;

    private String secondtile;

    private String resoucename;

    private String transname;

    private String syear;

    private String pages;

    private Long price;

    private String stack;

    private String isbn;

    private String contents;

    private String authorintr;

    private String catalog;

    public String getIddoubandetailid() {
        return iddoubandetailid;
    }

    public void setIddoubandetailid(String iddoubandetailid) {
        this.iddoubandetailid = iddoubandetailid == null ? null : iddoubandetailid.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getApress() {
        return apress;
    }

    public void setApress(String apress) {
        this.apress = apress == null ? null : apress.trim();
    }

    public String getApresses() {
        return apresses;
    }

    public void setApresses(String apresses) {
        this.apresses = apresses == null ? null : apresses.trim();
    }

    public String getSecondtile() {
        return secondtile;
    }

    public void setSecondtile(String secondtile) {
        this.secondtile = secondtile == null ? null : secondtile.trim();
    }

    public String getResoucename() {
        return resoucename;
    }

    public void setResoucename(String resoucename) {
        this.resoucename = resoucename == null ? null : resoucename.trim();
    }

    public String getTransname() {
        return transname;
    }

    public void setTransname(String transname) {
        this.transname = transname == null ? null : transname.trim();
    }

    public String getSyear() {
        return syear;
    }

    public void setSyear(String syear) {
        this.syear = syear == null ? null : syear.trim();
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages == null ? null : pages.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack == null ? null : stack.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public String getAuthorintr() {
        return authorintr;
    }

    public void setAuthorintr(String authorintr) {
        this.authorintr = authorintr == null ? null : authorintr.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    @Override
    public String toString() {
        return "Doubandetail{" +
                "iddoubandetailid='" + iddoubandetailid + '\'' +
                ", image='" + image + '\'' +
                ", author='" + author + '\'' +
                ", apress='" + apress + '\'' +
                ", apresses='" + apresses + '\'' +
                ", secondtile='" + secondtile + '\'' +
                ", resoucename='" + resoucename + '\'' +
                ", transname='" + transname + '\'' +
                ", syear='" + syear + '\'' +
                ", pages='" + pages + '\'' +
                ", price=" + price +
                ", stack='" + stack + '\'' +
                ", isbn='" + isbn + '\'' +
                ", contents='" + contents + '\'' +
                ", authorintr='" + authorintr + '\'' +
                ", catalog='" + catalog + '\'' +
                '}';
    }
}