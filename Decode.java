//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
import java.lang.Thread;

public class Decode{
    
    public String decode(){

        Decomprese decomprese = new Decomprese();
        boolean check = true;
        String result = List.getList();
         //Pattern pattern = Pattern.compile("(\\(\\d+x\\d+\\)?)");

        do{
            result = decomprese.decode(result);

						check = false;

						for(int i =0; i<result.length(); i++)
							if(result.charAt(i) == '(')
								check = true;

            //Matcher matcher = pattern.matcher(result);

            //check = matcher.find();
            System.out.println(check);
     
						System.out.println(result.length());
						System.out.println();
        }while(check);
        
        return result;
    }

		private void checking(){

			System.out.print("checking");

			for(int i=0;i<10;i++){
				try{Thread.sleep(10);}catch(InterruptedException e){System.out.println("Do dupy"+e);}
				System.out.print(".");
			}
		}


}