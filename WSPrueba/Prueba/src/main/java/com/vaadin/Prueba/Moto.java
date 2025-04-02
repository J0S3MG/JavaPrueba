package com.vaadin.Prueba;

public class Moto {

	double deprL = 0;
	double deprA = 0;
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
	
	//Builder
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
		deprL = valAct;
		return valAct;
	}
	
	public double CalcularDA(int anoC,double tasaD) {
		var a = AnoUso(anoC);
		var valAct = ValorFab * Math.pow(1-tasaD, AnoUso(anoC));
		deprA = valAct;
		return valAct;
	}
	
	public String VerDescripcion() 
    {
        String data = "Marca: "+ Marca + "| Modelo: " + Modelo + "| Valor de fabricacion: " + ValorFab + "\n" +"Depreciacion lineal: "+ deprL + "\n"+"Depreciacion anual: " + deprA;
        return data;
    }
}
