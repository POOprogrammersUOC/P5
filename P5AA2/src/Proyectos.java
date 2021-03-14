import java.time.LocalDate;
import java.util.Date;

public class Proyectos {

	private String Pais;
	private String Localizacion;
	private String lineaDeAccion;
	private String SublineaDeAccion;
	private LocalDate FechaInicio;
	private LocalDate FechaFinal;
	private String SocioLocal;
	private String Financiador;
	private Double Financiacion;
	private int NumProyecto;
	private String Acciones;
	private int Personal;
	private int VoluntariosAsignados;
	private static int contador=0;
	
	/**
	 * @param pais Pais donde se realiza el proyecto
	 * @param localizacion Localización donde se realiza el proyecto
	 * @param lineaDeAccion Línea de acción
	 * @param sublineaDeAccion Sub líea de acción
	 * @param fechaInicio Fecha de inicio
	 * @param fechaFinal Fecha final
	 * @param socioLocal Socio local
	 * @param financiador Persona financiadora
	 * @param financiacion Financiación
	 * @param numProyecto Número del proyecto
	 * @param acciones Acciones para el proyecto
	 * @param personal Personal para el proyecto
	 * @param voluntariosAsignados Voluntarios para el proyecto
	 * @param contador inicia número de proyecto a 0 para incrementar cuando se agrega
	 */
	
	public Proyectos(String pais, String localizacion, String lineaDeAccion, String sublineaDeAccion, LocalDate fechaInicio,
			LocalDate fechaFinal, String socioLocal, String financiador, Double financiacion,
			String acciones, int personal, int voluntariosAsignados) {
		
		Pais = pais;
		Localizacion = localizacion;
		this.lineaDeAccion = lineaDeAccion;
		SublineaDeAccion = sublineaDeAccion;
		FechaInicio = fechaInicio;
		FechaFinal = fechaFinal;
		SocioLocal = socioLocal;
		Financiador = financiador;
		Financiacion = financiacion;
		NumProyecto = ++contador;
		Acciones = acciones;
		Personal = personal;
		VoluntariosAsignados = voluntariosAsignados;
	}
	/**
	 * @return Devuelve el pais
	 */
	public String getPais() {
		return Pais;
	}
	/**
	 * @param pais Establece el pais
	 */
	public void setPais(String pais) {
		Pais = pais;
	}
	/**
	 * @return Devuelve la localizacion
	 */
	public String getLocalizacion() {
		return Localizacion;
	}
	/**
	 * @param localizacion Establece la localizacion
	 */
	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}
	/**
	 * @return Devuelve la lineaDeAccion
	 */
	public String getLineaDeAccion() {
		return lineaDeAccion;
	}
	/**
	 * @param lineaDeAccion Establece la lineaDeAccion
	 */
	public void setLineaDeAccion(String lineaDeAccion) {
		this.lineaDeAccion = lineaDeAccion;
	}
	/**
	 * @return Devuelve la sublineaDeAccion
	 */
	public String getSublineaDeAccion() {
		return SublineaDeAccion;
	}
	/**
	 * @param sublineaDeAccion Establece la sublineaDeAccion
	 */
	public void setSublineaDeAccion(String sublineaDeAccion) {
		SublineaDeAccion = sublineaDeAccion;
	}
	/**
	 * @return Devuelve fechaInicio
	 */
	public LocalDate getFechaInicio() {
		return FechaInicio;
	}
	/**
	 * @param fechaInicio Establece la fechaInicio
	 */
	public void setFechaInicio(LocalDate fechaInicio) {
		FechaInicio = fechaInicio;
	}
	/**
	 * @return Devuelve fechaFinal
	 */
	public LocalDate getFechaFinal() {
		return FechaFinal;
	}
	/**
	 * @param fechaFinal Establece la fechaFinal
	 */
	public void setFechaFinal(LocalDate fechaFinal) {
		FechaFinal = fechaFinal;
	}
	/**
	 * @return Devuelve socioLocal
	 */
	public String getSocioLocal() {
		return SocioLocal;
	}
	/**
	 * @param socioLocal Establece el socioLocal
	 */
	public void setSocioLocal(String socioLocal) {
		SocioLocal = socioLocal;
	}
	/**
	 * @return Devuelve el financiador
	 */
	public String getFinanciador() {
		return Financiador;
	}
	/**
	 * @param financiador Establece el financiador
	 */
	public void setFinanciador(String financiador) {
		Financiador = financiador;
	}
	/**
	 * @return Devuelve la financiacion
	 */
	public Double getFinanciacion() {
		return Financiacion;
	}
	/**
	 * @param financiacion Establece la financiacion
	 */
	public void setFinanciacion(Double financiacion) {
		Financiacion = financiacion;
	}
	/**
	 * @return Devuelve el numProyecto
	 */
	public int getNumProyecto() {
		return NumProyecto;
	}
	/**
	 * @param numProyecto Establece el numProyecto
	 */
	public void setNumProyecto(int numProyecto) {
		NumProyecto = numProyecto;
	}
	/**
	 * @return Devuelve las acciones
	 */
	public String getAcciones() {
		return Acciones;
	}
	/**
	 * @param acciones Establece las acciones
	 */
	public void setAcciones(String acciones) {
		Acciones = acciones;
	}
	/**
	 * @return Devuelve el personal
	 */
	public int getPersonal() {
		return Personal;
	}
	/**
	 * @param personal Establece el personal
	 */
	public void setPersonal(int personal) {
		Personal = personal;
	}
	/**
	 * @return Devuelve los voluntariosAsignados
	 */
	public int getVoluntariosAsignados() {
		return VoluntariosAsignados;
	}
	/**
	 * @param voluntariosAsignados Establece los voluntariosAsignados
	 */
	public void setVoluntariosAsignados(int voluntariosAsignados) {
		VoluntariosAsignados = voluntariosAsignados;
	}
	@Override
	public String toString() {
		return "Proyectos [Pais=" + Pais + ", Localizacion=" + Localizacion + ", lineaDeAccion=" + lineaDeAccion
				+ ", SublineaDeAccion=" + SublineaDeAccion + ", FechaInicio=" + FechaInicio + ", FechaFinal="
				+ FechaFinal + ", SocioLocal=" + SocioLocal + ", Financiador=" + Financiador + ", Financiacion="
				+ Financiacion + ", NumProyecto=" + NumProyecto + ", Acciones=" + Acciones + ", Personal=" + Personal
				+ ", VoluntariosAsignados=" + VoluntariosAsignados + "]";
	}
	
	
	
}

 