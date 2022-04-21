package libraryMain;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kidOne = new KidUsers();
		KidUsers kidTwo = new KidUsers();
		
		kidOne.setAge(10);
		kidTwo.setAge(18);
		
		kidOne.registerAccount();
		kidTwo.registerAccount();
		
		kidOne.setBookType("Kids");
		kidTwo.setBookType("Fiction");
		
		kidOne.requestBook();
		kidTwo.requestBook();
		
		AdultUsers adultOne = new AdultUsers();
		AdultUsers adultTwo = new AdultUsers();
		
		adultOne.setAge(5);
		adultOne.setAge(23);
		
		adultOne.registerAccount();
		adultTwo.registerAccount();
		
		adultOne.setBookType("Kids");
		adultTwo.setBookType("Fiction");
		
		adultOne.requestBook();
		adultTwo.requestBook();
		
		

	}

}
