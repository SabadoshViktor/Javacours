package tel_ran.book.controller;

import tel_ran.book.data.ArrayTools;
import tel_ran.book.data.Book;

public class BookAppl {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setAuthor("Dostoevsky");
		book1.setTitle("Idiot");
		book1.setIsbn(77777);
		book1.setPages(400);
		
		//book1.display();
		
		
		Book book2 = new Book();
		book2.setAuthor("Stiven King");
		book2.setTitle("N");
		book2.setIsbn(35687);
		book2.setPages(547);
		
		//book2.display();

		Book book3 = new Book();
		book3.setAuthor("Allan Karr");
		book3.setTitle("How throw smoking?");
		book3.setIsbn(8965474);
		book3.setPages(245);
		
		//book3.display();
		
		Book book4 = new Book();
		book4.setAuthor("Tolstoy");
		book4.setTitle("War & Peace");
		book4.setIsbn(85412);
		book4.setPages(9854);
		
		//book4.display();
		
		/*String str1=book1.getAuthor();
		System.out.println(str1);*/
		
		Book arr1[]=new Book[4];
		arr1[0]=book1;
		arr1[1]=book2;
		arr1[2]=book3;
		arr1[3]=book4;
		
		ArrayTools.printArray(arr1);
	}

}
