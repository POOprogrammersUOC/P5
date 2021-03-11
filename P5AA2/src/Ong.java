import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ong {

	private String Nombre;
	private String Direccion;
	private String CIF;
	private String Pais;
	private String Telefono;
	private String Web;
	private String Email;
	private ArrayList<Empleados> ListaEmpleados;
	private ArrayList<Socios> ListaSocios;
	private ArrayList<Proyectos> ListaProyectos;

	/**
	 * @param listaEmpleados
	 * @param listaSocios
	 * @param listaProyectos
	 */
	public Ong() {
		ListaEmpleados = new ArrayList<>();
		ListaSocios = new ArrayList<>();
		ListaProyectos = new ArrayList<>();
	}

	/**
	 * @return Devuelve el nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre Establecer el nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return Devuelve la dirección
	 */
	public String getDireccion() {
		return Direccion;
	}

	/**
	 * @param direccion Establecer la direccion
	 */
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	/**
	 * @return Devuelve el cIF
	 */
	public String getCIF() {
		return CIF;
	}

	/**
	 * @param cIF Establecer el cIF
	 */
	public void setCIF(String cIF) {
		CIF = cIF;
	}

	/**
	 * @return Devuelve el pais
	 */
	public String getPais() {
		return Pais;
	}

	/**
	 * @param pais Establecer el pais
	 */
	public void setPais(String pais) {
		Pais = pais;
	}

	/**
	 * @return Devuelve el telefono
	 */
	public String getTelefono() {
		return Telefono;
	}

	/**
	 * @param telefono Establecer el telefono
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	/**
	 * @return Devuelve la web
	 */
	public String getWeb() {
		return Web;
	}

	/**
	 * @param web Establecer la web
	 */
	public void setWeb(String web) {
		Web = web;
	}

	/**
	 * @return Devuelve el email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email Establecer el email
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return Devuelve listaEmpleados
	 */
	public ArrayList<Empleados> getListaEmpleados() {
		return ListaEmpleados;
	}

	/**
	 * @param listaEmpleados Establecer listaEmpleados
	 */
	public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
		ListaEmpleados = listaEmpleados;
	}

	/**
	 * @return Devuelve listaSocios
	 */
	public ArrayList<Socios> getListaSocios() {
		return ListaSocios;
	}

	/**
	 * @param listaSocios Establecer listaSocios
	 */
	public void setListaSocios(ArrayList<Socios> listaSocios) {
		ListaSocios = listaSocios;
	}

	/**
	 * @return Devuelve Lista Proyectos
	 */
	public ArrayList<Proyectos> getListaProyectos() {
		return ListaProyectos;
	}

	/**
	 * @param listaProyectos Establecer lista de proyectos
	 */
	public void setListaProyectos(ArrayList<Proyectos> listaProyectos) {
		ListaProyectos = listaProyectos;
	}

	static Scanner Leer = new Scanner(System.in);

	/**
	 * Función añadir proyecto
	 * 
	 * @author Isaac Tutusaus
	 * @version 1.0
	 * 
	 */

	public void AddProyectos() {
		
		ArrayList<Proyectos> NuevaListaProyectos = this.getListaProyectos(); //Creamos un arrayList de proyectos para que recoja los proyectos con la NuevaListaProyectos

		try {																						// Aplicamos el try catch porque parseamos las fechas

			System.out.println("Introduzca el Pais: ");												// Pedimos los datos de todos los atributos de la clase proyectos
			String Pais = Leer.nextLine();
			System.out.println("Introduzca la Localización: ");
			String Localizacion = Leer.nextLine();
			System.out.println("Introduzca la línea de acción: ");
			String LineaDeAccion = Leer.nextLine();
			System.out.println("Introduzca la sub línea de acción: ");
			String SublineaDeAccion = Leer.nextLine();
			System.out.println("Introduzca la fecha de inicio del proyecto con el formato [YYYY-MM-DD]: ");
			String FechaInicio = Leer.nextLine();
			System.out.println("Introduzca la fecha final del proyecto con el formato [YYYY-MM-DD]: ");
			String FechaFinal = Leer.nextLine();
			LocalDate fInicio = LocalDate.parse(FechaInicio);														//parseamos la fecha
			LocalDate fFinal = LocalDate.parse(FechaFinal);

			while (fFinal.isBefore(fInicio)) {																		// Mientras la fecha final sea antes que la de inicio se preguntara de nuevo
				System.out.println(																					//Nunca podrá ser 2021-03-15 de inicio y la fecha final 2021-02-15
						"La fecha no se valida o no se ha introducido correctamente, use el método [YYYY-MM-DD] ");
				System.out.println("Introduzca la fecha de inicio del proyecto: ");
				FechaInicio = Leer.nextLine();
				System.out.println("Introduzca la fecha final del proyecto: ");
				FechaFinal = Leer.nextLine();
				fInicio = LocalDate.parse(FechaInicio);
				fFinal = LocalDate.parse(FechaFinal);
			}

			System.out.println("Introduzca el Socio local: ");
			String SocioLocal = Leer.nextLine();
			System.out.println("Indique el financiador: ");
			String Financiador = Leer.nextLine();
			System.out.println("Cantidad a financiar: ");
			Double Financiacion = Leer.nextDouble();
			Leer.nextLine();
			System.out.println("Acciones: ");
			String Acciones = Leer.nextLine();
			System.out.println("Indicar Nº de personas del proyecto: ");
			int Personal = Leer.nextInt();
			Leer.nextLine();																						// Estamos obligados a ponerla para que no interprete un valor
			System.out.println("Indicar Nº de personal voluntario: ");
			int VoluntariosAsignados = Leer.nextInt();
			Leer.nextLine();

			Proyectos proyecto = new Proyectos(Pais, Localizacion, LineaDeAccion, SublineaDeAccion, fInicio, fFinal,	//finalmente creamos el objeto
					SocioLocal, Financiador, Financiacion, Acciones, Personal, VoluntariosAsignados);
			NuevaListaProyectos.add(proyecto);																			//Añadimos los valores al ArrayList

			
		} catch (DateTimeParseException e) {																			//controlamos la excepción personalizada
			System.out.println(
					"La fecha introducida no es correcta o no se corresponde con el formato indicado [YYYY-MM-DD]");

		}

	}

	/**
	 * Función Imprimir proyecto
	 * 
	 * @author Isaac Tutusaus
	 * @version 1.0
	 * 
	 */

	public void ImprimirProyectos() {

		ArrayList<Proyectos> NuevaListaProyectos = this.getListaProyectos();									//Creamos un arrayList de proyectos para poder recorrer la lista

		if (NuevaListaProyectos.isEmpty()) {																	// Sí no hay proyectos en la ArrayList, se informa
			
			System.out.println("No hay proyectos creados");

		} else {

			for (Proyectos proyectos : NuevaListaProyectos) {													// recorremos la lista con un forEach y mostramos el contenido
				System.out.println("***************************************************");
				System.out.println("              LISTADO DE PROYECTOS");
				System.out.println("***************************************************");
				System.out.println("Código del proyecto: " + proyectos.getNumProyecto());
				System.out.println("Pais: " + proyectos.getPais());
				System.out.println("Localización: " + proyectos.getLocalizacion());
				System.out.println("Línea de acción: " + proyectos.getLineaDeAccion());
				System.out.println("Sublínea de acción: " + proyectos.getSublineaDeAccion());
				System.out.println("Fecha de inicio: " + proyectos.getFechaInicio());
				System.out.println("Fecha final: " + proyectos.getFechaFinal());
				System.out.println("Socio local: " + proyectos.getSocioLocal());
				System.out.println("Financiador: " + proyectos.getFinanciador());
				System.out.println("Financiación aportada: " + proyectos.getFinanciacion());
				System.out.println("Acciones a realizar: " + proyectos.getAcciones());
				System.out.println("Personal: " + proyectos.getPersonal());
				System.out.println("Voluntarios asignados: " + proyectos.getVoluntariosAsignados());
				System.out.println("");

			}
		}
	}
	
	public void EliminarProyecto() {
		
		ArrayList<Proyectos> EliminarListaProyectos = this.getListaProyectos();
		
		if(EliminarListaProyectos.isEmpty()) {
			System.out.println("No hay lista de proyectos a eliminar\n");
		}else {
			
			for (int i = 0; i < EliminarListaProyectos.size(); i++) {
				
				System.out.println("Código del proyecto: " +  EliminarListaProyectos.get(i).getNumProyecto());
			}
			try {
			System.out.println("¿Que proyecto quiere eliminar? Indique el número: ");
			int eliminar = Leer.nextInt();
			Leer.nextLine();
			EliminarListaProyectos.remove(eliminar-1);	//Hay que ponerle un try catch IndexOutOfBoundsException fuera de indice
			} catch (Exception e) {
				System.out.println("El valor introducido no se encuentra en la lista\n");
			}
		}
		
	}
}
