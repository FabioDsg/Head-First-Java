public class MovieTestDrive{
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = 2;

		Movie Two = new Movie();
		Two.title = "Lost in public Space";
		Two.genre = "Comedy";
		Two.rating= 5;
		Two.playIt();

		Movie three = new Movie();
		three.title = "Byte club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;


	}
}