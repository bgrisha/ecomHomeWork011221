package ecomHomeWork011221;

import java.util.Calendar;

public class Person {
	private String id;
	private int yearOfBirth;
	private String address;
	public Person(String id, int yearOfBirth, String address) {
		super();
		this.id = id;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}
	
	
	
	public String getAddress() {
		return address;
	}



	public void sayHello() {
		System.out.println("hello");
	}
	public void printHowOldAmI() {
		int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
		int age=CurrentYear-yearOfBirth;
		System.out.println(age+" years old.");
	}
	public void printAddress() {
		System.out.println("address is -> "+address);
	}
	

}
