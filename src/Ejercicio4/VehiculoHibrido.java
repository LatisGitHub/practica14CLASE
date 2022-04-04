package Ejercicio4;

public class VehiculoHibrido extends Vehiculo {
	protected int kw;
	protected tipoFosil elTipoFosil;
	protected int deposito;
	/**
	 * Constructor parametrizado
	 * @param kw
	 * @param elTipoFosil
	 * @param deposito
	 */
	public VehiculoHibrido(String matricula, String marca, String modelo, String color, double precio, int cv,
			estado elestado, int kw, tipoFosil elTipoFosil, int deposito) {
		super(matricula, marca, modelo, color, precio, cv, elestado);
		this.kw = kw;
		this.elTipoFosil = elTipoFosil;
		this.deposito = deposito;
	}
	/**
	 * Constructor vacio
	 */
	public VehiculoHibrido() {
		super();
		this.kw = 0;
		this.elTipoFosil = tipoFosil.GASOLINA;
		this.deposito = 0;
	}
	/**
	 * Constructor copia
	 * @param otro
	 */
	public VehiculoHibrido(VehiculoHibrido otro) {
		super(otro);
		this.kw = otro.kw;
		this.elTipoFosil = otro.elTipoFosil;
		this.deposito = otro.deposito;
	}
	/**
	 * @return the kw
	 */
	public int getKw() {
		return kw;
	}
	/**
	 * @param kw the kw to set
	 */
	public void setKw(int kw) {
		this.kw = kw;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoHibrido [kw=");
		builder.append(kw);
		builder.append(", elTipoFosil=");
		builder.append(elTipoFosil);
		builder.append(", deposito=");
		builder.append(deposito);
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
