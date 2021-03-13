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
	
	//Para cada una de las clases deber� haber un m�todo DAO
	
	public abstract XmlProyectosDAO getProyectosDAO() throws JAXBException;
	
	
	public static DAOFactory getDaoFactory(int SelectFactory) { // Se realiza la funci�n para seleccionar si es un modelo u otro
		
		switch (SelectFactory) {
		
		case XML:
			return new XmlDAOFactory(); //si la funci�n recibe un 1 llamar� a la funci�n para crear el fichero XML
		//case SQL:
		//	return new SqlDAOFaactory(); //si la funci�n recibe un 2 llamar� a la funci�n para crear el fichero SQL
		default:
			return null;
		}
	}
}
