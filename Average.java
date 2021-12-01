package ecomHomeWork011221;

import java.util.Scanner;

public class Average {
	
	private int a;
	private int b;
	private int c;
	public Average() {
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
public  double avg() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	double x=sc.nextDouble();
	System.out.println("enter number");
	double y=sc.nextDouble();
	System.out.println("enter number");
	double z=sc.nextDouble();
	
		double sum=x+y+z;
		 double avg=sum/3;
		return avg;
		
	}

}
