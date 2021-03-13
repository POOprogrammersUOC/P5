package Clases;

import java.time.LocalDate;

public class CooperacionAlDesarrollo extends Proyectos {

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
	 */
	public CooperacionAlDesarrollo(String pais, String localizacion, String lineaDeAccion, String sublineaDeAccion,
			LocalDate fechaInicio, LocalDate fechaFinal, String socioLocal, String financiador, Double financiacion,
			String acciones, int personal, int voluntariosAsignados) {
		super(pais, localizacion, lineaDeAccion, sublineaDeAccion, fechaInicio, fechaFinal, socioLocal, financiador,
				financiacion, acciones, personal, voluntariosAsignados);
		// TODO Esbozo de constructor generado automáticamente
	}

	
}
