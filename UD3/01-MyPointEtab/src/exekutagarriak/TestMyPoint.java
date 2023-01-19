package exekutagarriak;
import model.MyPoint;
import java.util.ArrayList;
import java.util.Arrays;


public class TestMyPoint {

    public static void main(String[] args) {

        System.out.println("\na) Hiru Puntu Sortu:");
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);
        System.out.println(" p0 =>" + p0);
        System.out.println(" p1 =>" + p1);
        System.out.println(" p2 =>" + p2);
        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute.");
        }


        System.out.println("\nb) Distantziak koordenatu-jatorriarekiko:");
        System.out.println(" p0 =>" + p0.distance());
        System.out.println(" p1 =>" + p1.distance());
        System.out.println(" p2 =>" + p2.distance());

       

       
        System.out.println("\nb) Distantziak koordenatu-jatorriarekiko:");
        System.out.println(" p0 =>" + p0.distance());
        System.out.println(" p1 =>" + p1.distance());
        System.out.println(" p2 =>" + p2.distance());

        

        
        System.out.println("\nc) Distantziak euren artean:");
        System.out.println(" p0tik p1ra =>" + String.format("%6.2f", p0.distance(p1)));
        System.out.println(" p0tik p2ra =>" + String.format("%6.2f", p0.distance(p2)));
        System.out.println(" p1tik p2ra =>" + String.format("%6.2f", p1.distance(p2)));

       
       

        System.out.println("\nd) Sortu 10 puntuko array bat. Eta automatikoki bete:");
        MyPoint pArray[] = new MyPoint[10];

        for (int i = 0; i < 10; i++) {
            MyPoint pN = new MyPoint(i + 1, i + 1);
            pArray[i] = pN;
        }

        System.out.println(Arrays.toString(pArray));

       
       
       

        System.out.println("\ne) Sortu 100 puntuko arrayLista:");
        ArrayList<MyPoint> pArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            MyPoint pN = new MyPoint(i, i);
            pArrayList.add(pN);
        }

        System.out.println(pArrayList);



        System.out.println("\nf) Sortu ausazko 5 puntuko sorta (0-9 tartean). java.util.Random klasearen .nextInt() metodoa erabili dezakezu.");
        MyPoint pArrayRandom[] = new MyPoint[5];

        for (int i = 0; i < 5; i++) {
            MyPoint pN = new MyPoint((int) (Math.random() * (10)), (int) (Math.random() * (10)));
            pArrayRandom[i] = pN;
        }

        System.out.println(Arrays.toString(pArrayRandom));



        
}
}