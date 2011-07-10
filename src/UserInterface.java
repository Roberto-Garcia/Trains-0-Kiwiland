import java.util.Scanner;

public class UserInterface {

    private String fileName;

    public UserInterface(){

    }

    public void start(){
        printMessage(welcomeMessage());

       // NodeCreator creator=new NodeCreator(FileHandler inFile = new FileHandler(fileName));


    }

    public void handleUsersResponse(){
        Scanner scan =new Scanner(System.in);
        fileName=scan.next();

    }


    public String welcomeMessage(){
        String message="Welcome to Trains-0-Kiwiland" ;
        return message;
    }

    public String optionMessage(){
        String message ="";
        return  message;

    }

    public void printMessage(String Message){
        System.out.print(Message);
    }


}
