package com.xfactor.lably.controllers;

import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import com.xfactor.lably.entity.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/customer")
public class CustomerController {

    ArrayList<Customer> customers=new ArrayList();

    @GetMapping()
    public String customer() {
        return "customer controller test!!!";
    }

    @PostMapping("/addCustomer")
    public Customer registerPost(@RequestBody Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        // Save admin to db
        customers.add(customer);
        return customer;
    }

    @GetMapping("/getAllCustomer")
    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> temp=new ArrayList();
        for(int i=0;i<5;i++)
        {
            temp.add(customers.get(i));
        }
        return temp;
    }

    @GetMapping("/getCustomerByName")
    public Customer getCustomerByName(@RequestParam String name) {
        Customer resCustomer = null;
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                resCustomer = customer;
            }
        }
        return resCustomer;
    }
    
    
}