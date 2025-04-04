package com.chandana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandana.entities.address;
import com.chandana.service.addressService;
@RestController
public class addressController {
@Autowired
addressService  addSrv;

@RequestMapping("/addresses")
public List<address> getAddress(){
	return addSrv.getAddress();
	
}

@PostMapping("/addresses")
public address createAddress(@RequestBody  address payload) {
	return addSrv.createAddress(payload);
}
}