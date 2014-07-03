class BeerSong {
	
	public static void main (String[] args){
    int beerNum = 99;
    String word = "bootles";
	while (beerNum > 0 ){
	if (beerNum == 1 ){
		word = "bootles"; //no singular como em uma garrafa
	    }

	System.out.println("beerNum  "+ " word "+ "of beer on the wall");// O erro eram sinais ++ juntos ou repetidos
	System.out.println("beerNum  "+ " word "+ "of beer ");
	System.out.println("Take on down");
	System.out.println("pass it around");
	beerNum = beerNum - 1;
	if (beerNum > 0){

		System.out.println("beerNum " +  " word " + "of beer on the wall");
	}else{

		System.out.println("No more bootles of beer on the wall");
	     }//fim do else

	} 

 }


}