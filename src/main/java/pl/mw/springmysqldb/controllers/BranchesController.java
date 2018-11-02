package pl.mw.springmysqldb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mw.springmysqldb.domain.Branches;
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

    @GetMapping("/new")
    public String newBranch(Model model) {
        model.addAttribute("branch", new Branches());
        return "branches/branchForm";
    }

    @PostMapping
    public String saveOrUpdateBranch(Branches branch) {
        Branches newBranch = branchesRepository.save(branch);
        return "redirect:branches/" + newBranch.getId();
    }

    @GetMapping("/delete/{id}")
    public String deleteBranch(@PathVariable Integer id) {
        branchesRepository.deleteById(id);
        return "redirect:../../branches";
    }
}
