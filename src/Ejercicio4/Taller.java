package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

import Ejercicio4.Vehiculo.estado;

public class Taller {
	protected ArrayList<Vehiculo> talleres;
	
	/**
	 * Constructor
	 */
	public Taller() {
		super();
		this.talleres = new ArrayList<>();
	}
	
	/**
	 * @return the talleres
	 */
	public ArrayList<Vehiculo> getTalleres() {
		return talleres;
	}

	/**
	 * Ingresa un vehiculo
	 * @param v
	 */
	public void ingresarVehiculo(Vehiculo v) {
		if (!talleres.contains(v)) {
			talleres.add(v);	
		}
	}
	/**
	 * Pone un vehiculo a estado reparado
	 * @param v
	 */
	public void vehiculoReparado(Vehiculo v) {
		v.setElestado(estado.REPARADO);
	}
	/**
	 * Elimina un vehiculo
	 * @param v
	 */
	public void eliminarVehiculo(Vehiculo v) {
		talleres.remove(v);
	}
	/**
	 * 
	 * @param matricula
	 * @return el vehiculo buscado mediante una matricula de forma eficiente
	 */
	public Vehiculo buscarVehiculo(String matricula) {
		Collections.sort(talleres); 
		int index = Collections.binarySearch(talleres, new Vehiculo(matricula, "", "", "", 0, 0, estado.REPARACION));
		return talleres.get(index);
	}
	//ToString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taller [talleres=");
		builder.append(talleres);
		builder.append("]");
		return builder.toString();
	}
	
}
