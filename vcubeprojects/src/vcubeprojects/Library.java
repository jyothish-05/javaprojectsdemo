package vcubeprojects;

public class Library {
		int book_id;
		String bookTitle;
		String authorName;
		int availablecopies;
		static String library_name;
		static String librarianName;
		
		void displayBookdetails() {
			System.out.println("book_id "+ book_id);
		    System.out.println("bookTitle "+bookTitle);
		    System.out.println("authorname "+authorName);
		    System.out.println("availablecopies "+availablecopies);
		}
	 void displaylibrarydetails() {
		System.out.println("library_name "+ library_name);
		System.out.println("librarianname " +librarianName);
	}
	 
	

	public static void main(String[] args) {
		
	}

}
