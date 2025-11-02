package com.movieapp.client;
import java.util.*;
import com.movieapp.movie.Movie;

public class Client{
	public static void main(String[] args) {
		Movie[] movie = new Movie[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<5;i++) {
			System.out.println("Movie No." + i+1);
			System.out.println("Enter Movie ID: ");
			int movieId = sc.nextInt();

			sc.nextLine();
			System.out.println("Enter Movie Name: ");
			String movieName = sc.nextLine();
			System.out.println("Enter Movie Ticket Price: ");
			double ticketPrice = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Movie Director Name: ");
			String director = sc.nextLine();
			
			movie[i] = new Movie(movieId, movieName, ticketPrice, director);
			System.out.println("---------------------------------------");
		}
		
		System.out.println("-----Movies Details-----");
		for(int i=0;i<5;i++) {
			System.out.println("Movie " + i+1);
			System.out.println("Movie ID: " + movie[i].getMovieId());
			System.out.println("Movie Name: " + movie[i].getMovieName());
			System.out.println("Ticket Price: " + movie[i].getTicketPrice());
			System.out.println("Movie Director: " + movie[i].getDirector());
			System.out.println();
		}
	}
}
