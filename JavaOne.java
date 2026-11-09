public class JavaOne {

    public static void main(String[] args) {

        // 1)  Programma per controllsre se un numero è pari o dispari 

        int num = 11;

        System.out.println("\nProgramma per controllare se un numero è pari o dispari:");

        if (num % 2 == 0) {
             System.out.println(num + " è un numero pari.\n");
        } else {
             System.out.println(num + " è un numero dispari.\n");
         }


        //  2) Programma che calcola la media dei numeri minori uguali a un numero n, la media dei numeri dispari e dei numeri pari

         int number = 15;

        System.out.println("\nProgramma che calcola la media dei numeri interi minori uguali a un numero n, la media dei numeri dispari e dei numeri pari:");

        int somma = 0;
        int sommaPari = 0;  
        int sommaDispari = 0;
        int countPari = 0;  
        int countDispari = 0;


        for (int i = 1; i <= number; i++) {
            somma += i;
            if (i % 2 == 0) {
                sommaPari += i;
                countPari++;
            } else {
                sommaDispari += i;
                countDispari++;
            }
        }

        double media = (double) somma / (number);
        double mediaPari =  (double) sommaPari / countPari;
        double mediaDispari =  (double) sommaDispari / countDispari;

        System.out.println("La Media dei numeri interi minori uguali a " + number + ": " + media);
        System.out.println("La Media dei numeri pari: " + mediaPari);
        System.out.println("La Media dei numeri dispari: " + mediaDispari + "\n");
    }
}