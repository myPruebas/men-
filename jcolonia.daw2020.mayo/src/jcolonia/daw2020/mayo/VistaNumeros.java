/**
 * 
 */
package jcolonia.daw2020.mayo;

import java.util.Scanner;

/**
 * @author daw1m03
 *
 */
public class VistaNumeros extends VistaGeneral{

	

	
public VistaNumeros (String titulo,Scanner in) {
	super(titulo, in);
}


public void recogenumeros() {
	String elección;
	ListaNúmeros nuevoNumero = new ListaNúmeros();
	double transf;
	mostrarTítuloSimple();
	System.out.print("Introduzca un nuevo valor: ");
	elección = in.nextLine();
	
	
	
	try {
		transf = nuevoNumero.transformarEntradaTexto(elección);
		nuevoNumero.add(transf);
		mostrarMensaje("Se ha agregado un valor");
	} catch (SumatorioNumberException e) {
		e.printStackTrace();
	};
}




}
