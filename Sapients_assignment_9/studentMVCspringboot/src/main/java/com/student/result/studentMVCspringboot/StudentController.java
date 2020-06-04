package com.student.result.studentMVCspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class StudentController {
	@Autowired
	private StudentDao service;

	@GetMapping(path="/")
	public String showLoginPage(){
		return "studentResult";
	}
	@PostMapping(path = "/")
	public String getStuddentId(ModelMap model, @RequestParam String id) {
		int id1=Integer.parseInt(id);
		Student user=service.findOne(id1);
		
		 model.put("result",user );
	        return "studentResult";
}

}
