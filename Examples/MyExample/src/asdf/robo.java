package asdf;

import java.awt.Color;
import robocode.*;

public class robo extends AdvancedRobot {
	private Radar radar;
		private Cannon cannon;
		private Tank tank;
		public int turn;
		 public void run() {
			 setBulletColor(Color.RED);
			 setColors(Color.BLACK, Color.RED, Color.BLACK);
			 setAdjustRadarForGunTurn(true); // our radar, gun and tank
			 setAdjustGunForRobotTurn(true); // are independently controlled
			 turn = 0;
			 
			 radar = new Radar(this);
			 cannon = new Cannon(this);
			 tank = new Tank(this);
			 
			 while (true) {
				 turn++;
				 tank.move();
				 radar.look();
				 System.out.println("ttt");
				 cannon.fire();
				 execute();
				 }
		 }

			 public void onScannedRobot(ScannedRobotEvent e) {
				 cannon.enemySeen(turn, e);
				 }
				 // Our components may need information from us.
				 // Here is the current turn
				 public int getTurn() {
				 return turn;
				 }
				}