package asdf;

public class Radar {
	 private robo robot;
	 
	 
	 
	 public Radar(robo robot) {
		 this.robot = robot;
		 }
	 // Simplistic: turn the radar as fast as we can
	 public void look() {
	 robot.setTurnRadarRight(80);
	 }
}