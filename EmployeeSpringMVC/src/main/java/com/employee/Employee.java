package com.employee;

import org.springframework.stereotype.Component;


@Component
public class Employee {

    private int EmpId;
    private String name;
    private String designation;
    private double salary;
    private String Address;
    private String BloodGroup;
    private  double PF;
    private int NoOFLeaves;
    private String ProjectAssigned;


    public Employee() {
    }

    public Employee(int empId, String name, String designation, double salary, String address, String bloodGroup, double PF, int noOFLeaves, String projectAssigned) {
        EmpId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        Address = address;
        BloodGroup = bloodGroup;
        this.PF = PF;
        NoOFLeaves = noOFLeaves;
        ProjectAssigned = projectAssigned;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public int getNoOFLeaves() {
        return NoOFLeaves;
    }

    public void setNoOFLeaves(int noOFLeaves) {
        NoOFLeaves = noOFLeaves;
    }

    public String getProjectAssigned() {
        return ProjectAssigned;
    }

    public void setProjectAssigned(String projectAssigned) {
        ProjectAssigned = projectAssigned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", Address='" + Address + '\'' +
                ", BloodGroup='" + BloodGroup + '\'' +
                ", PF=" + PF +
                ", NoOFLeaves=" + NoOFLeaves +
                ", ProjectAssigned='" + ProjectAssigned + '\'' +
                '}';
    }
}
