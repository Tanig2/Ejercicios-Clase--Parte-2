import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		int numRandom;
		numRandom = rd.nextInt(15); //entre 0 y 15
		System.out.printf("%f\n",numRandom);
		
		
		

	}

}
