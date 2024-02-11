package com.cloudvendorapi.repository;

import com.cloudvendorapi.model.CloudVendorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorApiRepository extends JpaRepository<CloudVendorModel, String> {
}
