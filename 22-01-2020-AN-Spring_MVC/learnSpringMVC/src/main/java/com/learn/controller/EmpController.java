package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;  
  

import con.learn.model.Emp;

@Controller
public class EmpController {
	
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public String showForm(Model m) {
		m.addAttribute("command", new Emp());
		return "empform";
	}
	
	public String save(@ModelAttribute("emp") Emp emp){    
        dao.save(emp);    
        return "redirect:/viewemp";//will redirect to viewemp request mapping    
    }    
	
	@RequestMapping("/viewemp")    
    public String viewemp(Model m){    
        List<Emp> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "viewemp";    
    }
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") Emp emp){    
        dao.update(emp);    
        return "redirect:/viewemp";    
    }
 
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewemp";    
    } 

}
