package DAO;


import javax.xml.bind.JAXBException;

/**
 * @author 
 *
 */

import Clases.Proyectos;

public interface IProyectosDAO {

	public void guardarProyectosXML(Proyectos proyectos) throws JAXBException;
	public Proyectos listaProyectosXML() throws JAXBException;
}
