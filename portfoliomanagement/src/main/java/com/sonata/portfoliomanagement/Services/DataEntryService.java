package com.sonata.portfoliomanagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.portfoliomanagement.Interface.AcBudgetsRepository;
import com.sonata.portfoliomanagement.model.AcBudgets;
import com.sonata.portfoliomanagement.model.DataEntry;

import jakarta.persistence.PostPersist;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class DataEntryService {

    @Autowired
    private AcBudgetsRepository acBudgetsRepository;

    // Method to automatically populate AcBudgets table when a new entry is added to DataEntry table
    @PostPersist
    public void populateAcBudgets(DataEntry dataEntry) {
        // Create a new AcBudgets entity
        AcBudgets acBudgets = new AcBudgets();
        acBudgets.setVertical(dataEntry.getVertical());
        acBudgets.setClassification(dataEntry.getClassification());
        acBudgets.setDeliveryManager(dataEntry.getDeliveryManager());
        acBudgets.setAccount(dataEntry.getAccount());
        acBudgets.setProjectManager(dataEntry.getProjectManager());
        acBudgets.setProjectName(dataEntry.getProjectName());
        acBudgets.setFinancialYear(dataEntry.getFinancialYear());
        acBudgets.setMonth(dataEntry.getMonth());
        acBudgets.setQuarter(dataEntry.getQuarter());
        // Set other properties similarly
        
        
        acBudgetsRepository.save(acBudgets);
    }
}


