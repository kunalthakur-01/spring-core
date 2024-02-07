package com.springCore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22 + 11}") // expressions
	private int x;

	@Value("#{20 + 11}") // expressions
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(25) }") // invoked static method
	private double z;

	@Value("#{ T(java.lang.Math).PI }") // invoked static method
	private double e;

	@Value("#{ 5 < 6 }")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", isActive=" + isActive + "]";
	}
}
