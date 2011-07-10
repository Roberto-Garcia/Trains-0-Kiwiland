import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.matchers.JUnitMatchers.containsString;


public class UserInterfaceTest extends TestCase {

    @Test
    public void checkWelcomeMessage(){

        UserInterface testInterface=new UserInterface();

        assertEquals(testInterface.welcomeMessage(), containsString("welcome"));

    }

    @Test
    public void openInputFile(){



    }


}
