import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 in this project we will get the user information from the input file
 and store the information in output file
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("in_file.txt")); // creating object of Scanner class to get data from a file




        inFile.close(); // release the input file
    }
}