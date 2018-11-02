package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mw.springmysqldb.domain.Customers;
import pl.mw.springmysqldb.repositories.BranchesRepository;
import pl.mw.springmysqldb.repositories.CustomersRepository;

@Controller
@RequestMapping("customers")
public class CustomersController {

    @Autowired
    CustomersRepository customersRepository;
    @Autowired
    BranchesRepository branchesRepository;

    @GetMapping
    public String listCustomers(Model model) {
        model.addAttribute("customers", customersRepository.findAll());
        return "customers/customers";
    }

    @GetMapping("/{id}")
    public String selectedCustomer(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customersRepository.getOne(id));
        return "customers/customer";
    }

    @GetMapping("/new")
    public String newCustomer(Model model) {
        model.addAttribute("customer", new Customers());
        model.addAttribute("branches", branchesRepository.findAll());
        return "customers/customerForm";
    }

    @PostMapping
    public String saveOrUpdateCustomer(Customers customer) {
        Customers newCustomer = customersRepository.save(customer);
        return "redirect:customers/" + newCustomer.getId();
    }
}
