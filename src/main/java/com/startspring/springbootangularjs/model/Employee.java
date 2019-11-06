package com.startspring.springbootangularjs.model;

/**
 * Class employee with properties <b>empId</b>,<b>empNo</b>,<b>empName</b>,<b>empAddress</b> and <b>position</b>
 * * @author Anzhelika Lebedeva
 * @version 2.1.6
 */
public class Employee {

    /** Employee id field */
    private Long empId;

    /** Employee Number field*/
    private String empNo;

    /** Employee Name field */
    private String empName;

    /** Employee Address field */
    private String empAddress;

    /** Field position */
    private String position;

    /** Constructor without parameters */
    public Employee() {
    }
    /**
     * Constructor - creating a new object
     * @param empForm- employee data form
     * @see Employee#Employee(Long, String, String, String, String)
     */
    public Employee(EmployeeForm empForm) {
        this.empId = empForm.getEmpId();
        this.empNo = empForm.getEmpNo();
        this.empName = empForm.getEmpName();
        this.empAddress= empForm.getEmpAddress();
        this.position = empForm.getPosition();
    }

    /**
     * Constructor - creating a new object with specific values
     * @param empId - employee identification number
     * @param empNo - employee number
     * @param empName - employee name
     * @param empAddress - employee address
     * @param position - employee position
     * @see Employee#Employee()
     */
    public Employee(Long empId, String empNo, String empName, String empAddress, String position) {
        this.empId = empId;
        this.empNo = empNo;
        this.empName = empName;
        this.empAddress= empAddress;
        this.position = position;
    }

    /**
     * Field value retrieval function {@link Employee#empId}
     * @return returns employee identification number
     */
    public Long getEmpId() {
        return empId;
    }

    /**
     * Employee Id determination procedure {@link Employee#empId}
     * @param empId - employee identification number
     */
    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    /**
     * Field value retrieval function {@link Employee#empNo}
     * @return returns employee number
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * The procedure for determining the assigned employee serial number {@link Employee#empNo}
     * @param empNo - employee number
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * Field value retrieval function {@link Employee#empName}
     * @return returns employee Name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Employee Name determination procedure {@link Employee#empName}
     * @param empName - employee Name
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * Field value retrieval function {@link Employee#empAddress}
     * @return returns employee address
     */
    public String getEmpAddress() { return empAddress; }

    /**
     * The procedure for determining the home address of an employee {@link Employee#empAddress}
     * @param empAddress - employee home address
     */
    public void setEmpAddress(String empAddress) { this.empAddress = empAddress; }

    /**
     * Field value retrieval function {@link Employee#position}
     * @return returns employee position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Employee position determination procedure {@link Employee#position}
     * @param position - employee position
     */
    public void setPosition(String position) {
        this.position = position;
    }

}