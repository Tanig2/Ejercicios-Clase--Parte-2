package Arrays_Matrices;

public class VectorNumeros  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		//Definimos el array
		
		int [] vectNumeros = new int [10]; //{39 ,-2 , , ,0, , 14 , , 5 , 120};
			
			vectNumeros[0] = 39;
			vectNumeros[1] = -2;
			vectNumeros[4] = 39;
			vectNumeros[6] = 14;
			vectNumeros[8] = 5;
			vectNumeros[9] = 120;
			
			//Para ir mostrando el indice
			System.out.print("Indice\t");
			for  (int i = 0; i < 10; i++) {
				System.out.printf("\t%d" , i);
			}
			System.out.println("");
			System.out.println("Valor\t");
			for (int elemento:vectNumeros) {
				System.out.printf("\t%d ",elemento); 
				
				//Añadimos un retardo de segundo y medio
				Thread.sleep(1500);
			}
			
			
			
			
		
			//mostramos el contenido
		
			for (int elemento:vectNumeros) {
				System.out.printf("%d ",elemento);
			}
	}

}
