package br.com.fiap.model.car;

import java.io.Serializable;

public class Carro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String tPlaca;
	private boolean vehicle;
	private double tPreco;
	private String Carros;
	
	public Carro() {
		
	}

	
	public Carro(String tPlaca, boolean vehicle, double tPreco, String carros) {
		super();
		
		settPlaca(tPlaca);
		setVehicle(vehicle);
		settPreco(tPreco);
		setCarros(carros);
	}
	


	public String gettPlaca() {
		return tPlaca;
	}

	public void settPlaca(String tPlaca) {
		this.tPlaca = tPlaca;
	}

	public boolean isVehicle() {
		return vehicle;
	}

	public void setVehicle(boolean vehicle) {
		this.vehicle = vehicle;
	}

	public double gettPreco() {
		return tPreco;
	}

	public void settPreco(double tPreco) {
		this.tPreco = tPreco;
	}

	public String getCarros() {
		return Carros;
	}

	public void setCarros(String carros) {
		Carros = carros;
	}

	
}
