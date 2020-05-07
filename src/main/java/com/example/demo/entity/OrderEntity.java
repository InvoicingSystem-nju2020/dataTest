package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "invoicingsystem")
public class OrderEntity {
    private int id;
    private String orderNumber;
    private String salesperson;
    private String createTime;
    private String dealTime;
    private String client;
    private String writeAnInvoice;
    private String goodsNumber;
    private String finalPrice;
    private String numbers;
    private String totalAmount;
    private String typeOfPayment;
    private String typeOfShipping;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Basic
    @Column(name = "salesperson")
    public String getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(String salesperson) {
        this.salesperson = salesperson;
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
    @Column(name = "dealTime")
    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    @Basic
    @Column(name = "client")
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Basic
    @Column(name = "writeAnInvoice")
    public String getWriteAnInvoice() {
        return writeAnInvoice;
    }

    public void setWriteAnInvoice(String writeAnInvoice) {
        this.writeAnInvoice = writeAnInvoice;
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
    @Column(name = "finalPrice")
    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Basic
    @Column(name = "Numbers")
    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Basic
    @Column(name = "totalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "typeOfPayment")
    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    @Basic
    @Column(name = "typeOfShipping")
    public String getTypeOfShipping() {
        return typeOfShipping;
    }

    public void setTypeOfShipping(String typeOfShipping) {
        this.typeOfShipping = typeOfShipping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id == that.id &&
                Objects.equals(orderNumber, that.orderNumber) &&
                Objects.equals(salesperson, that.salesperson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(dealTime, that.dealTime) &&
                Objects.equals(client, that.client) &&
                Objects.equals(writeAnInvoice, that.writeAnInvoice) &&
                Objects.equals(goodsNumber, that.goodsNumber) &&
                Objects.equals(finalPrice, that.finalPrice) &&
                Objects.equals(numbers, that.numbers) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(typeOfPayment, that.typeOfPayment) &&
                Objects.equals(typeOfShipping, that.typeOfShipping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, salesperson, createTime, dealTime, client, writeAnInvoice, goodsNumber, finalPrice, numbers, totalAmount, typeOfPayment, typeOfShipping);
    }
}
