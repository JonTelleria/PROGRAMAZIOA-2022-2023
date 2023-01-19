package exekutagarriak;
import model.MyPoint;


public class TestEquals {

     public static void main(String[] args) {
           MyPoint p1 = new MyPoint(9, 7);
           MyPoint p2 = new MyPoint(7, 8);

         
           if (p1.equals(p2))  //Memorian leku desberdinetan gordetzen direlako.
                 System.out.println("Espazioko puntu berdina adierazten dute.");
            else
           System.out.println("Ez dute punto berdina adierazten.");
     }
    }