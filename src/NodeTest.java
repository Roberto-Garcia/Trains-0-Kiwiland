import junit.framework.TestCase;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class NodeTest extends TestCase {

    @Test
    public void testNodeTest(){

        Node testNode=mock(Node.class);
        when(testNode.getName()).thenReturn("A");

        assertEquals("A", testNode.getName());


    }

}
