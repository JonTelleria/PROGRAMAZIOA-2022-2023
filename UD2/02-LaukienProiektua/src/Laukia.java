public class Laukia {
    private int altuera;
    private int zabalera;
    

    
    public Laukia() { 
        altuera = 5;
        zabalera = 5;
    }

    public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        return zabalera * altuera;
    }

    public int getPerimetroa() {
        return (2 * altuera) + (2 * zabalera);
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;

    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;

    }

    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";

    }

    public String getMota() {
        if (zabalera == altuera) {
            return "Karratua";
        } else if (zabalera > altuera) {
            return "Horizontala";

        } else {
            return "Bertikala";
        }
    }

    public void marraztuBeteta() {
        int row, col;

        for (row = 0; row < getAltuera(); row++) {
            for (col = 0; col < getZabalera(); col++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
    }

    public void marraztuHutsik() {
        int row, col;

        for (row = 0; row < getAltuera(); row++) {
            for (col = 0; col < getZabalera(); col++) {
                if (row == 0 || row == getAltuera() - 1 || col == 0 || col == getZabalera() - 1) {
                    System.out.printf("* ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.printf("\n");
        }
    }
    public void marraztuBeteta(char ikurra){
        int row,col;

        for(row = 0; row < getAltuera(); row++){
            for(col = 0; col < getZabalera(); col++){
                System.out.print( ikurra + " ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
    }

    public String laukiBetea(){
        int row,col;
        String marrazkia="";

        for(row = 0; row < getAltuera(); row++){
            for(col = 0; col < getZabalera(); col++){
                marrazkia = marrazkia + "*";
            }
            marrazkia+= "\n";
        }
        return marrazkia;
    }}


