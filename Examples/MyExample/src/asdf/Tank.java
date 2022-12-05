package asdf;
import robocode.*;
public class Tank {
	 private robo robot;
	 public Tank(robo robot) {
	 this.robot = robot;
	 }
	 // We still aren't moving - just turning in a circle
	 // This makes us a lovely target for the other tanks!
	
	 protected void move() {
	 //robot.setTurnRight(10);
		 
		 int tt = robot.turn / 10;
		 if(tt % 2 == 0) {
			 robot.setTurnRight(90);
			 robot.setMaxVelocity(2);
		 robot.setAhead(100);
		 }
		 
		 else {
			 robot.setMaxVelocity(1);
			 robot.setTurnRight(-90);
			 	 robot.setAhead(-100);
			 	
		 }

	 }
	}
