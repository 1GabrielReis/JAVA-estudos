import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int N, i;
		double nota1, nota2, nota3, media;
		
		N= sc.nextInt();
		
		for ( i= 0; i< N; i++) {
			
			nota1= sc.nextDouble();
			nota2= sc.nextDouble();
			nota3= sc.nextDouble();
			
			media= (nota1* 2+ nota2* 3+ nota3* 5)/ 10;
			
			System.out.printf("%.1f %n",media);
			
		}
			
	}

}
