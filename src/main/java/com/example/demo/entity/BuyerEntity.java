package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "buyer", schema = "invoicingsystem")
public class BuyerEntity {
    private int id;
    private String buyerNumber;
    private String buyerName;
    private String contactInformation;
    private String productionCategory;
    private String purchasingCategories;
    private String legalPerson;
    private String contact;
    private String sex;
    private String post;
    private String mail;
    private String remarks;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "buyerNumber")
    public String getBuyerNumber() {
        return buyerNumber;
    }

    public void setBuyerNumber(String buyerNumber) {
        this.buyerNumber = buyerNumber;
    }

    @Basic
    @Column(name = "buyerName")
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Basic
    @Column(name = "contactInformation")
    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Basic
    @Column(name = "productionCategory")
    public String getProductionCategory() {
        return productionCategory;
    }

    public void setProductionCategory(String productionCategory) {
        this.productionCategory = productionCategory;
    }

    @Basic
    @Column(name = "purchasingCategories")
    public String getPurchasingCategories() {
        return purchasingCategories;
    }

    public void setPurchasingCategories(String purchasingCategories) {
        this.purchasingCategories = purchasingCategories;
    }

    @Basic
    @Column(name = "legalPerson")
    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    @Basic
    @Column(name = "contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "post")
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
        BuyerEntity that = (BuyerEntity) o;
        return id == that.id &&
                Objects.equals(buyerNumber, that.buyerNumber) &&
                Objects.equals(buyerName, that.buyerName) &&
                Objects.equals(contactInformation, that.contactInformation) &&
                Objects.equals(productionCategory, that.productionCategory) &&
                Objects.equals(purchasingCategories, that.purchasingCategories) &&
                Objects.equals(legalPerson, that.legalPerson) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(post, that.post) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, buyerNumber, buyerName, contactInformation, productionCategory, purchasingCategories, legalPerson, contact, sex, post, mail, remarks);
    }
}
