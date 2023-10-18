package model;

public class OperacoesMatematicas {

	public static Integer soma(int a, int b, int c) {
		int soma = a+b+c;
		return soma;
	}
	
	public static Integer subtração(int a, int b, int c) {
		int subtração;
		return subtração = a-b-c;
	}
	
	public static Integer divisão(int a, int b, int c) {
		int divisão;
		if(a == 0 || b == 0 || c == 0) {
			throw new ArithmeticException("Nenhum dos valores pode ser zero");
		}else {
			divisão = a/b/c;
			return divisão;
		}
	}
	
	public static Integer resto(int a, int b, int c) {
		int resto;
		if(a == 0 || b == 0 || c == 0) {
			throw new ArithmeticException("Nenhum dos valores pode ser zero");
		}else {
			resto = a%b%c;
			return resto;
		}
	}
	
}
