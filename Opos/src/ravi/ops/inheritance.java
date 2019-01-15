package ravi.ops;

//Textual Representation how an object will look like in the memory
//whatever we write in class is in actual the property of object as we are describing the object 
//If you want anything which should belongs to class make it ststic!
class Product{
	
	//attribute (state)
	int pid;
	String name;
	int price;
	
	//Constructor
	Product(){
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
	void showProductDetails() {
		System.out.println("Product ID: "+pid);
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
	System.out.println("------------------");
	}
}
public class inheritance {
//main is executed by JVM when my program will run!
	public static void main(String[] args) {
		
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
product2.pid=201;
product2.name="Nokia";
product2.price=40000;
product2.showProductDetails();

	}

}

