        public class Televisori extends Prodotto {
        private int dimensioni;
        private boolean isSmart;

        public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean isSmart) {
            super(codice, nome, marca, prezzo, iva);
            this.dimensioni = dimensioni;
            this.isSmart = isSmart;
        }

        public int getDimensioni() {
            return dimensioni;
        }

        public boolean isSmart() {
            return isSmart;
        }

        @Override
        public String toString() {
            return super.toString() + ", Dimensioni: " + dimensioni + ", Smart: " + isSmart;
        }
    }

