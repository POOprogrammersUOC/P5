/**
 * 
 */
package DAO;

import Clases.Proyectos;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author Tutusaus8
 *
 */
public class XmlProyectosDAO implements IProyectosDAO {

	private JAXBContext context = null;					//Inicializamos el atributo a null para evitar que contenga un valor no deseado
	private String nombreFichero = null;
	
	
	public XmlProyectosDAO() throws JAXBException {		// Hacemos un constructor vacio que ejecutará la instancia a la clase proyectos y a su vez dará como nombre al fichero de XML
		this.context = JAXBContext.newInstance(Proyectos.class);
		this.nombreFichero = "src\\Xml\\Proyectos.xml";
	}


	@Override
	public void guardarProyectosXML(Proyectos proyectos) throws JAXBException {
		
		
		
		Marshaller marshaller = context.createMarshaller();			//
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		marshaller.marshal(proyectos, new File(nombreFichero));
		
		System.out.println("**************************************************************");
		System.out.println("El fichero " + nombreFichero + " se ha generado en formato XML");
		System.out.println("**************************************************************");
		System.out.println("Contenido del fichero " + nombreFichero);
		System.out.println("");
		marshaller.marshal(proyectos, System.out);
		
	}


	@Override
	public Proyectos listaProyectosXML() throws JAXBException {
	/*	
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Proyectos proyectos = (Proyectos) unmarshaller.unmarshal(new File(nombreFichero));
		
		System.out.println("**************************************************************");
		System.out.println("El fichero " + nombreFichero + " se ha generado en formato XML");
		System.out.println("**************************************************************");
		System.out.println("Contenido del fichero " + nombreFichero);
		System.out.println("");
		
		for (Proyectos proyectos : ) {
			
		}
		*/
		return null;
	}
	
	
}
