package utilitarios;

public class ConverteMoeda {

	public static double IOF = 0.06;
	
	public static double dolarReal(double valorMoeda, double totalCompra) {
		return totalCompra * valorMoeda;		
	}
	
	public static double dolarRealImposto(double valorMoeda, double totalCompra) {
		return totalCompra * valorMoeda * (1.0 + IOF);		
	}
	
}
