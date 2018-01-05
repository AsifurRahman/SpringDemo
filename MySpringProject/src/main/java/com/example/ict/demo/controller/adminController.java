package com.example.ict.demo.controller;
import com.example.ict.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class adminController{
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("---This  is hoome page---");
        model.addAttribute("message","Succeeded");

        List<Student> studentlist=new ArrayList<>();
        studentlist.add(new Student("Asif",'2',"ICT"));
        studentlist.add(new Student("Nasif",'3',"TE"));
        studentlist.add(new Student("Arif",'1',"ICT"));
        studentlist.add(new Student("Sifat",'4',"ICT"));
        model.addAttribute("studentList",studentlist);
        return "index";
    }
}



