import com.sun.xml.internal.ws.wsdl.writer.document.Message;

/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 7/10/11
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserInterface {

    public UserInterface(){

    }

    public void start(){
        printWelcomeMessage();
    }

    public String welcomeMessage(){
        String outMessage;
        outMessage="Welcome to Trains-0-Kiwiland" ;
        return outMessage;
    }

    public void printWelcomeMessage(){
        System.out.println(welcomeMessage());
    }

}
