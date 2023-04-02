package com.company.repository;

import com.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);

    // custom query using JPQL with index parameters
    @Query("select e from Employee e where e.firstName=?1 and e.lastName=?2")
    Employee findByJPQLWithIndexParams(String firstName, String lastName);

    // custom query using JPQL with named parameters
    @Query("select e from Employee e where e.firstName=:firstName and e.lastName=:lastName")
    Employee findByJPQLWithNamedParams(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // custom query using Native SQL with index parameters
    @Query(value = "select * from employees e where e.first_name=?1 and e.last_name=?2", nativeQuery = true)
    Employee findByNativeSQLWithIndexParams(String firstName, String lastName);

    // custom query using Native SQL with named parameters
    @Query(value = "select * from employees e where e.first_name=:firstName and e.last_name=:lastName", nativeQuery = true)
    Employee findByNativeSQLWithNamedParams(@Param("firstName") String firstName, @Param("lastName") String lastName);

}
