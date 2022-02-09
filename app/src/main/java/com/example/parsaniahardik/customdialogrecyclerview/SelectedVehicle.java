package com.example.parsaniahardik.customdialogrecyclerview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SelectedVehicle  {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("cabId")
    @Expose
    private Integer cabId;
    @SerializedName("cabNo")
    @Expose
    private String cabNo;
    @SerializedName("vehicleNo")
    @Expose
    private String vehicleNo;
    @SerializedName("vehicleType")
    @Expose
    private String vehicleType;
    @SerializedName("vehicleTypeId")
    @Expose
    private Integer vehicleTypeId;
    @SerializedName("vehicleModel")
    @Expose
    private String vehicleModel;
    @SerializedName("passangerCapacity")
    @Expose
    private Integer passangerCapacity;
    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;
    @SerializedName("isAdhoc")
    @Expose
    private Boolean isAdhoc;
    @SerializedName("driverId")
    @Expose
    private String driverId;
    @SerializedName("driverName")
    @Expose
    private String driverName;
    @SerializedName("driverContact")
    @Expose
    private Long driverContact;
    @SerializedName("vendorName")
    @Expose
    private String vendorName;
    @SerializedName("preferredResidentialArea")
    @Expose
    private String preferredResidentialArea;
    @SerializedName("category")
    @Expose
    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public String getCabNo() {
        return cabNo;
    }

    public void setCabNo(String cabNo) {
        this.cabNo = cabNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Integer getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(Integer passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getIsAdhoc() {
        return isAdhoc;
    }

    public void setIsAdhoc(Boolean isAdhoc) {
        this.isAdhoc = isAdhoc;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Long getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(Long driverContact) {
        this.driverContact = driverContact;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPreferredResidentialArea() {
        return preferredResidentialArea;
    }

    public void setPreferredResidentialArea(String preferredResidentialArea) {
        this.preferredResidentialArea = preferredResidentialArea;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
