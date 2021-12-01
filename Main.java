package ecomHomeWork011221;

// 1 class this bluePrint תבנית
// create object from bluePrint  
// 2 instance - new object of the class
// 3 - Type name=new Type();
public class Main {

	public static void main(String[] args) {

		
//4
 		Student a=new Student("John", 2);
		System.out.println(a);
		System.out.println(a.getName());
		System.out.println(a.getRoll_no());
// 5		
//		Average average=new Average();
//		System.out.println(average.avg());

//  6 		
		Cirlce c=new Cirlce(5.4);
		Cirlce c1=new Cirlce(8.7);
		c.printSize(c);
	    c1.printSize(c1);
// 7	    
	    Person me=new Person("123456", 1976, "rishon");
	    me.printHowOldAmI();
	    me.printAddress();
	    System.out.println(me.getAddress());
	}

}
