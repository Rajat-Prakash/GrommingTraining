package org.example.CustomSortTreeMap;

import org.example.Treemap.Employee;

import java.util.Comparator;

//Sort Treemap based on name and then employee id
public class SortByEmployeeName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        String p1=e1.getName(),p2= e2.getName();
        int comp=p1.compareTo(p2);
        if(comp==0) return e1.getEmployeeId()-e2.getEmployeeId();
        return comp;
    }
}
