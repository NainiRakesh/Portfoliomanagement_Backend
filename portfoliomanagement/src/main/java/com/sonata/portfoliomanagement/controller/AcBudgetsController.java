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

import com.sonata.portfoliomanagement.Interface.AcBudgetsRepository;
import com.sonata.portfoliomanagement.model.AcBudgets;



@RestController
@RequestMapping("/acbudgets")
public class AcBudgetsController {
	
    @Autowired
    private AcBudgetsRepository Acbudgetsrepo;
    
    
    @GetMapping("/get")
    public ResponseEntity<List<AcBudgets>> getAllData() {
        List<AcBudgets> acbudgets = Acbudgetsrepo.findAll();
        return ResponseEntity.ok(acbudgets);
    }
    @PostMapping("/create")
    public ResponseEntity<AcBudgets> createAcBudgets(@RequestBody AcBudgets acBudgets) {
        AcBudgets createdAcBudgets = Acbudgetsrepo.save(acBudgets);
        return new ResponseEntity<>(createdAcBudgets, HttpStatus.CREATED);
    }
    

	

}
