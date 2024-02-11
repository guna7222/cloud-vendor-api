package com.cloudvendorapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    // payload
    @ExceptionHandler(value = {CloudVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(CloudVendorNotFoundException cloudVendorNotFoundException){
        CloudVendorApiException cloudVendorApiException = new CloudVendorApiException(cloudVendorNotFoundException.getMessage(), cloudVendorNotFoundException.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cloudVendorApiException,HttpStatus.NOT_FOUND)   ;
    }
}
