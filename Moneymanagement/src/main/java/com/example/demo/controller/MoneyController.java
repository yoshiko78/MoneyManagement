package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Moneydata;
import com.example.demo.service.MoneyService;

@Controller
@RequestMapping("/Moneydata")
public class MoneyController {
	@Autowired
	private MoneyService moneyService;

	@GetMapping
	public String index (Model model) {
		List<Moneydata> moneydatas = moneyService.findAll();
		model.addAttribute("moneydatas", moneydatas);
		return "moneydatas/index";
	}

	@GetMapping("new")
	public String newMoneydata(Model model) {
		return "moneydatas/new";
	}

	@GetMapping("{id}/edit")
	public String edit(@PathVariable Integer id, Model model) {
		Moneydata moneydata = moneyService.findOne(id);
		model.addAttribute("moneydata",moneydata);
		return "moneydatas/edit";
	}

	@GetMapping("{id}")
	public String show (@PathVariable Integer id, Model model) {
		Moneydata moneydata = moneyService.findOne(id);
		model.addAttribute("moneydata", moneydata);
		return "moneydata/show";
	}

	@PostMapping
	public String create(@ModelAttribute Moneydata moneydata) {
		moneyService.save(moneydata);
		return "redirect:/moneydatas";
	}

	@PutMapping("{id}")
	public String update(@PathVariable Integer id, @ModelAttribute Moneydata moneydata) {
		moneydata.setId(id);
		moneyService.save(moneydata);
		return "redirect:/moneydatas";
	}

	@DeleteMapping("{id}")
	public String destroy(@PathVariable Integer id) {
		moneyService.delete(id);
		return "redirect:/moneydatas";
	}
}
