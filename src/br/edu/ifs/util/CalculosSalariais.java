package br.edu.ifs.util;

public abstract class CalculosSalariais {

	public static double calculoSalario(double salario) {
		if (salario < 2000) {
			return salario * 85 / 100;
		} else {
			return salario * 73 / 100;
		}
	}
}
