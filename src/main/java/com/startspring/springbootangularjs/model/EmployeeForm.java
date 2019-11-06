package com.startspring.springbootangularjs.model;

/**
 * Class EmployeeForm with properties <b>empId</b>,<b>empNo</b>,<b>empName</b>,<b>empAddress</b> and <b>position</b>
 */
public class EmployeeForm {

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

    /**
     * Field value retrieval function {@link EmployeeForm#empId}
     * @return returns employee identification number
     */
    public Long getEmpId() {
        return empId;
    }

    /**
     * Employee Id determination procedure {@link EmployeeForm#empId}
     * @param empId - employee identification number
     */
    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    /**
     * Field value retrieval function {@link EmployeeForm#empNo}
     * @return returns employee number
     */
    public String getEmpNo() {
        return empNo;
    }

    /**
     * The procedure for determining the assigned employee serial number {@link EmployeeForm#empNo}
     * @param empNo - employee number
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * Field value retrieval function {@link EmployeeForm#empName}
     * @return returns employee Name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Employee Name determination procedure {@link EmployeeForm#empName}
     * @param empName - employee Name
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * Field value retrieval function {@link EmployeeForm#empAddress}
     * @return returns employee address
     */
    public String getEmpAddress() { return empAddress; }

    /**
     * The procedure for determining the home address of an employee {@link EmployeeForm#empAddress}
     * @param empAddress - employee home address
     */
    public void setEmpAddress(String empAddress) { this.empAddress = empAddress; }

    /**
     * Field value retrieval function {@link EmployeeForm#position}
     * @return returns employee position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Employee position determination procedure {@link EmployeeForm#position}
     * @param position - employee position
     */
    public void setPosition(String position) {
        this.position = position;
    }
}