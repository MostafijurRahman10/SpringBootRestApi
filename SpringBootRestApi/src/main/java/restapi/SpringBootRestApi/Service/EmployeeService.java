package restapi.SpringBootRestApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import restapi.SpringBootRestApi.Model.Employee;
import restapi.SpringBootRestApi.Repository.EmployeeRepository;
import java.util.List;


public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepository;

    // CREATE
    public Employee createEmployee(Employee emp){
        return empRepository.save(emp);
    }

    // READ
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

    // DELETE
    public void deleteEmployee(Long empId) {
        empRepository.deleteById(empId);

//     // UPDATE
//      public Employee updateEmployee (Long empId, Employee employeeDetails){
//         Employee emp = empRepository.findById(empId).get();
//         emp.setFirstName(employeeDetails.getFirstName());
//         emp.setLastName(employeeDetails.getLastName());
//         emp.setEmailId(employeeDetails.getEmailId());
//            return empRepository.save(emp);
        }

    public Employee updateEmployee(Long id, Employee empDetails) {
        return null;
    }
}
