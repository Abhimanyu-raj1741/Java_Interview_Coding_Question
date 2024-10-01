package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroubByListOfEmployee {
   
	public static void main(String[] args) {
		EmployeeGroup gp1 = new EmployeeGroup("Amar","pune");
		EmployeeGroup gp2 = new EmployeeGroup("Raj","pune");
		EmployeeGroup gp3 = new EmployeeGroup("Neha","Mumbai");
		EmployeeGroup gp4 = new EmployeeGroup("Sam","Mumbai");
		
		
		List<EmployeeGroup> asList = Arrays.asList(gp1,gp2,gp3,gp4);
		
		Map<String, List<EmployeeGroup>> collect = asList.stream().collect(Collectors.groupingBy(EmployeeGroup::getCity));
		
		System.out.println(collect);
		
	}
}
