package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.UserBean;


@Controller
public class UserController {

	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signup(Model model) {
		
		UserBean user = new UserBean();
		model.addAttribute("user",user);
		return "Signup";
		
	}
	
	@RequestMapping(value="/signupdata", method = RequestMethod.POST)
	public String signupdata(@ModelAttribute("user") @Validated UserBean userbean, BindingResult result, Model model,@RequestParam("imgs") MultipartFile file) {
		
		System.out.println(userbean.getFirstName());
		System.out.println(userbean.getLastName());
		System.out.println(userbean.getPassword());
		System.out.println(userbean.getRepassword());
		System.out.println(userbean.getGender());
		System.out.println(userbean.getHobbies());
		
		//System.out.println(result);
		model.addAttribute("user", userbean);
		
		String path="C:\\Users\\admin\\Desktop\\springnew\\workspace\\ismweb\\src\\main\\webapp\\resources\\images\\" ;
		int userId=7;
		String filename = file.getOriginalFilename(); 
		try {
			
			File f = new File(path,userId+"");
			f.mkdir();
			
			byte data[] = file.getBytes();
			FileOutputStream fos = new FileOutputStream(path+"\\"+userId+"\\"+filename);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(data);
			bos.flush();
			bos.close();


			System.out.println("hello.....") ;

			System.out.println("hello world") ;

<<<<<<< HEAD
System.out.println("hello world") ;
System.out.println("hello world") ;
System.out.println("hello world") ;
=======
		xdcfvgtyhbujikm,olp.;/'	
xcvbnm,.xcvbnm,.cxvbnm,./
>>>>>>> 8bae45b7740469c5b811fecc0f1d74054cca11dc
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		if (result.hasErrors()) {
			
			return "Signup";
		}
		else {
		
			return "RegistrationDetail";
			
		}
		
		
		
	}
	
}
