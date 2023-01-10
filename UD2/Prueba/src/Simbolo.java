
public enum Simbolo {
    X('X'),
    O('O'),
    VACIO('-');

    private char simbolo;

    private Simbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

}