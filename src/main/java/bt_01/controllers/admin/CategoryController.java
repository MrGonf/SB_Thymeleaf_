package bt_01.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bt_01.entity.Category;
import bt_01.models.CategoryModel;
import bt_01.services.CategoryService;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("")
	public String all(Model model) {
		
		List<Category> list = categoryService.findAll();
		model.addAttribute("list", list);
		
		return "admin/category/list";
	}
	@GetMapping("/add")
	public String add(Model model) {
		
		CategoryModel category = new CategoryModel();
		category.setIsEdit(false);
		model.addAttribute("category", category);
		
		return "admin/category/add";
	}
}
