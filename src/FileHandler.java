import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    private String inputFileName;
    private Scanner input=null;

    public FileHandler(){

    }

    public FileHandler(String name){
        setFileName(name);
        createFile(name);

    }

    public String getFileName(){
        return this.inputFileName;
    }

    public void setFileName(String name){
        this.inputFileName=name;
    }

    public File createFile(String name){

        File in = new File(name);
        try{
             input=new Scanner(in);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}


