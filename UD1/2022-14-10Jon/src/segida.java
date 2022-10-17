import java.util.Scanner;
/**
 * Programa honek zenbaki oso positiboen segida inprimatuko du pantailan,
 * zenbakiak multzotan bananduz. Segidako zenbakirik handiena eta multzo baten
 * egongo diren zenbaki kopurua erabiltzaileari eskatuko zaizkio.
 */
public class segida {
   public static void main(String[] args) {

      int handiena, multzoak;

      Scanner in = new Scanner(System.in);
      System.out.print("Zein da imprimatu nahi duzun azken zenbakia?: ");
      handiena = in.nextInt();

      System.out.print("Zenbat zenbakiko multzoak nahi dituzu: ");
      multzoak = in.nextInt();

      in.close();

      for (int i = 1; i <= handiena; i++) {

         System.out.println(i);

         if (i % multzoak == 0) {
            System.out.println("=====");
         }

      }

   }
}
