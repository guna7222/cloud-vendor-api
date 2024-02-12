package com.cloudvendorapi.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class CustomResponseHandler {

    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpStatus, Object responseObject) {

        Map<String, Object> map = new HashMap<>();
        map.put("messge", message);
        map.put("HttpStatus", httpStatus);
        map.put("CloudVendorDetails", responseObject);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
