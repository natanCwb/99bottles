
public class BeerSong {
	
	public static void main (String [] args){
		
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0 ){
			
			if (beerNum == 1){
				word = "bootle";
				
			}//if
			
			System.out.println(beerNum +" "+ word +" of beer on the wall ");
			System.out.println(beerNum +" "+ word +" of beer.");
			System.out.println("Pass it aroud.");
			beerNum = beerNum -1;
			
			if (beerNum >0){
				System.out.println(beerNum + " "+word+ " of beer on the wall");
						}//if
			else{
				System.out.println("No more bottles of beer on the wall");
			}//else
			
			
		}//while
	}

}
