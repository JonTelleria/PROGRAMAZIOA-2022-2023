public class HiruLaukiSortu {
    public static void main(String[] args) {
        Laukia l1 = new Laukia(7, 1);
        System.out.println(l1);
        System.out.printf("l1 mota: %s\n", l1.getMota());

        Laukia l2 = new Laukia(2, 2);
        System.out.println(l2);
        System.out.printf("l2 mota: %s\n", l2.getMota());

        Laukia l3 = new Laukia(2, 6);
        System.out.println(l3);
        System.out.printf("l3 mota: %s\n", l3.getMota());

        
        System.out.printf("Hona marrazkia beteta:\n");
        l1.marraztuBeteta();
    }

}
