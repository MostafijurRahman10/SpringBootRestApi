package restapi.SpringBootRestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restapi.SpringBootRestApi.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository  <Employee, Long> {

}
