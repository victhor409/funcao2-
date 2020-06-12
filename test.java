import java.util.Locale;
import java.util.Scanner;

public class test{
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in); 
         Locale.setDefault(Locale.US);

         System.out.println("Escreva o nome do produto: ");
         String name=sc.nextLine();
         
         System.out.println("Escreva o preco do produto: ");
         double preco=sc.nextDouble();

         Produto produto = new Produto(preco, name);
    


         System.out.println("Informacao do produto");
         System.out.println();
         System.out.println("Nome do produto: "+produto.getName());
         System.out.println("Preco do produto: "+produto.getPreco());
         

         sc.close();


    }

}

