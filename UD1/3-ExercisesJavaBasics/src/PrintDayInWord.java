public class PrintDayInWord {
    public static void main(String[] args) {
        int number = 5;  // Set the value of "number" here!
   
        // Using nested-if
        if (number == 0) {   // Use == for comparison
           System.out.println( "LUNES" );
        } else if ( number == 1 ) {
            System.out.println( "MARTES" );
        } else if ( number == 2 ) {
            System.out.println( "MIERCOLES" );
        } else if ( number == 3 ) {
            System.out.println( "JUEVES" );
        } else if ( number == 4 ) {
            System.out.println( "VIERNES" );
        } else if ( number == 5 ) {
            System.out.println( "SABADO" );
        } else if ( number == 6 ) {
            System.out.println( "DOMINGO" );
        } 
          else {
                System.out.println( "NO ES UN DIA VALIDO" );
        }
   
        // Using switch-case-default
        switch(number) {
           case 0: 
              System.out.println( "LUNES" ); break;  // Don't forget the "break" after each case!
           case 1: 
              System.out.println( "MARTES" ); break;
           case 2: 
              System.out.println( "MIERCOLES" ); break; 
           case 3: 
              System.out.println( "JUEVES" ); break;
           case 4: 
              System.out.println( "VIERNES" ); break;  
           case 5: 
              System.out.println( "SABADO" ); break;
           case 6: 
              System.out.println( "DOMINGO" ); break;  
           default: System.out.println( "OTHER" ); 
        }
     }
}
