package com.ustglobal.object_class;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public boolean equals (Object obj) {
		if(this==obj) {
			return true;
		}
		Employee E = (Employee) obj;
		if(this.id ==E.id) {
			if(this.name.equals(E.name)) {
				if(this.salary == E.salary) {
					return true;
				}
				else
					return false;
			}else 
				return false;
			
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
