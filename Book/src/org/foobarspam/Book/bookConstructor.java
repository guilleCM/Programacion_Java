package org.foobarspam.Book;

class bookConstructor {
	//Programa que crea instancias de Book
	public static void main(String[] args) {
	Book myBook = new Book("Harry Potter", 2001, 100);
	myBook.sell(200);
	System.out.println(myBook.title + "\n" + myBook.releaseYear + "\n" + myBook.copiesSold);
	}
}