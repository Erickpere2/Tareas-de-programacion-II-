
package tabla_de_multiplicar_de_un_numero;

import java.util.Scanner;


public class tabla_de_multiplicar_de_un_numero {

    
    public static void main(String[] args) {
Scanner obtenerNumero = new Scanner(System.in);
int numero,i,j;

System.out.print("indica la tabla de multiplicar: ");
numero = obtenerNumero.nextInt();


for(j = 1; j <= 10; j++)
{
System.out.println(numero + " X " + j + " = " + numero*j);
}
System.out.println();

}
}