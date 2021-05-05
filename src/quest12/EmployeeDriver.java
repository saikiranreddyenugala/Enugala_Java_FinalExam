/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question12 : sai kiran reddy Enugala");
        
        Employee obj1 = new Employee(21,"sai",23000.0);
        Employee obj2 = new Employee(24,"kiran",34000.0);
        Employee obj3 = new Employee(26,"rohith",45000.0);
        Employee obj4 = new Employee(28,"gayle",54000.0);
        Employee obj5 = new Employee(30,"kohli",43000.0);
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(obj1);
        employees.add(obj2);
        employees.add(obj3);
        employees.add(obj4);
        employees.add(obj5);
        System.out.println("The List is ");
        for(Employee e : employees){
       
        System.out.println(e);
        }
        
        
        System.out.println("*********************************");
        System.out.println("list Sorted based on employee Id");
        Collections.sort(employees);
        printList(employees);
        System.out.println("*********************************");
        
        
        Collections.sort(employees, new Comparator<Employee>()
        {
            public int compare(Employee e1, Employee e2)
            {
                if(e1.getEmpSalary() < e2.getEmpSalary())
                    return -1;
                else if (e1.getEmpSalary() == e2.getEmpSalary())
                    return 0;
               else
                    return +1;
            }
        });
        
        System.out.println("list Sorted based on employee salary");
        for(Employee e : employees)
		{
			System.out.println(e);
		}
        
        System.out.println("*********************************");
        System.out.println("list sorted based up on employee name"); 
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } 
                else {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } 
                
            }
            
        });
        printList(employees);
        
                   
    }

    private static void printList(List<Employee> employees) {
        for(Employee e : employees){
            System.out.println(e); 
       }
    }
    
    
    
}
