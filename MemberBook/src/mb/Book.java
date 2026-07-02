package mb;

public class Book {
	private String title;

	private Member mbr;

	public Book(String title) {
		super();
		this.title = title;
	}

	
	public void status() {
		if (mbr == null)

		{
			System.out.println(title + "not issued to any member");
		} else {
			System.out.println(title+"is not issued to "+mbr);
		}
	}

}
