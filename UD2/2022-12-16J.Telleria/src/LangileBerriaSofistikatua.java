import java.util.ArrayList;
import java.util.Scanner;

/** Programa honek langile berri bat txertatuko du zerrendan. 
 * Hauek dira programak jarraituko dituen pausuak:
 * 1.- Langileen zerrenda eskuratu (metodo egokiari deituta)
 * 2.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 * 3.- Langile berria eskuratu (datuakEskatu metodoari deituta)
 * 4.- Langile berriaren emaila ez bada egokia (errepikatuta dagoelako) emaila ajustatu
 * 5.- Langilea zerrendan txertatu
 * 6.- Langileen zerrenda inprimatu (metodo egokiari deituta)
 */
public class LangileBerriaSofistikatua {
    private static ArrayList<Langilea> langileak;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        langileak = Langilea.getLangileenZerrenda();
        String izena, abizena, emaila, soldata;
        


        Langilea.langileakInprimatu(langileak);

        System.out.println("Langile berriaren izen abizenak idatzi espazioz banatuta:");
        izena = in.next();
        abizena = in.next();
        emaila= in.next();
        soldata= in.next();
        

        langileak.add(new Langilea(izena, abizena, emaila, soldata));

        Langilea.langileakInprimatu(langileak);

        in.close();
        
    }

    /** Metodo honek langile berri baten datuak eskatzen dizkio erabiltzaileari.
     * Ez badu soldata zenbakitan, behar bezala sartzen, 1200eko soldata asignatuko zaio.
     * 
     * @return Langile berria
     */
    public static Langilea datuakEskatu() {
        Scanner in = new Scanner(System.in);
        //OSATU EZAZU METODO HAU
        return null;
    }

}
