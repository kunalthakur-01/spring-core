package com.springCore.auto.wiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//******************we can write @Autowired at 1 or 2 or 3**********************

public class Employee {
//	1
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Employee() {
		super();
	}
	
//	2
//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

//	3
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
