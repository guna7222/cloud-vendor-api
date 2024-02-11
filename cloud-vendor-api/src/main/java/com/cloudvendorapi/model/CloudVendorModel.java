package com.cloudvendorapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendorModel {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public String getVendorId(){
        return vendorId;
    }

    public void setVendorId(String vendorId){
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
