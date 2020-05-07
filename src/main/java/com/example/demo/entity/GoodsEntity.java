package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "goods", schema = "invoicingsystem")
public class GoodsEntity {
    private int goodsId;
    private String goodsNumber;
    private String goodsName;
    private String abbreviation;
    private String brand;
    private String model;
    private String goodsNo;
    private String material;
    private String colour;
    private String type;
    private String specifications;
    private String unit;
    private String weight;
    private String stock;
    private String buyingPrice;
    private String retailPrice;
    private String placeOfProduction;
    private String qualityGuaranteePeriod;
    private String remarks;

    @Id
    @Column(name = "goodsId")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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
    @Column(name = "goodsName")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "goodsNo.")
    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    @Basic
    @Column(name = "material")
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Basic
    @Column(name = "colour")
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "specifications")
    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "stock")
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "buyingPrice")
    public String getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(String buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    @Basic
    @Column(name = "retailPrice")
    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Basic
    @Column(name = "placeOfProduction")
    public String getPlaceOfProduction() {
        return placeOfProduction;
    }

    public void setPlaceOfProduction(String placeOfProduction) {
        this.placeOfProduction = placeOfProduction;
    }

    @Basic
    @Column(name = "qualityGuaranteePeriod")
    public String getQualityGuaranteePeriod() {
        return qualityGuaranteePeriod;
    }

    public void setQualityGuaranteePeriod(String qualityGuaranteePeriod) {
        this.qualityGuaranteePeriod = qualityGuaranteePeriod;
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
        GoodsEntity that = (GoodsEntity) o;
        return goodsId == that.goodsId &&
                Objects.equals(goodsNumber, that.goodsNumber) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(abbreviation, that.abbreviation) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(model, that.model) &&
                Objects.equals(goodsNo, that.goodsNo) &&
                Objects.equals(material, that.material) &&
                Objects.equals(colour, that.colour) &&
                Objects.equals(type, that.type) &&
                Objects.equals(specifications, that.specifications) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(stock, that.stock) &&
                Objects.equals(buyingPrice, that.buyingPrice) &&
                Objects.equals(retailPrice, that.retailPrice) &&
                Objects.equals(placeOfProduction, that.placeOfProduction) &&
                Objects.equals(qualityGuaranteePeriod, that.qualityGuaranteePeriod) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsNumber, goodsName, abbreviation, brand, model, goodsNo, material, colour, type, specifications, unit, weight, stock, buyingPrice, retailPrice, placeOfProduction, qualityGuaranteePeriod, remarks);
    }
}
