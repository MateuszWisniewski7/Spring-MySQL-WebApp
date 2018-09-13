package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mw.springmysqldb.models.Customers;
import pl.mw.springmysqldb.repositories.CustomersRepository;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomersController {

    @Autowired
    CustomersRepository customersRepository;

    @GetMapping
    public List<Customers> getAll() {
        return customersRepository.findAll();
    }
}
