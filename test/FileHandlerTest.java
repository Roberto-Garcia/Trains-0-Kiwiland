import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FileHandlerTest  {

    @Test
    public void shouldSetFileName(){
        FileHandler fileHandler =new FileHandler();
        fileHandler.setFileName("input.txt");
        assertEquals("input.txt", fileHandler.getFileName());
    }
    @Test
    public void ShouldReturnFile(){
       FileHandler reader = new FileHandler("input.txt");
       assertEquals("input.txt",reader.getFileName());
    }



}

