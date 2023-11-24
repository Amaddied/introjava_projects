class Programa03
{
   //módulo princial com a entrada pela linha de comando
   public static void main (String entrada[])
   {
	//declaração de variáveis
	int NumInt;
	double NumReal, soma;
    char Caracter;
	
    //entrada de dados
    NumInt = Integer.parseInt(entrada[0]);
    NumReal = Double.parseDouble(entrada[1]);
    Caracter = (entrada[2]).charAt(0);
    //processamento
    soma = (double)NumInt + NumReal;
    //saida de resultados
	System.out.println((double)NumInt + " + " +NumReal + " = " + soma + "sinal" + Caracter);
	System.exit(0);
   }
}