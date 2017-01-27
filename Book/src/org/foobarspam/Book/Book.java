package org.foobarspam.Book;

class Book {
	final static int DEFAULT_YEAR = 2014;
	final String title;
	final int releaseYear;
	int copiesSold;
	Book(String t) {
		title = t;
		releaseYear = DEFAULT_YEAR;
	}
	Book(String t, int r) {
		title = t;
		releaseYear = r;
	}
	Book(String t, int r, int s) {
		title = t;
		releaseYear = r;
		copiesSold = s;
	}
	void sell(int nrCopies) {
		copiesSold += nrCopies;
	}
	int getNumCopiesSold() {
		return copiesSold;
	}
}