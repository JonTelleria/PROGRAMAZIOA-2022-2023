import java.util.Scanner;

public class Gurutzea {
    public static void main(String[] args) throws Exception {
    
        int size = 0;
       
        
        
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the size "); 
        size = in.nextInt();                     

        in.close();

        for (int y = 1; y <= size; y++){
            
            for ( int x = 1; x <= size; x++){
                
                if((y == (size + 1) / 2) || (x == (size + 1) / 2)) 
                System.out.print("0 ");
                
                else{
                    System.out.print(". "); }
                
        
                }
                
            System.out.println("");
            
        } 
        }

        

    }
