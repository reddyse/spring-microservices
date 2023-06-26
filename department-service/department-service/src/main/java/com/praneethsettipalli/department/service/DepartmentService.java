package com.praneethsettipalli.department.service;

import com.praneethsettipalli.department.entity.Department;
import com.praneethsettipalli.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.rmi.server.LogStream.log;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
