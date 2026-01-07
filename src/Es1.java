
//Esercizio #1
//Implementare i seguenti metodi:
//- moltiplica: accetta due interi e ritorna il loro prodotto
//- concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
//- inseriscilnArray: accetta un array di stringhe di cinque elementi ed una stringa e restituisca un array di sei elementi
// in cui la stringa passata sia al terzo posto e le stringhe precedentemente in quarta e quinta posizione
//siano rispettivamente in quinta e sesta.

public class Es1 {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 7;
        int sum = n1 * n2;
        System.out.println(sum);


        String str = "la somma è ";
        System.out.println(str + sum);

    }
    public static String[] array (String[] arr,String nuovo){
        String[] result =new String[6];
        String[] arr1=new String[5];
        String[] arr2= new String[6];
        arr2=arr1;
        arr2[3]="nuovo";

        return arr2;
    }
}