package day09_IfElseStatements;
import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select your language preference:\n1 - English, 2 - Spanish, 3 - Turkish, 4 - Russian, 5 - French");
        int selection = scan.nextInt();

        String language = (selection ==1) ? "Hello, thank you for calling!" : (selection == 2) ? "Hola, gracias por llamar!" : (selection == 3) ? "Merhaba, aradiginiz icin tesekkkurler!" : (selection == 4) ? "Privet, spasibo za vash zvonok" : (selection == 5) ? "Merci ,pour votre appel":"Invalid Selection";
        System.out.print(selection + ": " + language);
        scan.close();
    }
    }

/*3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel*/
