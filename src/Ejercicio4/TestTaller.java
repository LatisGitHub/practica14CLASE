package Ejercicio4;


public class TestTaller {

	public static void main(String[] args) {
		Taller t1 = new Taller();
		//Creacion de vehiculos
		Vehiculo c1= new Vehiculo("123", "a", "a", "blanco", 3000, 2500, Vehiculo.estado.REPARACION);
		VehiculoElectrico c2= new VehiculoElectrico("321", "b", "b", "blanco", 2000, 3000, Vehiculo.estado.REPARACION, 5000);
		VehiculoFosil vf1 = new VehiculoFosil("1111", "c", "c", "rojo", 3000, 1500, Vehiculo.estado.REPARADO, 50, Vehiculo.tipoFosil.GASOLINA);
		//Porbar metodos
		t1.ingresarVehiculo(c1);
		t1.ingresarVehiculo(c2);
		t1.ingresarVehiculo(vf1);
		System.out.println(t1.buscarVehiculo("1111"));
		t1.eliminarVehiculo(vf1);
		t1.vehiculoReparado(c2);
		System.out.println(t1);
	}

}
