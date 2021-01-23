package com.adapter;

public class School {
	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		assignment.setPen(new PenAdapter());
		assignment.writeAssignment("Steganography");
	}
}
