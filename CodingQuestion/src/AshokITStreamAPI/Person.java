package AshokITStreamAPI;

import java.util.List;

public class Person {

	private Integer id;
	private String name;
	private String location;
	private Integer age;
	
	private List<Address> address;

	
	
	public Person(Integer id, String name, String location, Integer age, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.age = age;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", age=" + age + ", address="
				+ address + "]";
	}
	
	
	
	
}
