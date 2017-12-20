//Jonathan Westerfield

import java.util.*;
import java.io.*;

public class Lab11D
{
	private int[] month = new int[20];
	private int[] day = new int[20];
	private int count;
	
	public static void main (String[] args) {
		
		
			Lab11D lab = new Lab11D();
			lab.input();
			lab.output();
		
    }
    public void input()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("zodiac.dat")).useDelimiter("/|\r\n");
    		while(reader.hasNextInt())
    		{
    			month[count] = reader.nextInt();
    			day[count++] = reader.nextInt();
    			
    			
    		}
    		
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println (e);
    		System.exit(0);
    	}
    	
    	
    	
    	
    }
    public void output()
    {
    	for(int i = 0; i < count; i++)
    	{
    		switch(month[i])
    		{
    			case 1 : if(day[i] < 21)
    				System.out.println("Capricorn - The Goat: December 23 - January 20. Practical and prudent");
    				else
    					System.out.println("Aquarius - The Water Carrier: January 21 - February 19. Friendly and humanitarian");
    			break;
    			case 2: if(day[i] < 22)
    				System.out.println("Aquarius - The Water Carrier: January 21 - February 19. Friendly and humanitarian");
    				else
    					System.out.println("Pisces - The Fishes: February 20 - March 20. Imaginative and sensitive" );
    			break;
    			case 3: if(day[i] < 21)
    				System.out.println("Pisces - The Fishes: February 20 - March 20. Imaginative and sensitive" );
    				else
    					System.out.println("Aries - The Ram: March 21 - April 20. Adventurous and energetic" );
    			break;
    			case 4: if(day[i] < 21)
    				System.out.println("Aries - The Ram: March 21 - April 20. Adventurous and energetic" );
    				else
    					System.out.println("Taurus - The Bull: April 21 - May 21. Patient and reliable" );
    			break;
    			case 5: if(day[i] < 22)
    				System.out.println("Taurus - The Bull: April 21 - May 21. Patient and reliable" );
    				else
    					System.out.println("Gemini - The Twins: May 22 - June 21. Adaptable and versatile" );
    			break;
    			case 6: if(day[i] < 22)
    				System.out.println("Gemini - The Twins: May 22 - June 21. Adaptable and versatile" );
    				else
    					System.out.println("Cancer - The Crab: June 22 - July 22. Emotional and loving");
    			break;
    			case 7: if(day[i] < 23)
    				System.out.println("Cancer - The Crab: June 22 - July 22. Emotional and loving");
    				else
    					System.out.println("Leo - The Lion: July 23 - August 21. Generous and warmhearted");
    			break;
    			case 8: if(day[i] < 22)
    				System.out.println("Leo - The Lion: July 23 - August 21. Generous and warmhearted");
    				else
    					System.out.println("Virgo - The Virgin: August 22 - September 23. Modest and Shy");
    			break;
    			case 9: if(day[i] < 24)
    				System.out.println("Virgo - The Virgin: August 22 - September 23. Modest and Shy");
    				else
    					System.out.println("Libra - The Scales: September 24 - October 23. Diplomatic and urbane");
    			break;
    			case 10: if(day[i] < 24)
    				System.out.println("Libra - The Scales: September 24 - October 23. Diplomatic and urbane");
    				else
    					System.out.println("Scorpio - The Scorpion: October 24 - November 22. Determined and forceful");
    			break;
    			case 11: if(day[i] < 22)
    				System.out.println("Scorpio - The Scorpion: October 24 - November 22. Determined and forceful");
    				else
    					System.out.println("Sagittarius - The Archer: November 23 - December 22. Optimistic and freedom-loving" );
    			break;
    			case 12: if(day[i] < 23)
    				System.out.println("Sagittarius - The Archer: November 23 - December 22. Optimistic and freedom-loving" );
    				else
    					System.out.println("Capricorn - The Goat: December 23 - January 20. Practical and prudent");		
    						
    						
    										
    						
    						
    				
    				
    						
    						
    					
    					
    						
    		}
    	}
    }
    	
	
}