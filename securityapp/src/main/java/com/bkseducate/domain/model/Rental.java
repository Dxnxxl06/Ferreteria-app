package com.bkseducate.domain.model;

import java.time.LocalDate;


public class Rental {
    private Long id;
    private String userId;
    private String toolId;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private String rentalStatus;
    private double totalAmount;

    public Rental(Long id, String userId, String toolId, LocalDate rentalDate, LocalDate returnDate, String rentalStatus, double totalAmount) {
        this.id = id;
        this.userId = userId;
        this.toolId = toolId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalStatus = rentalStatus;
        this.totalAmount = totalAmount;

        
}
    public Rental() {

    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}