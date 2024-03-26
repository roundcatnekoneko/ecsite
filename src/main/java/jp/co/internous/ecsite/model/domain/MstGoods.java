package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {

    private int id;
    private String goodsName;
    private int price;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // idのためのゲッターメソッド
    public int getId() {
        return id;
    }

    // idのためのセッターメソッド
    public void setId(int id) {
        this.id = id;
    }

    // goodsNameのためのゲッターメソッド
    public String getGoodsName() {
        return goodsName;
    }

    // goodsNameのためのセッターメソッド
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    // priceのためのゲッターメソッド
    public int getPrice() {
        return price;
    }

    // priceのためのセッターメソッド
    public void setPrice(int price) {
        this.price = price;
    }

    // createdAtのためのゲッターメソッド
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    // createdAtのためのセッターメソッド
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    // updatedAtのためのゲッターメソッド
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    // updatedAtのためのセッターメソッド
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}