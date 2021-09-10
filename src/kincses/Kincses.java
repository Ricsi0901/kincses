
package kincses;


import java.util.Scanner;


public class Kincses {
        lada lada1 =new lada();
        lada lada2 =new lada();
        lada lada3 =new lada();
    lada[] ladak=new lada[3];
    private int szam;
    public static void main(String[] args) {
        Kincses kincses =new Kincses();
        kincses.letrehoz();
        kincses.kiir();
        kincses.kerdez();
        kincses.eldont();
    }
    public void letrehoz(){
        
        lada1.setString("Arany", "Én rejtem a kincset");
        lada2.setString("Ezüst", "Nem én rejtem a kincset");
        lada3.setString("Bronz", "Az arany hazudik");
        ladak[0]=lada1;
        ladak[1]=lada2;
        ladak[2]=lada3;
    }
    public void kiir(){
        for (int i = 0; i < ladak.length; i++) {
            System.out.println(i+":");
            System.out.println(ladak[i].getString());
        }
    }
    public void kerdez(){
        System.out.println("Szerinted melyikben van a kincs?");
        Scanner rnd =new Scanner(System.in);
        szam=rnd.nextInt();
    }public void eldont(){
        boolean eltalalta=false;
            do {   
                if(szam==2){
                eltalalta=true;
                    System.out.println("Gatulálok eltaláltad :D");
            }            
                else{
                    System.out.println("Sajnalom, nem sikerült probáld újra  ");
                    kerdez();
                }
            } while (!eltalalta);
    }
    
}
