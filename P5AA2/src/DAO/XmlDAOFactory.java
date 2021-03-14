/**
 * 
 */
package DAO;

/**
 * @author Tutusaus8
 *
 */



import javax.xml.bind.JAXBException;

public class XmlDAOFactory extends DAOFactory {

	public XmlProyectosDAO getProyectosDAO() throws JAXBException{
		return new XmlProyectosDAO();
	}
	

}
