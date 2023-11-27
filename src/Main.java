import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 in this project we will get the user information from the input file
 and store the information in output file
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("in_file.txt")); // creating object of Scanner class to get data from a file

        String firstName = inFile.next(); // getting the first name which is saad
        String lastName = inFile.next(); // getting the last name which is Ghazal
        int age = inFile.nextInt(); // getting the age which is 21
        String userJob = inFile.nextLine(); // getting the job title of the user

        PrintWriter outFile = new PrintWriter("out_file.txt"); // creating object of PrintWrite class which will hold the output text

        outFile.print("User First Name: "+firstName+"\nUser Last Name: "+lastName+"\nUser Age: "+age+ "\nUser Job Title"+ userJob.toUpperCase()); // print on the output file




        outFile.close();// you should close the outFile after using it to save the changes on it
        inFile.close(); // release the input file
    }
}