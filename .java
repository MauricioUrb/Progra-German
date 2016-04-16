import java.util.*;
public class Tiendita{	//Nombramos a la clase 'Tiendita'

	int opcion, cant1=0, cant2=0, cant3=0, cant4=0, cant5=0, x;	//Variables para la opcion del menu, el numero de articulos y si desea hacer otra compra el usuario
	int total = 0, total1, total2, total3, total4, total5;	//Variables para el total del costo a pagar
	int pago, cambio;	//Variables para la forma de pago y el cambio
	
	public static void main(String args[]){	//Cuerpo del programa

		Tiendita T = new Tiendita();	//Referenciamos a la clase Tiendita
		Scanner sc = new Scanner(System.in);	//Referenciamos la funcion 'Scanner' para leer datos que ingresa el usuario

		do{	//Utilizamos un 'do' para darle un comienzo al metodo que se repetira con el ultimo while

			System.out.println("\n***Tiendita LOS MERO MERO***");	//Menu
			System.out.println("\nProducto\t\tPrecio");
			System.out.println("\n1. Caguama\t\t$32");
			System.out.println("2. Lechitas\t\t$14");
			System.out.println("3. Refresco\t\t$24");
			System.out.println("4. Churros\t\t$5");
			System.out.println("5. Paletas\t\t$1");
			System.out.printf("\nQue desea comprar?  ->> ");	//Pregunta que se desea comprar
			T.opcion = sc.nextInt();	//Guarda la respuesta en la variable 'opcion'

			switch (T.opcion){	//Switch para cada opcion del menu
				case 1: //En caso de que el usuario teclee 1
					System.out.printf("Cuantas caguamas desea comprar?  ->> ");	//Preguntar el numero de articulos
					T.cant1 = sc.nextInt();	//Guardalo en la variable 'cant1'
					T.total1 = 32*T.cant1;	//Obtener el precio total de dicho articulo
					break;
				case 2:	//En caso de que el usuario teclee 2
					System.out.printf("Cuantas lechitas desea comprar?  ->> ");	//Preguntar el numero de articulos
					T.cant2 = sc.nextInt();	//Guardalo en la variable 'cant2'
					T.total2 = 14*T.cant2;	//Obtener el precio total de dicho articulo
					break;
				case 3:	//En caso de que el usuario teclee 3
					System.out.printf("Cuantos refrescos desea comprar?  ->> ");	//Preguntar el numero de articulos
					T.cant3 = sc.nextInt();	//Guardalo en la variable 'cant3'
					T.total3 = 24*T.cant3;	//Obtener el precio total de dicho articulo
					break;
				case 4:	//En caso de que el usuario teclee 4
					System.out.printf("Cuantos churros desea comprar?  ->> ");	//Preguntar el numero de articulos
					T.cant4 = sc.nextInt();	//Guardalo en la variable 'cant4'
					T.total4 = 5*T.cant4;	//Obtener el precio total de dicho articulo
					break;
				case 5:	//En caso de que el usuario teclee 5
					System.out.printf("Cuantas paletas desea comprar?  ->> ");	//Preguntar el numero de articulos
					T.cant5 = sc.nextInt();	//Guardalo en la variable 'cant5'
					T.total5 = 1*T.cant5;	//Obtener el precio total de dicho articulo
					break;
				}

			System.out.println("\nDeseas hacer alguna otra compra?"); //Pregunta al usuario si desea hacer otra compra
			System.out.println("1. Si\n2. No");	//Le da las opciones al usuario
			T.x = sc.nextInt();	//Guarda la respuesta en la variable x
		}

		while (T.x == 1);	//Hasta aqui, se repetira todo lo anterior hasta que el usuario teclee 2, para decir que ya no comprara nada
		T.total = T.total1 + T.total2 + T.total3 + T.total4 + T.total5;	//Obtenemos el precio total
		System.out.printf("\nEl precio total es de %d", T.total);	//Le imprimimos al usuario el precio total
		System.out.printf("\nCon cuanto efectivo pagara?  ->> ");	//Le preguntamos al usuario con que cantidad de dinero pagara
		T.pago = sc.nextInt();	//Guardamos su respuesta en la variable 'pago'
		T.cambio = T.pago - T.total;	//Obtenemos el cambio que se le dara al usuario

		System.out.printf("\n**********************************");  //Imprimimos el ticket de compra al usuario
		System.out.printf("\n* * * Tiendita LOS MERO MERO * * *");
		System.out.printf("\n*                                *");
		System.out.printf("\n*          COL. COPILCO          *");
		System.out.printf("\n*   A UN LADO DE METRO COPILCO   *");
		System.out.printf("\n*        D.F.   CP: 04360        *");
		System.out.printf("\n* ------------------------------ *");
		System.out.printf("\n*  %d\tCaguamas\t$ %d\t *", T.cant1, T.total1);
		System.out.printf("\n*  %d\tLechitas\t$ %d\t *", T.cant2, T.total2);
		System.out.printf("\n*  %d\tRefrescos\t$ %d\t *", T.cant3, T.total3);
		System.out.printf("\n*  %d\tChurros\t\t$ %d\t *", T.cant4, T.total4);
		System.out.printf("\n*  %d\tPaletas\t\t$ %d\t *", T.cant5, T.total5);
		System.out.printf("\n*                     ------     *");
		System.out.printf("\n*  \t     TOTAL\t$ %d\t *", T.total);
		System.out.printf("\n* ------------------------------ *");
		System.out.printf("\n*       Efectivo\t$ %d\t *", T.pago);
		System.out.printf("\n*       Cambio\t\t$ %d\t *", T.cambio);
		System.out.printf("\n* ------------------------------ *");
		System.out.printf("\n*  Muchas gracias por su compra  *");
		System.out.printf("\n*      P.V.P.  IVA INCLUIDO      *");
		System.out.printf("\n*                                *");
		System.out.printf("\n*    Conserve su ticket para     *");
		System.out.printf("\n*  cualquier duda o aclaracion   *");
		System.out.printf("\n**********************************");
	}
}
