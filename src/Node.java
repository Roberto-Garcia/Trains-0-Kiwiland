import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 7/10/11
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Node  {

    private String name;
    private Map<String,Integer> edges=new HashMap<String, Integer>();


    public Node (){

    }
    public Node (String name ) {
        this.name=name;
    }

    public void setName(String name){

        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setEdge(String city,int cost){
        this.edges.put(city, cost);
    }
    public int getCost(String city){
        return this.edges.get(city);
    }


}
