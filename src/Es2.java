//Esercizio #2
//Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera e scrive
//in console la concatenazione delle stringhe in ordine di inserimento e in ordine di inserimento inverso.

import java.util.Scanner;

public class Es2 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        String str3= sc.nextLine();
        String completeString=str1+str2+str3;
        String reverseString=str3+str2+str1;
        System.out.println(completeString);
        System.out.println(reverseString);
    }
}
