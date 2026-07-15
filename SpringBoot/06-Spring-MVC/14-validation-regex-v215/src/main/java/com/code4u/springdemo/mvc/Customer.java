package com.code4u.springdemo.mvc;

import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message = "required field")
    @Size(min=1,message = "min 1 char")
    private String lastName;

    @NotNull(message = "enter number")
    @Min(value=1,message = "at least 1")
    @Max(value=10,message="at most 10")
    private int coupons;

    @Pattern(regexp = "^[a-z0-9A-Z]{5}",message = "enter valid code")
    private String pincode;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getCoupons() {
        return coupons;
    }

    public void setCoupons(int coupons) {
        this.coupons = coupons;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
