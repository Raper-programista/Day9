import java.lang.Thread;
public class Decomprese{
    
    private String list;
    private String result;
    
    public Decomprese(){}
    
    public String decode(String list){
        
        this.list = list;
        result = "";
        
        for (int i=0;i<list.length();i++){
            
            char sign = list.charAt(i);
            
            if(sign != '(') result +=sign;
            else{
                
                String marker = getMarker(++i);
                i += marker.length();
                i += addPart(marker, ++i);
            }
        }
        
        return result;
    }
    
    private int addPart(String marker, int index){
        
        String[] m = marker.split("x");
        int length = Integer.parseInt(m[0]);
        int amount = Integer.parseInt(m[1]);
        
        for (int i=0; i<amount; i++)
            result += list.substring(index, index+length);
            
        return length;
    }
    
    private String getMarker(int index){
        
        char sign = list.charAt(index);
        String marker = "";
        
        do{
            marker += sign;
            sign = list.charAt(++index);
            
        }while(sign != ')');
                    
        return marker;
        
    }
}