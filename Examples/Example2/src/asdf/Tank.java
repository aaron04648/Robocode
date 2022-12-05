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
	 robot.setTurnRight(10);
	 robot.setAhead(50);
	 }
	}
