
    import java.util.ArrayList;
import java.util.Scanner;

    public class Carrello {
        public static void main(String[] args) {
            ArrayList<Prodotto> carrello = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            int scelta = 10;
            while (true) {
                System.out.println("Inserisci un prodotto nel carrello:");
                System.out.println("1. Smartphone");
                System.out.println("2. Televisore");
                System.out.println("3. Cuffie");
                System.out.println("10. Resoconto");

                scelta = scanner.nextInt();
                if (scelta == 10) {
                    break;
                }

                System.out.print("Inserisci il codice: ");
                int codice = scanner.nextInt();

                System.out.print("Inserisci il nome: ");
                String nome = scanner.next();

                System.out.print("Inserisci la marca: ");
                String marca = scanner.next();

                System.out.print("Inserisci il prezzo: ");
                double prezzo = scanner.nextDouble();

                System.out.print("Inserisci l'IVA: ");
                double iva = scanner.nextDouble();

                if (scelta == 1) {
                    System.out.print("Inserisci l'IMEI: ");
                    String imei = scanner.next();
                    System.out.print("Inserisci la quantità di memoria: ");
                    int memoria = scanner.nextInt();
                    carrello.add(new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria));
                } else if (scelta == 2) {
                    System.out.print("Inserisci le dimensioni: ");
                    int dimensioni = scanner.nextInt();
                    System.out.print("Il televisore è smart? (true/false): ");
                    boolean isSmart = scanner.nextBoolean();
                    carrello.add(new Televisori(codice, nome, marca, prezzo, iva, dimensioni, isSmart));
                } else if (scelta == 3) {
                    System.out.print("Inserisci il colore: ");
                    String colore = scanner.next();
                    System.out.print("Le cuffie sono wireless? (true/false): ");
                    boolean isWireless = scanner.nextBoolean();
                    carrello.add(new Cuffie(codice, nome, marca, prezzo, iva, colore, isWireless));
                } else {
                    System.out.println("Scelta non valida. Riprova.");
                }
            }

            System.out.print("Contenuto del carrello:");
            for (Prodotto prodotto : carrello) {
                System.out.println(prodotto.toString() + ", Prezzo con IVA: " + prodotto.getPrezzoConIva());
            }
        }
    }

