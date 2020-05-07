package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clients", schema = "invoicingsystem")
public class ClientsEntity {
    private int id;
    private String clientsNumber;
    private String clientsName;
    private String clientsType;
    private String balance;
    private String clientsContact;
    private String clientsSex;
    private String clientsPost;
    private String contactInformation;
    private String mail;
    private String remarks;
    private String other;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "clientsNumber")
    public String getClientsNumber() {
        return clientsNumber;
    }

    public void setClientsNumber(String clientsNumber) {
        this.clientsNumber = clientsNumber;
    }

    @Basic
    @Column(name = "clientsName")
    public String getClientsName() {
        return clientsName;
    }

    public void setClientsName(String clientsName) {
        this.clientsName = clientsName;
    }

    @Basic
    @Column(name = "clientsType")
    public String getClientsType() {
        return clientsType;
    }

    public void setClientsType(String clientsType) {
        this.clientsType = clientsType;
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
    @Column(name = "clientsContact")
    public String getClientsContact() {
        return clientsContact;
    }

    public void setClientsContact(String clientsContact) {
        this.clientsContact = clientsContact;
    }

    @Basic
    @Column(name = "clientsSex")
    public String getClientsSex() {
        return clientsSex;
    }

    public void setClientsSex(String clientsSex) {
        this.clientsSex = clientsSex;
    }

    @Basic
    @Column(name = "clientsPost")
    public String getClientsPost() {
        return clientsPost;
    }

    public void setClientsPost(String clientsPost) {
        this.clientsPost = clientsPost;
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

    @Basic
    @Column(name = "other")
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientsEntity that = (ClientsEntity) o;
        return id == that.id &&
                Objects.equals(clientsNumber, that.clientsNumber) &&
                Objects.equals(clientsName, that.clientsName) &&
                Objects.equals(clientsType, that.clientsType) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(clientsContact, that.clientsContact) &&
                Objects.equals(clientsSex, that.clientsSex) &&
                Objects.equals(clientsPost, that.clientsPost) &&
                Objects.equals(contactInformation, that.contactInformation) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(other, that.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientsNumber, clientsName, clientsType, balance, clientsContact, clientsSex, clientsPost, contactInformation, mail, remarks, other);
    }
}
