public class AddressCATest {
	
	public static void main(String[] args) {
		/*
		Create two objects of class AddressCA (make up some values for the city, street, and house number), 
		and assign references to them to variables addressLeah and addressRey. Call sameStreet method on one of them, passing another as a parameter. 
		If sameStreet returns true, your code should print:
		"Leah lives close to Rey!"
		*/

		AddressCA addLeah = new AddressCA(5, "Ocean Avenue", "Salinas");
		AddressCA addRey = new AddressCA(130, "Ocean Avenue", "Salinas");
		if (addLeah.sameStreet(addRey)) {
			System.out.println("Leah lives close to Rey");
		}
		
	}

}