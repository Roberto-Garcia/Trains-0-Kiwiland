
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {


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
