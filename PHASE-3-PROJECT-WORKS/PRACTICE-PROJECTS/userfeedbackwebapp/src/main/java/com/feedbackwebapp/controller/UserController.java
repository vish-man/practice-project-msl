package com.feedbackwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feedbackwebapp.entity.User;
import com.feedbackwebapp.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository eRepo;
	
	@GetMapping({"/showUsers","/","/list"})
	public ModelAndView showUsers() {
		ModelAndView mav = new ModelAndView("list-users");
		List<User> list = eRepo.findAll();
		mav.addObject("users",list);
		return mav;
	}
	
	@GetMapping("/addFeedbackForm")
	public ModelAndView addFeedbackForm() {
		ModelAndView mav = new ModelAndView("add-feedback-form");
        User newUser = new User();
        mav.addObject("user", newUser);
        return mav;
	}
	
	@PostMapping("/saveFeedback")
    public String saveFeedback(@ModelAttribute User user) {
    	eRepo.save(user);
		return "redirect:/list";
      }
	
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long userId) {
		ModelAndView mav = new ModelAndView("add-feedback-form");
		User user = eRepo.findById(userId).get();
		mav.addObject("user",user);
		return mav;
	}
	
	@GetMapping("/deleteFeedback")
	public String deleteFeedback(@RequestParam Long userId) {
		eRepo.deleteById(userId);
		return "redirect:/list";
	}


}























