import java.util.HashMap;
import java.util.Map;


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
