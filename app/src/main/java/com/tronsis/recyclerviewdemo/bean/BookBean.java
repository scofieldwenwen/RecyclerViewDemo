package com.tronsis.recyclerviewdemo.bean;

import java.io.Serializable;

/**
 * @author scofield@tronsis.com
 * @date 2016/7/10 9:55
 */
public class BookBean implements Serializable{
    private String name;
    private int pagers;
    private float price;
    private long tiem;
    private String introduce;

    public BookBean(String name, int pagers, float price, long tiem) {
        this.name = name;
        this.pagers = pagers;
        this.price = price;
        this.tiem = tiem;
    }

    public BookBean(String name, int pagers, float price, long tiem, String introduce) {
        this.name = name;
        this.pagers = pagers;
        this.price = price;
        this.tiem = tiem;
        this.introduce = introduce;
    }

    public BookBean(String introduce) {
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTiem() {
        return tiem;
    }

    public void setTiem(long tiem) {
        this.tiem = tiem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPagers() {
        return pagers;
    }

    public void setPagers(int pagers) {
        this.pagers = pagers;
    }
}
