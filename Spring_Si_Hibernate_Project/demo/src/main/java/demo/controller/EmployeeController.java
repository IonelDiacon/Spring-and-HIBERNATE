package demo.controller;

import demo.model.Employee;
import demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee/{id}")
        public Employee get(@PathVariable int id){
        return employeeService.get(id);

        }
    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.get();
    }
    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj){
        employeeService.save(employeeObj);
        return employeeObj;
    }
@DeleteMapping("/employee/{id}")
    public List<Employee> delete(@PathVariable int id){
      employeeService.delete(id);
    return employeeService.get();
}
@PutMapping("/employee")
    public Employee update(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
}


}
