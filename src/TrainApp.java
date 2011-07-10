import java.util.Scanner;

public class TrainApp {

    public static void main (String [] args ){

        System.out.println("Enter the name of the input file:"); 					//user interface
		Scanner scan=new Scanner(System.in);
        String fileName=scan.next();
        System.out.println(fileName);


    }

}
