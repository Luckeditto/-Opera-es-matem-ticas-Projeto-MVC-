package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.OperacoesMatematicas;

@WebServlet("/Resultado")
public class Resultado extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		try {
		PrintWriter writer = response.getWriter();
		String a = request.getParameter("num1");
		String b = request.getParameter("num2");
		String c = request.getParameter("num3");
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int num3 = Integer.parseInt(c);
		
		int soma = OperacoesMatematicas.soma(num1, num2, num3);
		int subtracao = OperacoesMatematicas.subtração(num1, num2, num3);
		int divisao = OperacoesMatematicas.divisão(num1, num2, num3);
		int resto = OperacoesMatematicas.resto(num1, num2, num3);
		
		writer.append("<HTML><BODY>");
		writer.append("A soma dos numeros informados é: "+soma);
		writer.append("A subtração dos numeros informados é: "+subtracao);
		writer.append("A divisão dos numeros informados é: "+divisao);
		writer.append("O resto da divisão dos numeros informados é: "+resto);
		
		writer.append("</HTML></BODY>");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
