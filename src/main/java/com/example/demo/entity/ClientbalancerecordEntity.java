package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clientbalancerecord", schema = "invoicingsystem")
public class ClientbalancerecordEntity {
    private int id;
    private String clientsNumber;
    private String month;
    private String lastMonthSBalance;
    private String remittanceDate;
    private String remittanceBalance;
    private String purchaseBalance;

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
    @Column(name = "month")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    @Column(name = "lastMonth'sBalance")
    public String getLastMonthSBalance() {
        return lastMonthSBalance;
    }

    public void setLastMonthSBalance(String lastMonthSBalance) {
        this.lastMonthSBalance = lastMonthSBalance;
    }

    @Basic
    @Column(name = "remittanceDate")
    public String getRemittanceDate() {
        return remittanceDate;
    }

    public void setRemittanceDate(String remittanceDate) {
        this.remittanceDate = remittanceDate;
    }

    @Basic
    @Column(name = "remittanceBalance")
    public String getRemittanceBalance() {
        return remittanceBalance;
    }

    public void setRemittanceBalance(String remittanceBalance) {
        this.remittanceBalance = remittanceBalance;
    }

    @Basic
    @Column(name = "purchaseBalance")
    public String getPurchaseBalance() {
        return purchaseBalance;
    }

    public void setPurchaseBalance(String purchaseBalance) {
        this.purchaseBalance = purchaseBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientbalancerecordEntity that = (ClientbalancerecordEntity) o;
        return id == that.id &&
                Objects.equals(clientsNumber, that.clientsNumber) &&
                Objects.equals(month, that.month) &&
                Objects.equals(lastMonthSBalance, that.lastMonthSBalance) &&
                Objects.equals(remittanceDate, that.remittanceDate) &&
                Objects.equals(remittanceBalance, that.remittanceBalance) &&
                Objects.equals(purchaseBalance, that.purchaseBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientsNumber, month, lastMonthSBalance, remittanceDate, remittanceBalance, purchaseBalance);
    }
}
