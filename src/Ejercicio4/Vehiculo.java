package Ejercicio4;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
	
	enum estado {REPARACION, REPARADO}
	enum tipoFosil{GASOLINA, DIESEL}
	
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected double precio;
	protected int cv;	
	protected estado elestado;
	/**
	 * Constructor parametrizado
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param cv
	 * @param elestado
	 */
	public Vehiculo(String matricula, String marca, String modelo, String color, double precio, int cv,
			estado elestado) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cv = cv;
		this.elestado = elestado;
	}
	/**
	 * Constructor vacio
	 */
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.precio = 0;
		this.cv = 0 ;
		this.elestado = estado.REPARACION;
	}
	/**
	 * Constructor copia
	 * @param otro
	 */
	public Vehiculo(Vehiculo otro) {
		super();
		this.matricula = otro.matricula;
		this.marca = otro.marca;
		this.modelo = otro.modelo;
		this.color = otro.color;
		this.precio = otro.precio;
		this.cv = otro.cv;
		this.elestado = otro.elestado;
	}
	//Getters y setters
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the cv
	 */
	public int getCv() {
		return cv;
	}
	/**
	 * @param cv the cv to set
	 */
	public void setCv(int cv) {
		this.cv = cv;
	}
	/**
	 * @return the elestado
	 */
	public estado getElestado() {
		return elestado;
	}
	/**
	 * @param elestado the elestado to set
	 */
	public void setElestado(estado elestado) {
		this.elestado = elestado;
	}
	/**
	 * Equals por matrícula
	 */
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	/**
	 * ToString 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
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
	/**
	 * CompareTo con la matrícula
	 */
	@Override
	public int compareTo(Vehiculo o) {
		return this.matricula.compareTo(o.getMatricula());
	}
	
	
}
