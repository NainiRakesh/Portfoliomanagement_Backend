package com.sonata.portfoliomanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sonata.portfoliomanagement.Interface.DataEntryRepository;
import com.sonata.portfoliomanagement.model.DataEntry;

@RestController
@RequestMapping("/dataentry")
public class DataEntryController {

	
    @Autowired
    private DataEntryRepository DataEntryrepo;
    
    
    @GetMapping("/get")
    public ResponseEntity<List<DataEntry>> getAllData() {
        List<DataEntry> dataentry = DataEntryrepo.findAll();
        return ResponseEntity.ok(dataentry);
    }
    @PostMapping("/create")
    public ResponseEntity<DataEntry> createAcBudgets(@RequestBody DataEntry dataEntry) {
    	DataEntry createdDataEntry = DataEntryrepo.save(dataEntry);
        return new ResponseEntity<>(createdDataEntry, HttpStatus.CREATED);
    }
}
