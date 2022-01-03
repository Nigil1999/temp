package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller


public class EmpController {
    @Autowired
    Employee employee;
    @RequestMapping("/")
    public String index()
    {
        return "index.jsp";
    }
    @RequestMapping("details")
    public ModelAndView empDetails(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
    {
        employee.setEmpId(Integer.parseInt(httpServletRequest.getParameter("empid")));
        employee.setName(httpServletRequest.getParameter("name"));
        employee.setDesignation(httpServletRequest.getParameter("designation"));
        employee.setSalary(Integer.parseInt(httpServletRequest.getParameter("salary")));
        employee.setAddress(httpServletRequest.getParameter("address"));
        employee.setBloodGroup(httpServletRequest.getParameter("bloodgroup"));
        employee.setNoOFLeaves(Integer.parseInt(httpServletRequest.getParameter("noofleaves")));
        employee.setPF(Integer.parseInt(httpServletRequest.getParameter("pf")));
        employee.setProjectAssigned(httpServletRequest.getParameter("projectassigned"));

        ModelAndView modelAndView=new ModelAndView("display.jsp");
        /*modelAndView.addObject("employee",employee);*/

        return modelAndView;
    }
}
