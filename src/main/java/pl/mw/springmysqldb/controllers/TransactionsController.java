package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mw.springmysqldb.repositories.TransactionsRepository;

import java.sql.Timestamp;

@Controller
@RequestMapping("transactions")
public class TransactionsController {

    @Autowired
    private TransactionsRepository transactionsRepository;

    @GetMapping
    public String listTransactions(Model model) {
        model.addAttribute("transactions", transactionsRepository.findAll());
        return "transactions/transactions";
    }

    @GetMapping("/{date}")
    public String selectedTransaction(@PathVariable Timestamp date, Model model) {
        model.addAttribute("transaction", transactionsRepository.findByDate(date));
        return "transactions/transactionValue";
    }
}