   public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean isWireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    @Override
    public String toString() {
        return super.toString() + ", Colore: " + colore + ", Wireless: " + isWireless;
    }
}

