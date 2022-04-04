package Ejercicio4;

public class VehiculoElectrico extends Vehiculo {
	protected int kw;
	
	/**
	 * Constructor parametrizado
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param cv
	 * @param elestado
	 * @param kw
	 */
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, double precio, int cv,
			estado elestado, int kw) {
		super(matricula, marca, modelo, color, precio, cv, elestado);
		this.kw = kw;
	}
	/**
	 * Constructor copia
	 * @param otro
	 */
	public VehiculoElectrico(VehiculoElectrico otro) {
		super(otro);
		this.kw = otro.kw;
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
	 * ToString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoElectrico [kw=");
		builder.append(kw);
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
