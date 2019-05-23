
public class AnimalTest {
  public static void main(String[] args) {
	  
	  String[] namesList = new String[] {"Dog", "Cat", "Fish", "Bird"};
	  String[] sizeList = new String[] {"50kg", "20kg", "180kg", "5kg"};
	  String[] colourList = new String[] {"white","yellow","grey","black"};
	  for(int counter=0; counter<namesList.length ;counter++) {
		  Animal AnimalType = new Animal(namesList[counter], sizeList[counter], colourList[counter]);
		  System.out.println(AnimalType.name);
		  System.out.println(AnimalType.size);
		  System.out.println(AnimalType.colour);
		  System.out.println("\n");
	  }
	
  }
}
