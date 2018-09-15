package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mw.springmysqldb.repositories.BranchesRepository;

@Controller
@RequestMapping("branches")
public class BranchesController {

    @Autowired
    BranchesRepository branchesRepository;

    @GetMapping
    public String listBranches(Model model) {
        model.addAttribute("branches", branchesRepository.findAll());
        return "branches/branches";
    }

    @GetMapping("/{id}")
    public String selectedBranch(@PathVariable Integer id, Model model) {
        model.addAttribute("branch", branchesRepository.getOne(id));
        return "branches/branch";
    }
}
