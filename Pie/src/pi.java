import java.util.Random;
import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		double numPontoCirculo = 0;
		double numPontoTotal = 0;
		double x, y;
		double pi, distancia, estimado;
		
		System.out.println("Informe a quantidade estimada: ");
		estimado = teclado.nextDouble();
		
		for (int i = 0; i < estimado; i++) {
			x = random.nextDouble();
			y = random.nextDouble();
			distancia = Math.pow(x,2)+Math.pow(y,2);
			if (distancia <= 1) {
				numPontoCirculo = numPontoCirculo + 1;
			}
			numPontoTotal = numPontoTotal + 1;
		}
		
		pi = (4*numPontoCirculo)/numPontoTotal;
		
		System.out.println(pi);
		
		teclado.close();
	}

}
