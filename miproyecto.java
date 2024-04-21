 /* 
public class miproyecto {
	public static void main(String[] args) {
		System.out.println("hola mundo");
	}
}
*/

/* 
//tp 1, consigna 1
	public class miproyecto {
		public static void main(String[] args) {
			int valor= 5;
			double medida= 7.6;
			char caracter= 'e';
			boolean esAlto= true;
			System.out.println(valor);
			System.out.println(medida);
			System.out.println(caracter);
			System.out.println(esAlto);		
		}
	}*/
/* 
//consigna 2

	public class miproyecto {
		public static void main(String[] args) {
			double cambiar=0;
			final double num=1.0;
			System.out.println(cambiar + (num*2));
		}
	}*/
/* 
	//consigna 3 = no se para que pide una variable constante si no se usa.

import java.util.Scanner;

public class miproyecto {
		public static void main(String[] args) {
			final int num;
			 Scanner scanner = new Scanner(System.in);
			System.out.println("ingrese un valor");
			int numero = scanner.nextInt();
			System.out.println(numero);
		}
	}
*/
/* 
//consigna 4

import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("ingrese 5 valores distintos");
			int numero1 = scanner.nextInt();
			Scanner scanner2 = new Scanner(System.in);
			int numero2 = scanner.nextInt();
			int numero3 = scanner.nextInt();
			int numero4 = scanner.nextInt();
			int numero5 = scanner.nextInt();
			System.out.println(numero5 + " " + numero4 + " " + numero3 + " " + numero2 + " " +numero1);
	}
}*/
/* 
//consigna 5

import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese altura:");
        double altura = scanner.nextDouble();
		scanner.nextLine();
        System.out.println("Ingrese ocupacion:");
		String ocupacion = scanner.nextLine();		
        System.out.println(nombre + " " + edad + " " + altura + " " + ocupacion);
		}
}*/

/* 
//consigna 6
import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese tipo de factura");
		String tipoFactura = scanner.nextLine();
		System.out.println("ingrese numero de factura");
		int numeroFactura = scanner.nextInt();
		scanner.nextLine();
		System.out.println("ingrese nombre del cliente");
		String nombreCliente = scanner.nextLine();
		System.out.println("ingrese producto 1");
		String producto1 = scanner.nextLine();
		System.out.println("ingrese valor producto 1");
		double valorProducto1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("ingrese producto 2");
		String producto2 = scanner.nextLine();
		System.out.println("ingrese valor producto 2");
		double valorProducto2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("ingrese producto 3");
		String producto3 = scanner.nextLine();
		System.out.println("ingrese valor producto 3");
		double valorProducto3 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("ingrese producto 4");
		String producto4 = scanner.nextLine();
		System.out.println("ingrese valor producto 4");
		double valorProducto4 = scanner.nextDouble();
		scanner.nextLine();
		double total= valorProducto1 + valorProducto2 + valorProducto3 + valorProducto4;
		System.out.println("Factura" + "    " + tipoFactura + "    " + "N"+ numeroFactura);
		System.out.println("Nombre:"+" " + "" + nombreCliente);
		System.out.println("Producto" + "     " + "Precio");
		System.out.println(producto1 + "       " + valorProducto1);
		System.out.println(producto2 + "       " + valorProducto2);
		System.out.println(producto3 + "       " + valorProducto3);
		System.out.println(producto4 + "       " + valorProducto4);
		System.out.println("Importe total" + "     " + total );
	}
}*/

/* 
//Consiga 7

import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese valor 1");
		double valor1 = scanner.nextDouble();
		System.out.println("ingrese valor 2");
		double valor2 = scanner.nextDouble();
		System.out.println("ingrese valor 3");
		double valor3 = scanner.nextDouble();
		scanner.nextLine();
		double Resultado = ((valor1/valor2) - valor3);
		System.out.println("Resultado" + "  " + Resultado);
	}
}*/

/* 
//ejercicio 8

public class miproyecto {
	public static void main(String[] args) {
		
		System.out.println("Tabla de verdad OR");
		System.out.println("false or false es: " + (false || false) );
		System.out.println("false or true es: " + (false || true));
		System.out.println("true or true es: " + (true || true));
		System.out.println("true or false es: " + ( true || false));
		System.out.println("Tabla de verdad AND");
		System.out.println("false or false es: " + (false && false) );
		System.out.println("false or true es: " + (false && true));
		System.out.println("true or true es: " + (true && true));
		System.out.println("true or false es: " + ( true && false));
	}
}*/

/* 
//ejercicio 9 

import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		try{ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int numero = scanner.nextInt();
		double numDiv2 = ( (double) numero /2);
		System.err.println("Numero dividido dos es: " + numDiv2); 
		double numDiv3 = ((double) numero /3);
		System.err.println("Numero dividido tres es: " + numDiv3); 
		double numDiv4 = ((double) numero /4);
		System.err.println("Numero dividido cuatro es: " + numDiv4);
		} 
		catch (Exception exception){
			System.out.println(exception);
		}
	}
}*/


//ejercicio 10




/*tp ejercicio 1.e 
import java.util.Scanner;

public class miproyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char letra = scanner.next().charAt(0);
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("Es consonante");
        }
        scanner.close(); 
    }
} */

/* 
//tp 2 ejercicio 2

import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner anios = new Scanner(System.in);
		System.out.println("ingrese un numero del 1 al 12");
		int mes = scanner.nextInt();
	
		if (mes == 11 || mes == 4 || mes==6 || mes==9){
			System.out.println("el mes tiene 30 dias");
		} else if (mes ==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes ==12){
			System.out.println("el mes tiene 31 dias");
		}  else if (mes == 2) {
            System.out.println("Ingrese un año:");
            int anio = scanner.nextInt();

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El mes tiene 29 días (año bisiesto)");
            } else {
                System.out.println("El mes tiene 28 días");
            }
		}
	}
}*/
/* 
//tp 2 ejercicio 3

import java.util.Scanner;
public class miproyecto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un numero mayor a 50");
		int numero = scanner.nextInt();
		if ((numero %2==0) || (numero%3==0)){
			System.out.println(numero);
		} else 
		System.out.println("error");
			
		}

		}*/

		