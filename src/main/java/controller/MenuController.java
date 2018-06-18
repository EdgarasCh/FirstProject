package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Menu;
import service.MenuService;

@Controller
@RequestMapping("/")
public class MenuController {

	@Autowired
	public MenuService menuService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/nextPage")
	public String nextPage() {
		return "nextPage";
	}
	
	@GetMapping("/menus")
	//Model need for working between view and controller
	public String getAllMenus(Model model) {
		model.addAttribute("menus", menuService.getAll());
		return "menuList";
	}
	
	@GetMapping("/menu/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		model.addAttribute("menu", menuService.getById(id));
		return "showMenu";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("menu", menuService.getById(id));
		return "editMenu";
	}
	
	@PostMapping("/updateMenu")
	public String updateMenu(@ModelAttribute("menu") Menu menu) {
		menuService.update(menu);
		return "redirect:/menu/" + menu.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		menuService.delete(id);
		return "redirect:/menus";
	}

	@PostMapping("/addMenu")
	public String addMenu(@Valid Menu menu, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
            menuService.save(menu);
        }
        return "createMenu";
	}
	
	@GetMapping("/addMenu")
	public String createMenuPage(Model model) {
		model.addAttribute("menu", new Menu());
		return "createMenu";
	} 
	
}
