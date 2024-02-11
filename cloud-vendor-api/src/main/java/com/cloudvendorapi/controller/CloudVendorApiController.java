package com.cloudvendorapi.controller;

import com.cloudvendorapi.model.CloudVendorModel;
import com.cloudvendorapi.service.CloudVendorApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiController {
    @Autowired
    private CloudVendorApiServiceImpl cloudVendorApiService;
    @GetMapping("{vendorId}")
    public ResponseEntity<Optional<CloudVendorModel>> getCloudVendorApiDetailsById(@PathVariable("vendorId") String vendorId){
        return new ResponseEntity<>(cloudVendorApiService.getCloudVendorDetailsById(vendorId), HttpStatus.OK);
    }

    @GetMapping("/allvendordetails")
    public ResponseEntity<List<CloudVendorModel>> getAllVendorDetails(){
        return new ResponseEntity<>(cloudVendorApiService.getAllCloudVendorDetails(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CloudVendorModel> postCloudVendorDetails( @RequestBody CloudVendorModel cloudVendorModel){
        return new ResponseEntity<>(cloudVendorApiService.createCloudVenderApi(cloudVendorModel), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CloudVendorModel> updatingCloudVendorDetails( @RequestBody CloudVendorModel cloudVendorModel, String vendorId){
        return new ResponseEntity<>(cloudVendorApiService.updateCloudVendorDetails(cloudVendorModel, vendorId), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{vendorId}")
    public ResponseEntity<String> deletingCloudVendorDetailsById(@PathVariable("vendorId") String vendorId){
        return new ResponseEntity<>(cloudVendorApiService.deleteById(vendorId), HttpStatus.OK);
    }
}
