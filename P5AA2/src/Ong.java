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
	 * @return el nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return el direccion
	 */
	public String getDireccion() {
		return Direccion;
	}

	/**
	 * @param direccion el direccion a establecer
	 */
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	/**
	 * @return el cIF
	 */
	public String getCIF() {
		return CIF;
	}

	/**
	 * @param cIF el cIF a establecer
	 */
	public void setCIF(String cIF) {
		CIF = cIF;
	}

	/**
	 * @return el pais
	 */
	public String getPais() {
		return Pais;
	}

	/**
	 * @param pais el pais a establecer
	 */
	public void setPais(String pais) {
		Pais = pais;
	}

	/**
	 * @return el telefono
	 */
	public String getTelefono() {
		return Telefono;
	}

	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	/**
	 * @return el web
	 */
	public String getWeb() {
		return Web;
	}

	/**
	 * @param web el web a establecer
	 */
	public void setWeb(String web) {
		Web = web;
	}

	/**
	 * @return el email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email el email a establecer
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return el listaEmpleados
	 */
	public ArrayList<Empleados> getListaEmpleados() {
		return ListaEmpleados;
	}

	/**
	 * @param listaEmpleados el listaEmpleados a establecer
	 */
	public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
		ListaEmpleados = listaEmpleados;
	}

	/**
	 * @return el listaSocios
	 */
	public ArrayList<Socios> getListaSocios() {
		return ListaSocios;
	}

	/**
	 * @param listaSocios el listaSocios a establecer
	 */
	public void setListaSocios(ArrayList<Socios> listaSocios) {
		ListaSocios = listaSocios;
	}

	/**
	 * @return el listaProyectos
	 */
	public ArrayList<Proyectos> getListaProyectos() {
		return ListaProyectos;
	}

	/**
	 * @param listaProyectos el listaProyectos a establecer
	 */
	public void setListaProyectos(ArrayList<Proyectos> listaProyectos) {
		ListaProyectos = listaProyectos;
	}

	Scanner leer = new Scanner(System.in);

	public void addsocios() {

		ArrayList<Socios> NuevaListaSocios = this.getListaSocios();

		try {

			System.out.println("Introduce el nombre:");
			String nom = leer.nextLine();
			System.out.println("Introduce el apellido:");
			String ape = leer.nextLine();
			System.out.println("Introduce el numero de socio asignado:");
			int nsoc = leer.nextInt();
			leer.nextLine();
			System.out.println("Introduce la direccion:");
			String direc = leer.nextLine();
			leer.nextLine();
			System.out.println("Introduce el telefono:");
			String telf = leer.nextLine();

			Socios socios = new Socios(nom, ape, nsoc, direc, telf);
			NuevaListaSocios.add(socios);

		} catch (Exception e) {

			System.out.println("error");
		}

		for (Socios socios1 : NuevaListaSocios) {

			System.out.println("nombre: " + socios1.getNombre());
			System.out.println("apellidos: " + socios1.getApellidos());
			System.out.println("num. socio: " + socios1.getnSocio());
			System.out.println("direccion: " + socios1.getDireccion());
			System.out.println("telefono: " + socios1.getTelefono());
		}

	}

	public void ImprimirSocios() {

		ArrayList<Socios> NuevaListaSocios = this.getListaSocios();

		if (NuevaListaSocios.isEmpty()) {

			System.out.println("No hay proyectos creados\n");

		} else {

			for (Socios socios1 : NuevaListaSocios) {

				System.out.println("////////////////////////////////////////////////////");
				System.out.println("              LISTA DE SOCIOS");
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("Nombre del socio: " + socios1.getNombre());
				System.out.println("Apellidos del socio: " + socios1.getApellidos());
				System.out.println("Número de socio: " + socios1.getnSocio());
				System.out.println("Dirección: " + socios1.getDireccion());
				System.out.println("Telefono: " + socios1.getTelefono());
			}

		}
	}

	public void EliminarSocio() {

		ArrayList<Socios> NuevaListaSocios = this.getListaSocios();

	}

}
