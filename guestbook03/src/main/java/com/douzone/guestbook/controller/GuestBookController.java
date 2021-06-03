package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestBookRepository;
import com.douzone.guestbook.vo.GuestBookVo;

@Controller
public class GuestBookController {

	@Autowired
	private GuestBookRepository gusetBookRepository;
	
	@RequestMapping({"","/"})
	public String index(Model model) {
		List<GuestBookVo> list = gusetBookRepository.findAll();
		model.addAttribute("list",list);
		
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/add")
	public String add(GuestBookVo vo) {
		gusetBookRepository.insert(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{no}")
	public String delete(@PathVariable Long no, Model model) {
		model.addAttribute("no",no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(int no, String password) {
		
		GuestBookVo vo = gusetBookRepository.findById(no);
		if(vo.getPassword().equals(password)) {
			gusetBookRepository.deleteById(no);
			return "redirect:/";
		}else {
			return "redirect:/delete"+"/"+no;
		}		
	}
}