package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
    private int id;
    private int userid;
    private int goodsid;
    private String goodsName;
    private int itemCount;
    private int total;
    private String createdAt;

    public HistoryDto() {}

    public HistoryDto(TblPurchase entity) {
        this.id = entity.getId();
        this.userid = entity.getUserId();
        this.goodsid = entity.getGoodsId();
        this.goodsName = entity.getGoodsName();
        this.itemCount = entity.getItemCount();
        this.total = entity.getTotal();
        Timestamp d = entity.getCreatedAt();
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.createdAt = f.format(d);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
