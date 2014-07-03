public class PhraseOMatic{
	public static void main(String[] args){

String[] wordListOne = {"varias camadas", "todos ganham","front-end", "baseado na web"};
String[] wordListTwo = {"habilitado", "adesivo","central", "em rede", "distribuido"};
String[] wordListTrhee = {"maximo", "solucao","arquitetura", "paradigma", "estrategia"};

//Descubra quantas palavras existem em cada lista
int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListTrhee.length;

//Gere tres numeros aleatorios
int rand1 = (int) (Math.random() * oneLength);
int rand2 = (int) (Math.random() * twoLength);
int rand3 = (int) (Math.random() * threeLength);

//Construa uma frase
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListTrhee[rand3];
//Exiba a frase
System.out.println("Precisamos de " + phrase);

	}

}