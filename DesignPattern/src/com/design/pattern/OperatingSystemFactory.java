package com.design.pattern;

public class OperatingSystemFactory {
	public static OS getInstance(String osType) {
		OS osObj = null;
		switch (osType.toLowerCase()) {
		case "android":
			osObj = new Android();
			break;
		case "ios":
			osObj = new IOS();
			break;
		case "windows":
			osObj = new Windows();
			break;
		}
		return osObj;
	}
}
