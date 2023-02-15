package org.sergeyneuymin.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {
        Employee employee = new Employee();
        employee.setName("Sergey");
        employee.setSurname("Neuymin");
        employee.setSalary("100000");
        model.addAttribute(employee);
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }


//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest httpServletRequest, Model model) {
//        String name = httpServletRequest.getParameter("employeeName");
//        name = "Mr. " + name;
//        model.addAttribute("nameAttribute",name);
//        model.addAttribute("description"," - Coder");
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam(name = "employeeName") String name, Model model) {
//        name = "Mr. " + name;
//        model.addAttribute("nameAttribute",name);
//        model.addAttribute("description"," - Coder");
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
         // String name = employee.getName();
         // employee.setName("Mr. " + name);

          if(bindingResult.hasErrors()) {
              return "ask-emp-details-view";
          } else {
              return "show-emp-details-view";
          }

//        model.addAttribute("nameAttribute",name);
//        model.addAttribute("description"," - Coder");

    }

}
