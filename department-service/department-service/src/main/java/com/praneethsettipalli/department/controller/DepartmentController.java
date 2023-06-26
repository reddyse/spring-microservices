package com.praneethsettipalli.department.controller;

import com.praneethsettipalli.department.entity.Department;
import com.praneethsettipalli.department.service.DepartmentService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.rmi.server.LogStream.log;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

//    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentbyId(@PathVariable("id") Long departmentId){
        log("Inside findDepartment method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }

}
