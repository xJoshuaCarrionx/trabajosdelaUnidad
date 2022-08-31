package ejercicio;
import java.util.Scanner;
public class tarea_3 {

	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double c, f;
		
		System.out.println("Ingrese valores de Fahrenheit para convertir a celsius");
		f=lec.nextDouble();
		{
			c=((f-32)*(5.0/9.0));
			System.out.println("La conversion de Fahrenheit a celcius es: "+c);
		}
		System.out.println("*-----------------------------------------------------");
		System.out.println("Ingrese valores de Celsius para convertir a Fahrenheit");
		c=lec.nextDouble();
		{
			f=(c*(9.0/5.0))+32;
			System.out.println("La conversion de Celsius a Fahrenheit es: "+f);
		}
		lec.close();
	}
}
