public class TestZatikia {
    public static void main(String[] args) {
        Zatikia z1 = new Zatikia(4, 5);
        System.out.println(z1);
        Zatikia z2 = new Zatikia(3, 9);
        System.out.println(z2);
       System.out.println(z1 + "*" + z2 + "=" + Zatikia.batu(z1, z2));
    }
    
}
