package com.chandana.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandana.entities.address;

public interface IAddressPersistence extends JpaRepository<address, Long> {

}
