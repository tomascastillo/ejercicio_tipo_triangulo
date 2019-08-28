package triangulo;

import java.util.Scanner;

public class Es_triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1=0 , l2=0, l3=0,numero;
		Scanner teclado = new Scanner(System. in);
		
		
		System.out.println("Introduce números y 0 para terminar \n");
		 do {
			 numero=1;
			 try {
				 
			 
			 
		 System.out.print("Introduzca primer lado: ");
	        l1 = teclado.nextInt();
            if(l1>0 ) {
		        System.out.print("Introduzca segundo lado: ");
		        l2 = teclado.nextInt();
		        if(l2>0 ) {
			        System.out.print("Introduzca tercer lado: ");
			       l3 = teclado.nextInt();
			       }
            }
		
		 if(l1<=0 || l2<=0 || l3<=0) {
			 System.out.print("Finalizo el programa \n ");
			 numero=0;
		 }
		 //validar suma de lados
		 else {
			Tipo_triangulo tipo= new Tipo_triangulo(l1,l2,l3);
			if(tipo.es_triangulo()) {
				  System.out.print("El triangulo es del tipo: "+ tipo.tipo_triangulo() + "\n");
			}
			else {
				 System.out.print("No es triangulo \n");
			}
		 	}}
			 catch(Exception e){
				 
				 System.out.print("No es caracter valido \n");
				 teclado.nextLine();
			 }
		 }while(numero!=0);
		 teclado.close();
	}

}
