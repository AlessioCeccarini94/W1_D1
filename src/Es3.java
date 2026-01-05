//Esercizio #3
//Implementare i seguenti metodi
//- perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
//- pariDispari che accetta un numero intero e restituisce O se il numero è pari e 1 se è dispari
//- perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile
//usare la formula di Erone)
//Scrivere un main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente

public class Es3 {
    public static void main(String[] args){
        double n1=10.5;
        double n2=15.7;
        double sum=n1*2+n2*2;
        System.out.println(sum);

        int odd =3;
        int even=8;
        int sum2=even%2;
        int sum3=odd%2;
        System.out.println(sum2);
        System.out.println(sum3);

        
    }
}
