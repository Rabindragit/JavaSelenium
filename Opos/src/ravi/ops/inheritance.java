package ravi.ops;

//Textual Representation how an object will look like in the memory
//whatever we write in class is in actual the property of object as we are describing the object 
//If you want anything which should belongs to class make it static!

class Product
{
	
	//attribute (state)
	//private int pid;
	
	int pid;
	String name;
	int price;
	
	//Constructor
	
	Product()
	{
		System.out.println("Product Object constructed");
	}

//Method (Behavior)
	
//To write in product we have this method
	
	void setProductDetails(int pid, String name, int price)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		System.out.println("Data written in Product Object");	
	}
	
//To read data from Product Object

	void showProductDetails() 
	{
		System.out.println("Product ID: "+pid);
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		
	
		
	System.out.println("------------------");
	}
//Setter
	
	void setPid(int pid) 
	{
		this.pid=pid;
		// this means reference to current object
		// LSH belongs to Object and RSH belongs to method
		
	}
	
	//getter
	int getPid() 
	{
		return pid;
		
	}
}

class Mobile extends Product 
{
//IS-A Relation, Mobile IS-A Product, Mobile is a child and Product is Parent
	
//Additional attribute of Mobile other than the Product
	
	String os;
	int ram;
	int sdCardsSize;
	Mobile()
	{
		System.out.println(">> Mobile object is constructred");
	}

//we have refined the same method from the parent into child with different inputs
//we have now 2 method in the child 1 is from parent and 1 is from child
//both are different as in based on inputs (even though name is same)
// METHOD OVERLOADING: Same method name with different inputs
	
	void setProductDetails(int pid, String name, int price,String os, int ram,int sdCardSize)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.os=os;
		this.sdCardsSize=sdCardSize;
		this.ram=ram;
		System.out.println("Data written in Product Object");	
   }

//Lets redefine showProductDetails as well
//But here we have same inputs
//2 methods, 1 from parent and 1 in child and we have signature!!
//Child method will be executed and not the parent method
//OVERRIDING : Same method Name with same inputs in Parent Child relationship
	
	void showProductDetails() 
	{
		System.out.println("Product ID: "+pid);
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("Os: "+os);
		System.out.println("RAM:\t"+ram);
		System.out.println("sdCard:\t"+ sdCardsSize);
	}
}

public class inheritance 
{
//main is executed by JVM when my program will run!
	
	public static void main(String[] args) 
	{
/*		
//Create an Object :Product
Product product1=new Product();//product1 is not an object its a reference variable which holds the hash code of the object in hexadecimal notation
//System.out.println("product1 is : "+product1); // we get 7852e922 as hash code so product is ref variable not an object 

// Writing data in object
product1.setProductDetails(101, "iPhone", 70000);


// Reading data from object

product1.showProductDetails();
System.out.println();

//lets write the data directory
Product product2 = new Product();
product2.setPid(208);
product2.name="NOKIA";
product2.price=40000;
product2.showProductDetails();
*/
	
// requesting to get Mobile Object Constructed	
		
		Mobile mobile =new Mobile();
	
//Product Object gets constructed before the Mobile Object 
// Parent Object gets constructed before child --Rule of inheritance
	
//mobile.setProductDetails(211, "IPhoneX", 19000);	
//mobile.showProductDetails();
		
		mobile.setProductDetails(707, "Pixel", 4000, "IOS", 4, 1000);
		mobile.showProductDetails();
	}
}





