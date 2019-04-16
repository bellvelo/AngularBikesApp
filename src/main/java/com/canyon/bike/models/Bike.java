package com.canyon.bike.models;

import java.util.Date;
import java.math.BigDecimal;

public class Bike {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchesePrice;
    private Date purcheseDate;
    private Boolean contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getPurchesePrice() {
        return purchesePrice;
    }

    public void setPurchesePrice(BigDecimal purchesePrice) {
        this.purchesePrice = purchesePrice;
    }

    public Date getPurcheseDate() {
        return purcheseDate;
    }

    public void setPurcheseDate(Date purcheseDate) {
        this.purcheseDate = purcheseDate;
    }

    public Boolean getContact() {
        return contact;
    }

    public void setContact(Boolean contact) {
        this.contact = contact;
    }
}
