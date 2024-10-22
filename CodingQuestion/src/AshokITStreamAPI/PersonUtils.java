package AshokITStreamAPI;

import java.util.Arrays;
import java.util.List;

public class PersonUtils {

	public static List<Person> getCustomerData(){
		
		// Created the address class object
		Address homeAddress = new Address("1-2-3", " Abc Street" , "Hyderabad");
		Address officeAddress = new Address("3-2-1","XYZ Street", " Mumbai") ;
		
		// Creating the person class objects 
		Person p1 = new Person(1,"Abhimanyu","Dhanbad",24,Arrays.asList(homeAddress,officeAddress));
		Person p2 = new Person(2,"Shikha","Gadwa",22,Arrays.asList(homeAddress,officeAddress));
		Person p3 = new Person(3,"Satish","Hyderabad",23,Arrays.asList(homeAddress,officeAddress));
		Person p4 = new Person(4,"Rakesh","Jharia",21,Arrays.asList(homeAddress,officeAddress));
		Person p5 = new Person(5,"Rakesh","Katras",24,Arrays.asList(homeAddress,officeAddress));
		Person p6 = new Person(6,"Ankit","Ranchi",26,Arrays.asList(homeAddress,officeAddress));
		
		
		
		return Arrays.asList(p1,p2,p3,p4,p5,p6);
	}
}
