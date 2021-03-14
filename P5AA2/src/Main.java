import java.util.Scanner;

public class Main {

	static Scanner Leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		String menu;

		Ong ong = new Ong();

		System.out.println("*****************************************");
		System.out.println("   Bienvenidos a la gesti�n de la ONG");
		System.out.println("*****************************************");
		System.out.println("");
		System.out.println("1. Iniciar sesi�n como administrador");
		System.out.println("2. Iniciar sesi�n como usuario");
		System.out.println("3. Salir");
		menu = Leer.nextLine();
		switch (menu) {

		case "1":
			// funcion entrar como administrador
			subMenuAdministrador();
			break;
		case "2":
			// funci�n entrar como usuario
			subMenuUsuario();
			break;
		case "3":
			System.exit(0);
			break;
		default:
			System.out.println(
					"El valor que se ha introducido: " + menu + " no es valido, seleccione las opciones del men�\n");
		}
		while (menu != "3")
			;

	}

	public static void subMenuAdministrador() {

		Ong ong = new Ong();

		String menu;
		do {

			System.out.println("*****************************************");
			System.out.println("     Accediendo como Administrador");
			System.out.println("*****************************************");
			System.out.println("");
			System.out.println("1. A�adir Empleado");
			System.out.println("2. Eliminar Empleado");
			System.out.println("3. Imprimir listado de empleados"); // <------------ introducir en menu usuario tambi�n
			System.out.println("4. A�adir Socios");
			System.out.println("5. Eliminar Socios");
			System.out.println("6. Imprimir lista de socios"); // <------------ introducir en menu usuario tambi�n
			System.out.println("7. A�adir Proyecto");
			System.out.println("8. Eliminar proyecto");
			System.out.println("9. Imprimir lista de proyectos"); // <------------ introducir en menu usuario tambi�n
			System.out.println("10. Salir");
			menu = Leer.nextLine();
			switch (menu) {

			case "1":
				ong.AgregarEmpleado();

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":
				ong.addsocios();
				break;
			case "5":

				break;
			case "6":
				ong.ImprimirSocios();
				break;
			case "7":
				ong.AddProyectos();
				break;
			case "8":
				ong.EliminarProyecto();
				break;
			case "9":
				ong.ImprimirProyectos();
				break;
			case "10":
				main(null);
				break;

			}

		} while (menu != "10");

	}

	public static void subMenuUsuario() {

		Ong ong = new Ong();

		String menu;
		do {

			System.out.println("*****************************************");
			System.out.println("     Accediendo como Usuario");
			System.out.println("*****************************************");
			System.out.println("");
			System.out.println("1. Imprimir listado de empleados"); // <------------ introducir en menu usuario tambi�n
			System.out.println("2. Imprimir lista de socios"); // <------------ introducir en menu usuario tambi�n
			System.out.println("3. Imprimir lista de proyectos"); // <------------ introducir en menu usuario tambi�n
			System.out.println("4. Salir");

			menu = Leer.nextLine();
			switch (menu) {

			case "1":

				break;
			case "2":

				break;
			case "3":
				ong.ImprimirProyectos();
				break;
			case "4":
				main(null);
				break;

			}
		} while (menu != "4");
	}
}
