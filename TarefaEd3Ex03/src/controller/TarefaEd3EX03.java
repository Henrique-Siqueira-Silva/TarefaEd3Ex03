package controller;

public class TarefaEd3EX03 {
	
	public TarefaEd3EX03 () {
		super();
	}
		
	public String Ex03 (String palavra, String retorno, int tamanho){
		if (tamanho < 1 ) {
//			A condição de parada é quando o tamanho < 1, ou seja, quando todas as letras já foram escritas na ordem contraria.
			
			return retorno;
		}
		else {
			retorno = retorno + palavra.substring(tamanho - 1, tamanho);
		
			}
		
		return Ex03 (palavra,retorno, tamanho - 1);

	}
}
