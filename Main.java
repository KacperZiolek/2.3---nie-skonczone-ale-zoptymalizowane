
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random liczba = new Random();
    int tab[] = new int[5];
    for(int i = 0; i < 5; i++){
    tab[i] = liczba.nextInt(9);
    }


    for(int j = 0; j< 5; j++){
  System.out.println(tab[j]); 
  }

    for(int k = 0; k <5; k++){
   }
 }
}