programa
{
	funcao inicio()
	{
		inteiro cont=0,x,mult2,mult3,mult5

		     mult2 = 100/2

			mult3 = 100/3

			mult5 = 100/5

                escreva("\nM�ltiplos de 2 entre 1 e 100: ",mult2)
		      escreva("\nM�ltiplos de 3 entre 1 e 100: ",mult3)
		      escreva("\nM�ltiplos de 5 entre 1 e 100:: ",mult5)

		para (x=1;x<=100;x++)
		{
			se (x%2==0 e x%3==0 e x%5==0)
			{
				cont++
				 escreva("\n� m�ltiplo de 2,3 e 5: ",x)
				
			}
		}
		       
		      escreva("\nH� ",cont," n�meros m�ltiplos de 2,3 e 5 ao mesmo tempo!")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */