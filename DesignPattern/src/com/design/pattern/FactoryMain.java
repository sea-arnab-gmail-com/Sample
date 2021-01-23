package com.design.pattern;

public class FactoryMain {
	public static void main(String[] args) {
		OS osObj = OperatingSystemFactory.getInstance("windows");
		osObj.spec();
	}
}
