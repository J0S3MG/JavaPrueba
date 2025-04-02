package com.vaadin.Prueba;

public class Moto {

	//Property
	String Marca = "";
	public String getMarca() {
		return Marca;
	}
	int Modelo = 0;
	public int getModelo() {
		return Modelo;
	}
	double ValorFab = 0;
	public double getValorFab() {
		return ValorFab;
	}
	
	//Constructor
	public Moto(String marc, int mod,double valF) {
		Marca = marc;
		Modelo = mod;
		ValorFab = valF;
	}
	
	//Methods
	public int AnoUso(int anoCal) {
		var anoUso = anoCal - Modelo;
		return anoUso;
	}
	public double CalcularDL(int anoC,int vidaU) {
		var a = AnoUso(anoC);
		var valAct = ValorFab - (ValorFab * a/vidaU);
		return valAct;
	}
	public double CalcularDA(int anoC,double tasaD) {
		var a = AnoUso(anoC);
		var valAct = ValorFab;
		return valAct;
	}
}
