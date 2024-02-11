package com.cloudvendorapi.exception;

public class CloudVendorNotFoundException extends RuntimeException{

    public CloudVendorNotFoundException(String response){
        super(response);
    }

    public CloudVendorNotFoundException(String response, Throwable throwable){
        super(response, throwable);
    }
}
