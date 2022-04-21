package libraryMain;

public class AdultUsers implements LibraryUser{
	
	int age;
	String bookType;
	
public void setAge(int age) {
	this.age = age;
}

public void setBookType(String bookType) {
	this.bookType = bookType;
}	
	
@Override
public void registerAccount() {
	if(age < 12) {
		System.out.println("Sorry, age must be greater than 12 to register as an adult.");
	} else {
		System.out.println("You have successfully registered under an Adult Account.");
	}
	
}

@Override
public void requestBook() {
	if(bookType == "Fiction") {
		System.out.println("Book issued successfully, please return the book within 7 days.");
	} else {
		System.out.println("Oops, you are allowed to take only adult fiction books.");
	}	
}

}
