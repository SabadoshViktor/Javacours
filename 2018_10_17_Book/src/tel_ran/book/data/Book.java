package tel_ran.book.data;

public class Book {
	
	//isbn це серійний номер книги
	private int isbn;
	private String title;
	private String author;
	private int pages;
	
	
	// it`s GETTERS `
	public int getIsbn () {
		return isbn;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	//it`s SETTER
	public void setIsbn(int isbn) {
		this.isbn=isbn;
	}
	public void setPages(int pages) {
		this.pages=pages;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void display() {
		System.out.println("Book:");
		System.out.println("Author is: "+author);
		System.out.println("Title is: "+title);
		System.out.println("ISBN is: "+isbn);
		System.out.println("Pages is: "+pages);
	}
	



}
