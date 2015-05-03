package br.com.quest;

import java.util.ArrayList;
import java.util.List;

public class SomaMax {

	protected static Integer primeiro = 0;
	protected static Integer ultimo = 0;
		
	public static void main(String[] args) {
		try {
			maxSum(args);
			System.out.println("Resultado: Vetores["+ primeiro + ", " + ultimo+"]");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	
	protected static String maxSum(String[] args) throws Exception{
		int imaxSum = 0;
		List<Integer> numList = new ArrayList<Integer>();
		numList = converte(args);		
		for(int iprm = 0; iprm < numList.size(); iprm++ ){
			for(int iult = iprm; iult < numList.size(); iult++){
				int sum = 0;
				for (int k = iprm; k <= iult; k++){
					sum += numList.get(k);
				}
				if(sum > imaxSum){
					imaxSum = sum;
					primeiro = iprm;
					ultimo = iult;	
				}
			}
		}
		
		return "";
	}
	
	private static List<Integer> converte(String[] numerosS) throws Exception {
		validaLista(numerosS);		
		List<Integer> numeros = new ArrayList<Integer>();		
		try {
			for (String numero : numerosS) {
				numeros.add(Integer.parseInt(numero));
			}
		}
		catch (NumberFormatException nfe) {
			throw new Exception("**Erro - Todos os argumentos devem ser numericos");
		}		
		return numeros;				
	}
	
	private static void validaLista(String[] numerosS) throws Exception {
		if (numerosS == null || numerosS.length == 0) {
			throw new Exception("**Erro - A lista deve ser preenchida");
		}
		if (numerosS.length < 3) {
			throw new Exception("**Erro - A lista de argumentos deve conter ao menos 3 elementos");
		}
	}

}
