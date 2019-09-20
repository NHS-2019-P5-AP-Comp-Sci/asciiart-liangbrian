/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {

		System.out.println(" /\\   /\\");
		ears();
		ears();
		ears();
		ears();
		ears();
		skin();
		head();
		skin();
		body();
		body();
		body();
		hands();
		hands();
		hands();
		body();
		body();
		System.out.println("(       )OOO");
		body();
		body();
		skin();
		feet();
		message();

	}

	public static void ears() {

		System.out.println(" ||   ||");

	}

	public static void skin() {

		System.out.println("\"\"\"\"\"\"\"\"\"");

	}

	public static void head() {

		System.out.println("|       |");
		System.out.println("| () () |");
		System.out.println("|   O   |  I am the biggest chungus");
		System.out.println("|       |");

	}

	public static void body() {

		System.out.println("(       )");

	}

	public static void hands() {

		System.out.println("( O   O )");

	}

	public static void feet() {

		System.out.println("  O   O");
		System.out.println(" OO   OO");
		System.out.println("OOO   OOO");

	}

	public static void message() {
		System.out.println("\nACII art of Big Chungus but not as big");
	}
}