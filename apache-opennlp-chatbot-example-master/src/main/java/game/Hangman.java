package game;
//Handles updating the ASCII Hangman image, checking how many lives are left and ending the game if 0
public class Hangman 
{
	private int lives = 6;
	private String image = " _____\n" +
						   " |/\n" +
						   " |\n" +
						   " |\n" +
						   " |\n" +
						   " |\n" +
						   " |\n" +
						   "========\n";

	//take a life and update the hangman image
	public void next() 
	{
		lives--;
		switch (lives)
		{
			case 0:	image = " _____\n" +
							" |/  |\n" +
							" |   0\n" +
							" |  -O-\n" +
							" |   \" \n" +
							" |\n" +
							" |\n" +
			
							"========\n";
					break;
				
			case 1:	image = " _____\n" +
							" |/  |\n" +
							" |   0\n" +
							" |  -O-\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							"========\n";
					break;
		
			case 2:	image = " _____\n" +
							" |/  |\n" +
							" |   0\n" +
							" |  -O\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							"========\n";
					break;
			
			case 3: image = " _____\n" +
							" |/  |\n" +
							" |   0\n" +
							" |   O\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							"========\n";
					break;
			
			case 4: image = " _____\n" +
							" |/  |\n" +
							" |   0\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							"========\n";
					break;
			
			case 5: image = " _____\n" +
							" |/  |\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							" |\n" +
							"========\n";
					break;
		}		
	}

	public void draw() 
	{
		System.out.println(image);		
	}

	public void gameOverCheck() 
	{
		if (lives == 0)
			Game.gameOver();		
	}
	
}
