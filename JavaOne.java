import java.util.Arrays;
import java.util.Scanner;


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

         int number = 16;

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

        System.out.println("La Media dei numeri interi minori uguali a " + number + " è: " + media);
        System.out.println("La Media dei numeri pari minori uguali a " + number + " è: " + mediaPari);
        System.out.println("La Media dei numeri dispari minori uguali a " + number + " è: " + mediaDispari);
        System.out.println("Le Tre Medie coincidono nel caso di numeri dispari.\n");
    


    // 3) Programma che stampa solo gli elementi di indice pari di un array 

    String[] names = {"Frodo", "Sam", "Legolas", "Gimli", "Merry", "Pippin", "Gandalf", "Aragorn", "Boromir"};

    System.out.println("\nProgramma che stampa solo gli elementi di indice pari di un array:");

    System.out.println("Array: " + Arrays.toString(names));

    for (int i = 0; i < names.length; i++) { 
        if (i % 2 == 0) {
            System.out.println(names[i]);
        }
    }
    
     System.out.println("\n");



    //  4) Programma che stampa l'elemento più grande di un array di numeri 

     System.out.println("\nProgramma che stampa l'elemento più grande di un array di numeri:");
    double[] numbers = {4.5, 6.12, 11.8, 9.7, 0.6, -1.2};
    double max = numbers[0];
    System.out.println("Array: " + Arrays.toString(numbers));

    for (double numb : numbers) {
        if (numb > max) {
            max = numb;
        }
    }

    System.out.println("L'elemento più grande dell'array è: " + max);


    // Alternativamente: 
    System.out.println("\nMetodo alternativo: ordinamento dell'array e stampa dell'elemento più grande:");
    Arrays.sort(numbers);
    System.out.println("Array ordinato: " + Arrays.toString(numbers));
    System.out.println("L'elemento più grande dell'array è: " + numbers[numbers.length - 1] + "\n");




    // 5) Creare un programma che chiede un numero all'utente per poi dichiarare un array con lunghezza pari al numero inserito.Successivamente riempire l'array chiedendo quali numeri inserire all'utente per poi calcolarne la sommatoria
     
    System.out.println("\nProgramma che crea un array dinamicamente in base all'input utente:");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quanti numeri vuoi inserire nell'array? ");
    int array_length = scanner.nextInt();
    double[] array = new double[array_length];

    System.out.println("Inserisci i numeri nell'array (usa la virgola per i decimali):");
    int cont = 0;
    
    // ciclo per inserire i numeri nell'array
    while (cont<array_length) {
       System.out.print("Inserisci il " + (cont+1) + "o numero:");
       array[cont] = scanner.nextDouble();
       cont++;
    }

     System.out.println("Array inserito: " + Arrays.toString(array));
     
     double sommatoria = 0 ;
     for (int i=0; i<array_length; i++ ) {
        
        sommatoria += array[i];

     }
     System.out.println("La somma degli elementi dell'array è: " + sommatoria + "\n");

    scanner.close();



    // 6) Extra: Controllare se una stringa è palindroma

     System.out.println("\nProgramma che controlla se una stringa è palindroma (eventuali spazi vengono rimossi, metodo case sensitive):");
    String string = "i topi non avevano nipoti";

    // rimuoviamo gli spazi della stringa
    String stringWithoutSpaces = string.replace(" ", "");


    // controlliamo se i caratteri in posizione speculare sono uguali, se non lo sono allora la stringa non è palindroma 
    boolean isPalindrome = true;
    for (int i = 0; i < stringWithoutSpaces.length(); i++) {
        if  (stringWithoutSpaces.charAt(i) != stringWithoutSpaces.charAt(stringWithoutSpaces.length() - 1 - i)) {
            isPalindrome = false;
             break;
        }
    }

    if (isPalindrome==true) {
        System.out.println("La stringa \"" + string + "\" è palindroma\n");
    } else {
       System.out.println("La stringa \"" + string + "\" non è palindroma\n");

    }



    // 7) Extra: Creare un programma che controlla se ci sono due vocali ripetute consecutivamente in una stringa
        System.out.println("\nProgramma che controlla se ci sono due vocali ripetute consecutivamente in una stringa:");
        String text = "Zootecnia"; 
        System.out.println("Stringa da controllare: " + text);
        
        // viene chiamata la funzione che controlla se ci sono due vocali uguali consecutive (la funzione è dichiarata più in basso)
        if (repeatedConsecutiveVowels(text)) {
            System.out.println("Risultato: La stringa contiene due vocali uguali consecutive.");
        } else {
             System.out.println("Risultato: La stringa NON contiene due vocali uguali consecutive.");
        }

  }

//   funzione che controlla se ci sono due vocali uguali consecutive in una stringa
   public static boolean repeatedConsecutiveVowels(String str) {
    
        // Conversione in minuscolo per rendere il controllo non case sensitive
        String stringaMinuscola = str.toLowerCase();
        
        // ciclo che controlla ogni carattere della stringa e il successivo per verificare se sono vocali uguali consecutive
        for (int i = 0; i < stringaMinuscola.length() - 1; i++) {
            char c = stringaMinuscola.charAt(i);
            char successivo = stringaMinuscola.charAt(i + 1);

            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && c == successivo) {
                return true;
            }

        }
        
        return false; 
    }


}