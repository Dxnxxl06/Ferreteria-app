package com.bkseducate.domain.model;

import java.math.BigDecimal;

public class Tool {
    private Long id;
    private String name;
    private String type;
    private String status;
    private String description;
    private String providerId; 
    private BigDecimal pricePerDay;

    public Tool (Long id, String name, String type, String status, String description, String providerId , BigDecimal pricePerDay) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.description = description;
        this.providerId = providerId;
        this.pricePerDay = pricePerDay;
    }

    public Tool () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public BigDecimal getPricPerDay() {
        return pricePerDay;
    }

    public void setPricPerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    
}
