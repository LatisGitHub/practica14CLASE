package Ejercicio4;

public class VehiculoFosil extends Vehiculo {
	
	protected int deposito;
	protected tipoFosil elTipoFosil;
	
	
	
	
	
	/**
	 * Constructor parametrizado
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param cv
	 * @param elestado
	 * @param deposito
	 * @param tipoFosil
	 */
	public VehiculoFosil(String matricula, String marca, String modelo, String color, double precio, int cv,
			estado elestado, int deposito, tipoFosil tipoFosil) {
		super(matricula, marca, modelo, color, precio, cv, elestado);
		this.deposito = deposito;
		this.elTipoFosil = tipoFosil;
	}
	/**
	 * Constructor vacio
	 */
	public VehiculoFosil() {
		super();
		this.deposito = 0;
		this.elTipoFosil = tipoFosil.GASOLINA;
	}
	/**
	 * @return the deposito
	 */
	public int getDeposito() {
		return deposito;
	}
	/**
	 * @param deposito the deposito to set
	 */
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	/**
	 * @return the elTipoFosil
	 */
	public tipoFosil getElTipoFosil() {
		return elTipoFosil;
	}
	/**
	 * @param elTipoFosil the elTipoFosil to set
	 */
	public void setElTipoFosil(tipoFosil elTipoFosil) {
		this.elTipoFosil = elTipoFosil;
	}
	/**
	 * ToString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoFosil [deposito=");
		builder.append(deposito);
		builder.append(", elTipoFosil=");
		builder.append(elTipoFosil);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", cv=");
		builder.append(cv);
		builder.append(", elestado=");
		builder.append(elestado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
