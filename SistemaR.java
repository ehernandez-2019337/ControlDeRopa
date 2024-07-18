package org.emersonhernandez.sistema;
import java.util.Scanner; 
import org.emersonhernandez.vista.VistaRopa;
/**
*aca inicia la clase 
*
*/
/**
 *
 * @author emerson
 * @version 1.0
*/
public class SistemaR{
	public static void main(String[] args) {
		VistaRopa vista = new VistaRopa(); 
		Scanner entrada = new Scanner(System.in); 
		int opcionMenu = 0;
		String [] listaMenu = {"\nArmario de ropa...ELija una opcion: ",
		"1. Crear Prenda: ",
		"2. ver armario: ",
		"3. Buscar prenda: ",
		"4. Actualizar ´renda: ",
		"5. Borrar prenda: ",
		"6. Salir. \n"};
		do{
				for(int i=0; i<7;i++)
					System.out.println(listaMenu[i]);
				opcionMenu = entrada.nextInt();
			switch(opcionMenu){
				case 1:
					vista.nuevaRopa(); 
				break;
				case 2: 
					vista.mostrarRopa();
				break;
				case 3: 
					vista.mostrarRopaPorId();
				break;
				case 4: 
					vista.actualizarRopa();
				break;
				case 5: 
					vista.borrarRopa();
				break;
				case 6: 
					System.exit(0);
				default:
					System.out.println("Por favor siga instrucciones");
			}
		}while(opcionMenu!=6);
	}
}