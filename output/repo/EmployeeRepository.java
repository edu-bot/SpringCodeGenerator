package com.radicalz.persistence.repo;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.data.rest.core.annotation.RepositoryRestResource;import com.radicalz.persistence.model.Employee;@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")public interface EmployeeRepository extends JpaRepository<Employee, Integer>{}