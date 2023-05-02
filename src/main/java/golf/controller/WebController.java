package golf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import golf.repository.CourseRepository;
import golf.beans.Course;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Apr 28, 2023
 */

@Controller
public class WebController {
	@Autowired
	CourseRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllCourses(Model model) {
		
		if (repo.findAll().isEmpty()) {
			return addNewCourse(model);
		}
		model.addAttribute("course", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputCourse")
	public String addNewCourse(Model model) {
		Course c = new Course();
		model.addAttribute("newCourse", c);
		return "input";
	}
	
	@PostMapping("/inputCourse")
	public String addNewCourse(@ModelAttribute Course c, Model model) {
		repo.save(c);
		return viewAllCourses(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateCourse(@PathVariable("id") long id, Model model) {
		Course c = repo.findById(id).orElse(null);
		model.addAttribute("newCourse", c);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseCourse(Course c, Model model) {
		repo.save(c);
		return viewAllCourses(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteCourse(@PathVariable("id") long id, Model model) {
		Course c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllCourses(model);
	}
}
