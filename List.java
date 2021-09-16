import java.io.*;
import java.util.*;
public class List{
    
    private static String list;
    
    static{
		try(BufferedReader reader = new BufferedReader(new FileReader("myExample.txt"))){
		    
		    list = reader.readLine();
		    
		}catch(IOException e ){ System.out.println("my error: " + e); }
    }
    
    public static String getList(){
        return list;
    }
}