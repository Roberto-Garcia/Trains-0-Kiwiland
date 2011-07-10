import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class NodeTest extends TestCase {


    @Test
    public void testNodeNameSetter(){
        Node testNode=new Node("A");
        assertEquals("A", testNode.getName());
    }
    @Test
    public void testNodeEdge(){
        Node testNode=new Node("A");
        testNode.setEdge("B", 7);

        assertEquals(testNode.getCost("B"),7);
    }

}
