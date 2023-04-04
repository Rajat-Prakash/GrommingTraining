package org.example.Treemap;

import org.example.Treemap.Employee;
import org.example.Treemap.SortByEmployeeId;

import java.util.Map;

public class SortDesc {
    public static void main(String[] args) {
        Map<Employee,Integer> treeMap=new java.util.TreeMap<>(new SortByEmployeeId());
        treeMap.put(new Employee(657,"Rajat"),1);
        treeMap.put(new Employee(658,"Rohit"),2);
        treeMap.put(new Employee(651,"Raffsst"),3);
        treeMap.put(new Employee(659,"Rajasxsdt"),4);
        treeMap.put(new Employee(690,"Rsadadfajat"),5);

        for(Map.Entry<Employee,Integer> entry:treeMap.entrySet()){
            System.out.println(entry.getKey().getEmployeeId() + "  "+entry.getKey().getName());
        }
    }
}
