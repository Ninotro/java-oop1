package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisca il suo nome per aprire un nuovo conto");
        String name= scan.nextLine();

        Conto conto1= new Conto(name);

        System.out.println(conto1.information());

        int answer = 0;

//        ora creiamo le 3 opzioni
        do {


            System.out.println("Se vuole versare una somma prema: 1, se vuole prelevare prema: 2 se vuole uscire prema 3");
            answer = scan.nextInt();

            if (answer==1) {

                System.out.println("digiti la somma da versare");
                int sommaDaVersare= scan.nextInt();
                    if (sommaDaVersare>0) {
                        conto1.addMoney(sommaDaVersare);
                        System.out.println("Il suo nuovo conto è:" + conto1.getCountMoney() + "Euro");

                    }

                     else {
                        System.out.println("Non può versare un numero negativo, prego riprovi");
                        }
            }

            if (answer == 2) {
                System.out.println("digiti la somma da prelevare");
                int sommaDaPrelevare= scan.nextInt();


                if ((sommaDaPrelevare <= conto1.getCountMoney()) && sommaDaPrelevare > 0 ) {
                    conto1.lessMoney(sommaDaPrelevare);
                    System.out.println("Il suo nuovo conto è : " +  conto1.getCountMoney());
                }
                else {
                    System.out.println("Mi dispiace, ha inserito dei dati non validi o non ha abbastanza soldi nel conto");
                }


            }

        }

        while (answer != 3 );




    }
}
