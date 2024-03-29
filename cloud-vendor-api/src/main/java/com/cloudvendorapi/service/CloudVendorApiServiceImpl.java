package com.cloudvendorapi.service;

import com.cloudvendorapi.exception.CloudVendorNotFoundException;
import com.cloudvendorapi.model.CloudVendorModel;
import com.cloudvendorapi.repository.CloudVendorApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorApiServiceImpl implements CloudVendorApiService{

    @Autowired
    private CloudVendorApiRepository cloudVendorApiRepository;

    @Override
    public CloudVendorModel createCloudVenderApi(CloudVendorModel cloudVendorModel) {
        return cloudVendorApiRepository.save(cloudVendorModel);
    }

    @Override
    public List<CloudVendorModel> getAllCloudVendorDetails() {
        return cloudVendorApiRepository.findAll();
    }

    @Override
    public CloudVendorModel updateCloudVendorDetails(CloudVendorModel cloudVendorModel, String vendorId) {
        Optional<CloudVendorModel> id = cloudVendorApiRepository.findById(vendorId);
        if (id.isPresent()) {
            CloudVendorModel cloud = id.get();
            cloudVendorModel.setVendorId(cloud.getVendorId());
            cloudVendorModel.setVendorName(cloud.getVendorName());
            cloudVendorModel.setVendorAddress(cloudVendorModel.getVendorAddress());
            cloudVendorModel.setVendorPhoneNumber(cloud.getVendorPhoneNumber());
            return cloudVendorApiRepository.save(cloudVendorModel);
        } else {
            throw new CloudVendorNotFoundException("No vendor found!");
        }
    }

    @Override
    public CloudVendorModel getCloudVendorDetailsById(String vendorId) {
        if(cloudVendorApiRepository.findById(vendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Cloud Vendor Doesn't exits with this id" + vendorId);
        }
       return cloudVendorApiRepository.findById(vendorId).get();
    }

    @Override
    public String deleteById(String vendorId) {
        if(cloudVendorApiRepository.findById(vendorId).isEmpty()){
            throw new CloudVendorNotFoundException("vendor not available");
        }
       cloudVendorApiRepository.deleteById(vendorId);
       return "Employee with this id doesn't present in the database" +  vendorId;
    }
}
