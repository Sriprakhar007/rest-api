package com.prakhar.rest_api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.prakhar.rest_api.model.CloudVendor;


@RestController
@RequestMapping("/cloudVendor")
public class CloudApiService {


    CloudVendor cloudvendor;
    @GetMapping("{vendorId}") // Use curly braces to specify it's a path variable
    public CloudVendor  getCloudVendorDetails(String vendorId) {
       return cloudvendor;
    }
    
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
    {
        this.cloudvendor = cloudvendor;
        return "Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
    {
        this.cloudvendor = cloudvendor;
        return "Updated Successfully";
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
    {
        this.cloudvendor = null;
        return "deleted Successfully";
    }
}

