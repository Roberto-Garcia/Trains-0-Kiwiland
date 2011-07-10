import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.matchers.JUnitMatchers.containsString;


public class UserInterfaceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams(){
        System.setErr(new PrintStream(errContent));
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams(){
        System.setErr(null);
        System.setOut(null);
    }

    @Test
    public void checkWelcomeMessage(){

        UserInterface testInterface=new UserInterface();
        testInterface.start();

        assertEquals("Welcome to Trains-0-Kiwiland", outContent.toString());
        cleanUpStreams();

    }
    //@Test
    public void shouldPrintCompleted(){
        UserInterface testInterface=new UserInterface();
        testInterface.start();

        assertEquals("completed", outContent.toString());
        cleanUpStreams();
    }
}