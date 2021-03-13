/**
 * 
 */
package DAO;

import javax.xml.bind.JAXBException;

/**
 * @author 
 *
 */
public abstract class DAOFactory {

	//Los tipos de DAO que damos soporte
	
	public static final int XML = 1;
	public static final int SQL = 2;
	
	//Para cada una de las clases deberá haber un método DAO
	
	public abstract XmlProyectosDAO getProyectosDAO() throws JAXBException;
	
	
	public static DAOFactory getDaoFactory(int SelectFactory) { // Se realiza la función para seleccionar si es un modelo u otro
		
		switch (SelectFactory) {
		
		case XML:
			return new XmlDAOFactory(); //si la función recibe un 1 llamará a la función para crear el fichero XML
		//case SQL:
		//	return new SqlDAOFaactory(); //si la función recibe un 2 llamará a la función para crear el fichero SQL
		default:
			return null;
		}
	}
}
