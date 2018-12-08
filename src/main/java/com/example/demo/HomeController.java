package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @Autowired
    Employeerepository employeerepository;

    @RequestMapping("/")
    public String index(Model model){
        Employee employee = new Employee();
        employee.setName("Stephen Bullock");
        employee.setSsn("555-12-1234");

        Laptop laptop= new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("Latitude XL");

        employee.setLaptop(laptop);
        employeerepository.save(employee);
        model.addAttribute("employees", employeerepository.findAll());
        return "index";
    }

}
