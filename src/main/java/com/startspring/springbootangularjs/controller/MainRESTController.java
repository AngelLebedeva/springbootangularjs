package com.startspring.springbootangularjs.controller;

import com.startspring.springbootangularjs.dao.EmployeeDAO;
import com.startspring.springbootangularjs.model.Employee;
import com.startspring.springbootangularjs.model.EmployeeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Specialized version of the controller. It includes the @Controller annotation
 */
@RestController
public class MainRESTController {

    /**
     * Autowired annotation asks Spring in employeeDAO field to substitute value
     * Field employeeDAO
     * @see EmployeeDAO
     */
    @Autowired
    private EmployeeDAO employeeDAO;

    /**
     * Using the @RequestMapping annotation we indicate where to map it and what request it should catch a GET.
     * Use the @ResponseBody annotation to return the object as the body of the HTTP response
     * @return returns the entire list of employees
     */
    @RequestMapping(value = "/employees", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = employeeDAO.getAllEmployees();
        return list;
    }

    /**
     * Using the @RequestMapping annotation we indicate where to map it and what request it should catch a GET.
     * @param empId  - employee id
     * @return returns the view obtained by employee id
     */
    @RequestMapping(value = "/employee/{empId}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee getEmployee(@PathVariable("empId") Long empId) {
        return employeeDAO.getEmployee(empId);
    }

    /**
     * Using the @RequestMapping annotation we indicate where to map it and what request it should catch a POST.
     * @param empForm - employee data form
     * @return returns the added employee data
     */
    @RequestMapping(value = "/employee", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee addEmployee(@RequestBody EmployeeForm empForm) {

        System.out.println("(Service Side) Creating employee with empNo: " + empForm.getEmpNo());

        return employeeDAO.addEmployee(empForm);
    }

    /**
     * Using the @RequestMapping annotation we indicate where to map it and what request it should catch a PUT.
     * @param empForm -employee data form
     * @return returns updated employee data
     */
    @RequestMapping(value = "/employee", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee updateEmployee(@RequestBody EmployeeForm empForm) {

        System.out.println("(Service Side) Editing employee with Id: " + empForm.getEmpId());

        return employeeDAO.updateEmployee(empForm);
    }

    /**
     * Using the @RequestMapping annotation we indicate where to map it and what request it should catch a DELETE.
     * @param empId -employee id
     */
    @RequestMapping(value = "/employee/{empId}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("empId") Long empId) {

        System.out.println("(Service Side) Deleting employee with Id: " + empId);

        employeeDAO.deleteEmployee(empId);
    }

}
