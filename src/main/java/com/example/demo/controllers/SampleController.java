package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;

@Controller
public class SampleController {

	@Value("${app.config.app-name}")
	private String appName;

	@Autowired
	ItemRepository itemRepository;

	@RequestMapping("/index")
	public String index(String testInput, Model model) {
		model.addAttribute("name", "鈴木");
		model.addAttribute("testInput", testInput);
		System.out.println("indexが呼ばれた");
		System.out.println("appName : " + appName);

		Iterable<Item> items = itemRepository.findAll();
		System.out.println(items.toString());
		for(Item i : items) {
			System.out.println(i.getId() + "," + i.getName());
		}

		return "index.html";
	}


}
