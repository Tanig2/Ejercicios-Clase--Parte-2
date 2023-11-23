import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				System.out.println("Introduce un numero, por favor"); // si ponemos solo print no hace salto de linea
				Scanner sc = new Scanner(System.in);// si no ponemos new.... el objeto apunta a null y de esta manera lo inicializamos y le vamos a ir dando un valor
				int numero = sc.nextInt();
				
						
				for(int cont=1;cont<=10;cont+=1) { // primero inicializo a 1, luego la condicion que es que sea menor o =a 10 y liego le digo que vaya suma do 1
					
				System.out.printf("el numero %d por %d es igual %d\n",numero,cont,(numero*cont)); // pongo la frase, luego digo lo que es cada %d y luego la operacion.Como va de uno en uno no pongo cont+=1
				
				}

sc.close();
	}

}
