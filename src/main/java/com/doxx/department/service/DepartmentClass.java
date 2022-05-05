package com.doxx.department.service;

import org.springframework.stereotype.Service;
import com.doxx.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
}
