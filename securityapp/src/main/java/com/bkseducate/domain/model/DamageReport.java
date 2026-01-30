package com.bkseducate.domain.model;

import java.math.BigDecimal;

public class DamageReport {
    private String id;
    private String rentalId;
    private String damageDescription;
    private BigDecimal damageCost;

    public DamageReport(String id, String rentalId, String damageReport, BigDecimal damageCost, String damageDescription) {
        this.id = id;
        this.rentalId = rentalId;
        this.damageCost = damageCost;
        this.damageDescription = damageDescription;

    }

    public DamageReport(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRentalId() {
        return rentalId;
    }

    public void setRentalId(String rentalId) {
        this.rentalId = rentalId;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public BigDecimal getDamageCost() {
        return damageCost;
    }

    public void setDamageCost(BigDecimal damageCost) {
        this.damageCost = damageCost;
    }

    
}
