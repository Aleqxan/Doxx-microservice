package main.java.com.doxx.department.repository;

import org.springframework.stereotype.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    Departement findDepartmentId(Long departmentId);
}
