/**
 * 
 */
package com.demo.sprigboot2.SpringBoot2JPACRUDexample.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.springboot2.SpringBoot2JPACRUDexample.model.Employee;
/**
 * 
 * @author <a href="mailto:z_tel@encs.concordia.ca">Zankhanaben Patel</a>
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
