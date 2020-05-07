package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "purchaserecord", schema = "invoicingsystem")
public class PurchaserecordEntity {
    private String id;
    private String createTime;
    private String purchaseTime;
    private String goodsNumber;
    private String numbers;
    private String dicount;
    private String unitPrice;
    private String balance;
    private String taxIncluded;
    private String precautionsForPreservation;
    private String buyer;
    private String remarks;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "createTime")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "purchaseTime")
    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    @Basic
    @Column(name = "goodsNumber")
    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "numbers")
    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Basic
    @Column(name = "dicount")
    public String getDicount() {
        return dicount;
    }

    public void setDicount(String dicount) {
        this.dicount = dicount;
    }

    @Basic
    @Column(name = "unitPrice")
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "balance")
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "taxIncluded")
    public String getTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(String taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    @Basic
    @Column(name = "precautionsForPreservation")
    public String getPrecautionsForPreservation() {
        return precautionsForPreservation;
    }

    public void setPrecautionsForPreservation(String precautionsForPreservation) {
        this.precautionsForPreservation = precautionsForPreservation;
    }

    @Basic
    @Column(name = "buyer")
    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaserecordEntity that = (PurchaserecordEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(purchaseTime, that.purchaseTime) &&
                Objects.equals(goodsNumber, that.goodsNumber) &&
                Objects.equals(numbers, that.numbers) &&
                Objects.equals(dicount, that.dicount) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(taxIncluded, that.taxIncluded) &&
                Objects.equals(precautionsForPreservation, that.precautionsForPreservation) &&
                Objects.equals(buyer, that.buyer) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, purchaseTime, goodsNumber, numbers, dicount, unitPrice, balance, taxIncluded, precautionsForPreservation, buyer, remarks);
    }
}
