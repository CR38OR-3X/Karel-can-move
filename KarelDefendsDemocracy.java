package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
                                           
	public void run() {	                    
		while(frontIsClear()) {
		move();
		searchCenter();
		searchSouth();		
		searchNorth();
		move();	
		}		
	}	
	
	/* While facing east Karel moves forward one space
	 * if there is a beeper present Karel moves forward two spaces
	 * then turns South to look for more beepers
	 */
	private void searchCenter() {		
		if(beepersPresent()) {
			move();
			move();
			}
	}
	/* While facing north Karel checks for obstacles
	 * then moves forward if there are beepers Karel 
	 * grabs them and moves forward then turns facing 
	 * south (2 left turns) and moves forward one space
	 * Karel turns left once to face east again
	 */
	private void searchNorth() {
		if(frontIsClear()) {
			move();								
			}
			while(beepersPresent()) {
				pickBeeper(); 
	}			
				turnAround();
				move();
				turnLeft();
				}			
	/* Karel turn facing south (3 left turns) 
	 * checks for beepers then moves one space forward.
	 * If there are beepers present Karel grabs them. 
	 * Karel then turns facing north (2 left turns) and
	 *  moves forward facing north.
	 */
	private void searchSouth() {
			turnRight();
			move();
			while(beepersPresent()) {
				pickBeeper();
			}
			turnAround();
			move();
			}
	
	}
			
		

