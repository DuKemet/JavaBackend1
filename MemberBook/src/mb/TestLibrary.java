package mb;

public class TestLibrary {
	public static void main(String[] args) {
		Book b1= new Book("The Alchemist");
		Book b2= new Book("The Kite Runner");
		
		Member m1= new Member("George");
		Member m2= new Member("Martha");
		
		b1.status();
		m1.status();
	}
}
d