package com.vcubeprojects;

public class Movie {
	String moviename;
	int releasedYear;
	int ticketPrice;

	void show() {

		System.out.println("Moviename: " + moviename);
		System.out.println("Releasedyear: " + releasedYear);
		System.out.println("Ticketprice: " + ticketPrice);

	}

	public static void main(String[] args) {
		Movie n = new Movie();
		n.moviename = "peddi";
		n.releasedYear = 2026;
		n.ticketPrice = 300;
		n.show();

		Movie y = new Movie();
		y.moviename = "puspha: the rise";
		y.releasedYear = 2022;
		y.ticketPrice = 250;
		y.show();

		Movie p = new Movie();
		p.moviename = "OG";
		p.releasedYear = 2025;
		p.ticketPrice = 250;
		p.show();

	}

}
