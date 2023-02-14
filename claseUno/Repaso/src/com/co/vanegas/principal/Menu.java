package com.co.vanegas.principal;

import java.util.Scanner;

import com.co.vanegas.principal.implementaciones.Multiplicar;
import com.co.vanegas.principal.implementaciones.Restar;
import com.co.vanegas.principal.implementaciones.Sumar;
import com.co.vanegas.principal.uno.OperacionInterface;

public class Menu {

	Scanner sc = new Scanner(System.in);

	public void mostrarMenu() {

		System.out.println("digite el numero uno :");
		double numUno = sc.nextDouble();

		System.out.println("digite el numero dos :");
		double numDos = sc.nextDouble();

		System.out.println("que operacion desaa hacer :");
		int seleccion = sc.nextInt();

		
		switch (seleccion) {
		
		case 1:

			Sumar sm = new Sumar();

			System.out.println(sm.sumar(numUno, numDos));
			break;

		case 2:
			Restar rs = new Restar();

			System.out.println(rs.restar(numUno, numDos));
			break;

		case 3:

			Multiplicar mt = new Multiplicar();
			System.out.println(mt.multiplicar(numUno, numDos));
			break;

		case 4:


			System.out.println(sm.dividir(numUno, numDos));
			break;

		default:
			break;
		}

	}

}
