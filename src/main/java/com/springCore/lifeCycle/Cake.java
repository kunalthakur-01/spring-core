package com.springCore.lifeCycle;

public class Cake {
	private double price;

	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cake [price=" + price + "]";
	}

	public void init() {
		System.out.println("init method");
	}

	public void destroy() {
		System.out.println("destroy method");
	}
}
