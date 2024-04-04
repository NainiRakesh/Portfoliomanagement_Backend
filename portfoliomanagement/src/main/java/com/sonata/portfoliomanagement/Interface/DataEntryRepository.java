package com.sonata.portfoliomanagement.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.portfoliomanagement.model.DataEntry;

public interface DataEntryRepository extends JpaRepository<DataEntry, Integer>{

}
