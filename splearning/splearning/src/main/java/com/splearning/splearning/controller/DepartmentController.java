package com.splearning.splearning.controller;


import com.splearning.splearning.entity.Department;
import com.splearning.splearning.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);


    }
    @GetMapping("/departments/")
    public List<Department> getAllDepartment(){

        return departmentService.getAllDepartment();

    }
    @GetMapping("/departments/{id}")
    public Optional<Department> getAllDepartmentId(@PathVariable("id") Long departmentId){

        return departmentService.getAllDepartmentId(departmentId);

    }

    @GetMapping("/departments/name/{name}")
    public List<Department> getAllDepartmentId(@PathVariable("name") String departmentName){

        return departmentService.getAllDepartmentName(departmentName);

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department){

        return departmentService.updateDepartmentById(departmentId,department);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteByID(@PathVariable("id") Long departmentId){

        departmentService.deleteById(departmentId);
        return "Deleted Successfully";
    }

    //@RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String hello(){
        return "Hellooooooooo";
    }
}
