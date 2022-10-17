import java.util.Scanner;

public class Gurutzea {
    public static void main(String[] args) throws Exception {
    
        int size = 0;
        int x, y;
        
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        size = in.nextInt();                     

        in.close();

        for (y = 1; y <= size; y++){
            
            for ( x = 1; x <= size; x++){
                
                if ( (size + 1) %2 == x){
                System.out.print("O "); 
                if ( (size + 1) %2 == y ){
                    System.out.print("O "); 
                        
                }
                else{
                    System.out.print("."); }}
                else{
                System.out.print("."); 
            
                
        
                }
                
            System.out.println("");
            
        } 
        }

        

    }
}