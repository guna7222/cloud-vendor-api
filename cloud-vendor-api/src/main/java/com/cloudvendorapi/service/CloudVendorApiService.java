package com.cloudvendorapi.service;

import com.cloudvendorapi.model.CloudVendorModel;

import java.util.List;
import java.util.Optional;

public interface CloudVendorApiService {

    public CloudVendorModel createCloudVenderApi(CloudVendorModel cloudVendorModel);
    public List<CloudVendorModel> getAllCloudVendorDetails();
    public CloudVendorModel updateCloudVendorDetails(CloudVendorModel cloudVendorModel, String vendorId);
    public Optional<CloudVendorModel> getCloudVendorDetailsById(String vendorId);
    public String deleteById(String vendorId);
}
