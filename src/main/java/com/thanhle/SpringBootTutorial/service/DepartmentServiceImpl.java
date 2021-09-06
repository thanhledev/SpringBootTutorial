package com.thanhle.SpringBootTutorial.service;

import com.thanhle.SpringBootTutorial.entity.Department;
import com.thanhle.SpringBootTutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
