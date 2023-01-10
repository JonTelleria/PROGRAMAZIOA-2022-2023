public class Zatikia {
    private int zenb;
    private int izend;

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        zenb = zenbakitzailea;
        izend = izendatzailea;
    }

    public Zatikia() {
        zenb = ((int) (Math.random() * 10)) + 1;
        izend = ((int) (Math.random() * 10)) + 1;
    }

    public int getZenbakitzailea() {
        return zenb;
    }

    public int getIzendatzailea() {
        return izend;
    }

    public void setZenbakitzailea(int zenba) {
        this.zenb = zenba;
    }

    public void setIzendatzailea(int izenda) {
        this.izend = izenda;
    }

    public String toString() {

        return "Zatikia[" + zenb + "/" + izend + "]";

    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia biderketa = new Zatikia();
        biderketa.zenb = zat1.zenb * zat2.zenb;
        biderketa.izend = zat1.izend * zat2.izend;

        return biderketa;
    }
    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {
        Zatikia batura = new Zatikia();
        int batu1, batu2;

        batura.izend = zat1.getIzendatzailea() * zat2.getIzendatzailea();
        batu1 = (int) (batura.getIzendatzailea() / zat1.getIzendatzailea()) * zat1.getZenbakitzailea();
        batu2 = (int) (batura.getIzendatzailea() / zat2.getIzendatzailea()) * zat2.getZenbakitzailea();
        batura.zenb = batu1 + batu2;
        
        return batura;
    }

    public void batu(Zatikia besteZatikiBat) {
        this.zenb = this.zenb * besteZatikiBat.izend + besteZatikiBat.zenb * this.izend;
        this.izend = this.izend * besteZatikiBat.izend;
        
        
    }
    public double hamartarBaliokidea() {
        double baliokidea;

        baliokidea = zenb / izend;

        return baliokidea;

    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {

        boolean haundiagoa = false;

        if (this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()) {
            haundiagoa = true;
        }

        return haundiagoa;

    }

}

