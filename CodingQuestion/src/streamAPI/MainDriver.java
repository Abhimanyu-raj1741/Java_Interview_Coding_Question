package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {
	
    /**
     * @param args
     */
    public static void main(String[] args) {
		
    	List<Employee> ls = new ArrayList<Employee>();
    	Employee e1= new Employee("Abc",21,10000);
    	Employee e2= new Employee("Pqr",26,12000);
    	Employee e3= new Employee("Mno",22,15000);
    	Employee e4= new Employee("Jkl",27,19000);
    	Employee e5= new Employee("Xyz",20,17000);
    	
    	ls.add(e1);
    	ls.add(e2);
    	ls.add(e3);
    	ls.add(e4);
    	ls.add(e5);
    	
    	System.out.println(ls);
    	List<Employee> incrementedSalary = ls.stream().map(e -> {
    		if(e.getAge()>25)
    		{
    			e.setSalary(e.getSalary()*1.10);
    		}
    		return e;
    	}).collect(Collectors.toList());
    	System.out.println(incrementedSalary);
    	for(Employee s : incrementedSalary)
    	System.out.println(s.getName()+ " "+s.getAge()+ " "+s.getSalary());
	}

}
