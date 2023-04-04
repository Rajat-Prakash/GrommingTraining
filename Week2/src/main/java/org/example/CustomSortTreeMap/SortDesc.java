package org.example.CustomSortTreeMap;

import org.example.Treemap.Employee;
import org.example.Treemap.SortByEmployeeId;

import java.util.Map;

public class SortDesc {
    public static void main(String[] args) {
        Map<Employee,Integer> treeMap=new java.util.TreeMap<>(new SortByEmployeeName());
        treeMap.put(new Employee(657,"Rajat"),1);
        treeMap.put(new Employee(658,"Rajat"),2);
        treeMap.put(new Employee(651,"Affsst"),3);
        treeMap.put(new Employee(659,"Jasxsdt"),4);
        treeMap.put(new Employee(690,"Dadfajat"),5);

        for(Map.Entry<Employee,Integer> entry:treeMap.entrySet()){
            System.out.println(entry.getKey().getEmployeeId() + "  "+entry.getKey().getName());
        }
    }
}
