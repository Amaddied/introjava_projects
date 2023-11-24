//nome da classe
class Programa01
{
   //módulo princial com a entrada pela linha de comando
   public static void main (String entrada[])
   {
	//declaração de variáveis
	int inteiro = 24;
	char caracter = 'F';
	double real = 1.75;
	String frase = "Amanda Serafim";
	boolean VF = true;
	
	if (VF==true)
	{
	   System.out.println("Eu sou a " + frase + "tenho " + inteiro +
	   " anos e tenho" + real + "m de altura");
	}
	
	System.exit(0);
   }
}