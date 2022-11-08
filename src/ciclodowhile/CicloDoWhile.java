

package ciclodowhile;
import java.util.Scanner; //si utilizamos el metodo de entrada scanner importamos la libreria java.util.Scanner;

public class CicloDoWhile {

    
    public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
       int n ;//numero
       int c = 0;//contador
        System.out.println("Ingrese un numero:");
       n =entrada.nextInt();//recibe con la variable n el numero del usuario y con el objeto entrada recibe el entero
        while (c<n) {                 //tenemos la condicion decimos que c no puede ser mayor al numero n veces a repetir
            
            System.out.println(c+".");// imprime la variable c
            c++;        //contador suma las veces
        }
    }
    
}
