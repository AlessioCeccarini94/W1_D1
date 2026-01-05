//Esercizio #3
//Implementare i seguenti metodi
//- perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
//- pariDispari che accetta un numero intero e restituisce O se il numero è pari e 1 se è dispari
//- perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile
//usare la formula di Erone)
//Scrivere un main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double sum=n1*2+n2*2;
        System.out.println(sum);

        int odd =sc.nextInt();
        int even=sc.nextInt();
        int sum2=even%2;
        int sum3=odd%2;
        System.out.println(sum2);
        System.out.println(sum3);

        double lato1=sc.nextDouble();
        double lato2=sc.nextDouble();
        double lato3=sc.nextDouble();

        double p=lato1+lato2+lato3;
        double semiP=p/2;

        double diff1= semiP-lato1;
        double diff2= semiP-lato2;
        double diff3= semiP-lato3;

        double areaAlquadrato= semiP*diff1*diff2*diff3;
        double area = Math.sqrt(areaAlquadrato);

        System.out.println(area);
    }
}
