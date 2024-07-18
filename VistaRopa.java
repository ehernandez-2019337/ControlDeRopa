package org.emersonhernandez.vista;
import java.util.Scanner; 
import org.emersonhernandez.modelo.Ropa;
import org.emersonhernandez.controlador.ControlDeRopa;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class VistaRopa{
	private ControlDeRopa controlador = ControlDeRopa.getInstancia();
	private Scanner entrada = new Scanner(System.in);

	
	public VistaRopa(){}

	public void nuevaRopa(){
		Ropa ropa = new Ropa();
		entrada.nextLine();
		System.out.println("Ingrese el tipo de ropa: ");
		ropa.setNombre(entrada.nextLine());
		System.out.println("Ingrese la marca de ropa: ");
		ropa.setTelefono(entrada.nextLine());
		ropa.setId(controlador.cantidadDeElementos()+1);
		controlador.crearRopa(ropa);
	}
	public void mostrarRopa(){
		for (Ropa ropa : controlador.getListaDeRopa()){
			System.out.println("Id: "+ropa.getId());
			System.out.println("Tipo: "+ropa.getNombre());
			System.out.println("Marca: "+ropa.getTelefono());
		}
	}
	public void mostrarRopaPorId(){
		Ropa ropa = new Ropa();
		System.out.println("Ingrese el id de la ropa a mostrar: ");
		ropa = controlador.buscarRopa(entrada.nextInt());
		System.out.println("Id: "+ropa.getId());
		System.out.println("Nombre: "+ropa.getNombre());
		System.out.println("Telefono: "+ropa.getTelefono());
	}
	public void borrarRopa(){
		System.out.println("Ingrese el id para eliminar la ropa: ");
		controlador.eliminarRopa(entrada.nextInt());
	}
	public void actualizarRopa(){
		Ropa ropaAModificar = new Ropa(); 
		System.out.println("Ingrese el id de la ropa que esta por actualizar"); 
		int id = entrada.nextInt();
		for(Ropa ropaAntigua: controlador.getListaDeRopa()){
			if(ropaAntigua.getId()== id){
				System.out.println("Ingrese el nuevo ID: ");
				ropaAModificar.setId(entrada.nextInt());
				System.out.println("Ingrese el tipo de ropa: ");
				entrada.nextLine();
				ropaAModificar.setNombre(entrada.nextLine()); 
				System.out.println("Ingrese la marca de la ropa: "); 
				ropaAModificar.setTelefono(entrada.nextLine());  
				controlador.actualizarRopa(ropaAntigua,ropaAModificar);
				break;
			}
		}
	}
}