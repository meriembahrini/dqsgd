import java.util.Scanner;

public class application {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);  
       
       System.out.print("Entrez une chaîne de caractères : ");
       String str = keyboard.nextLine();
       System.out.println("Vous avez saisi : " + str);
       
       System.out.print("Entrez un entier : ");
       int number = keyboard.nextInt();
       System.out.println("Vous avez saisi l'entier : " + number);
       
       System.out.print("Entrez un nombre à virgule : ");
       double decimal = keyboard.nextDouble(); 
       System.out.println("Vous avez saisi le nombre à virgule : " + decimal);
       
       keyboard.close(); 

    }
}
