
public class Animal {
String name;
 String size;
 String colour;
 public Animal(String name, String size, String colour) {
	 this.name = name;
	 this.size = size;
	 this.colour = colour;
 }
 public String movementType() {
	 String movement ="";
	 if(this.name == "Dog") {
		 movement = "Walking";
		 
	 } if(this.name == "Cat") {
		 movement = "Walking";
		 
	 } if(this.name == "Bird") {
		movement = "Flying";
		 
	 } if(this.name == "Fish") {
		 movement = "Swimming";
		 
	 } 
	 return movement;
	 }
 
 
}
