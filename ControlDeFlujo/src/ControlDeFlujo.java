import java.util.Scanner;
public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerEdad = new Scanner(System.in);
		/*
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();
		String mensaje = votar(edad);
		System.out.println(mensaje + "\n같같같같같같같같같같같같같같같같같같같�"
				+ "같같같같같같같같같같같같같같같같같같�");
		 */
		
		System.out.println("Ingresa tu edad");
		int edad = Integer.valueOf(leerEdad.nextLine());
		System.out.println("ingresa Tu nombre");
		String nombre = leerEdad.nextLine();
		System.out.println(registro(nombre,edad));
	}
	
	public static String votar(int edad) {
		String mensaje = "";
		if(edad >= 18) {
			mensaje = "Felicidades, puedes votar";
		}
		else {
			mensaje = "No puedes votar";
		}
		return mensaje;
	}
	
	public static String registro(String nombre, int edad){
		String mensaje = "";
		if(18 <= edad && edad <= 29) {
			mensaje = "Felicidades " + nombre + ", estas aceptado en el "
					+ "programa de Generation Java Full Stack";
		}
		else {
			mensaje = "No cumples los requisitos para el bootcamp Java "
					+ "FullStack";
		}
		return mensaje;
	}
}
