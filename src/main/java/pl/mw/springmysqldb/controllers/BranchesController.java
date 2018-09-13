package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mw.springmysqldb.models.Branches;
import pl.mw.springmysqldb.repositories.BranchesRepository;

import java.util.List;

@RestController
@RequestMapping("branches")
public class BranchesController {

    @Autowired
    BranchesRepository branchesRepository;

    @GetMapping
    public List<Branches> getAll() {
        return branchesRepository.findAll();
    }
}
