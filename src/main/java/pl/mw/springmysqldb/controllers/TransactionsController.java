package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mw.springmysqldb.models.Transactions;
import pl.mw.springmysqldb.repositories.TransactionsRepository;

import java.util.List;

@RestController
@RequestMapping("transactions")
public class TransactionsController {

    @Autowired
    private TransactionsRepository transactionsRepository;

    @GetMapping
    public List<Transactions> getAll() {
        return transactionsRepository.findAll();
    }
}