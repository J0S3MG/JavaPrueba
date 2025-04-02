package com.vaadin.Prueba;

import java.util.Scanner;

public class Vista {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in); 
        System.out.println("Ingrese los datos de la moto");
        System.out.print("Marca: ");
        String mar = lectura.next();
        System.out.print("Modelo: ");
        int mod = lectura.nextInt();
        System.out.print("Valor de Fabricacion: ");
        double vf = lectura.nextDouble();
        
        Moto moto = new Moto(mar,mod,vf);
        System.out.println("Ingrese Año a calcular: ");
        int anioC = lectura.nextInt();
        System.out.println("Ingrese Tasa de depreciacion: ");
        double tD = lectura.nextDouble();
        System.out.println("Ingrese Vida Util: ");
        int vU = lectura.nextInt();
        
        moto.CalcularDL(anioC, vU);
        moto.CalcularDA(anioC, tD);
        
        System.out.print(moto.VerDescripcion());
	}

}
