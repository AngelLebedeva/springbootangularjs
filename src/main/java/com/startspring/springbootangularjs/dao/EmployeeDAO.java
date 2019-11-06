package com.startspring.springbootangularjs.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.startspring.springbootangularjs.model.Employee;
import com.startspring.springbootangularjs.model.EmployeeForm;
import org.springframework.stereotype.Repository;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


/**
 * The class is used to work with searching and storing data in our dictionary
 */
@Repository
public class EmployeeDAO {


    /**
     * create a new dictionary with the employee id key and employee data value
     */
    private static final Map<Long, Employee> empMap = new HashMap<Long, Employee>();
    /**
     * Static method
     */
    static {
        initEmps();
    }
    /**
     * Create a new employee object with all its parameters
     */
    private static void initEmps() {
        /**
         *  Create 5 new employee objects
         * @see Employee#Employee()
         */
        Employee emp1 = new Employee(1L, "E01", "Василий", "ул.Ленина д.17 кв.51","Водитель");
        Employee emp2 = new Employee(2L, "E02", "Мария", "ул.Смирнова д.12 кв.21", "Продавец");
        Employee emp3 = new Employee(3L, "E03", "Иван", "ул.Междуреченская д.1 кв.128", "Менеджер");
        Employee emp4 = new Employee(4L, "E04", "Максим", "ул.Сибревкома д.9 кв.336", "Менеджер");
        Employee emp5 = new Employee(5L, "E05", "Георгий", "ул.Большая д.65", "Грузчик");

        /**
         * Add an employees to our dictionary
         */
        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
        empMap.put(emp4.getEmpId(), emp4);
        empMap.put(emp5.getEmpId(), emp5);

    }

    /**
     * Method in which our set of keys is sorted
     * @return returns the maximum key value
     */
    public Long getMaxEmpId() {
        Set<Long> keys = empMap.keySet();
        Long max = 0L;
        for (Long key : keys) {
            if (key > max) {
                max = key;
            }
        }
        return max;
    }

    /** Method returns an object by its id
     * @param empId- employee identification number
     * @return returns employee data with the parameter id in our dictionary
     */
    public Employee getEmployee(Long empId) {
        return empMap.get(empId);
    }

    /**
     * The method adds a new employee to the form, assigns an ID to the employee and creates a new employee object
     * @param empForm - employee created form
     * @see EmployeeForm
     * Add a new employee with an identification number to the dictionary {@link EmployeeDAO#empMap}
     * @return returns a new object employee
     */
    public Employee addEmployee(EmployeeForm empForm) {
        Long empId= this.getMaxEmpId()+ 1;
        empForm.setEmpId(empId);
        Employee newEmp = new Employee(empForm);

        empMap.put(newEmp.getEmpId(), newEmp);
        return newEmp;
    }
    /**
     * The method allows you to update any employee data
     * @param empForm - employee created form
     * @return returns updated employee parameters
     * */
    public Employee updateEmployee(EmployeeForm empForm) {
        Employee emp = this.getEmployee(empForm.getEmpId());
        if(emp!= null)  {
            emp.setEmpNo(empForm.getEmpNo());
            emp.setEmpName(empForm.getEmpName());
            emp.setEmpAddress(empForm.getEmpAddress());
            emp.setPosition(empForm.getPosition());
        }
        return emp;
    }

    /**
     * Method allows you to remove an object from the dictionary
     * @param empId - employee identification number
     * */
    public void deleteEmployee(Long empId) {
        empMap.remove(empId);
    }

    /**
     * in the method we take the values of employees from our dictionary and create a new list of employees and add all the values
     * @return returns a list of all employees
     * */
    public List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }

}
