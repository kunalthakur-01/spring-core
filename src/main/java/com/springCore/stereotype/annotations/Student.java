package com.springCore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // or @Component("student")
@Scope("prototype")
public class Student {

	@Value("kunal thakur") // set value of bean
	private String name;

	@Value("Jalandhar") // set value of bean
	private String city;

	@Value("#{temp}")  // set value of bean
	private List<String> address;

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
}
