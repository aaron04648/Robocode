package asdf;

import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class Cannon {
	private robo robot;
	private ScannedRobotEvent target;
	private int turnSeen;
	private double targetDirection;

	public Cannon(robo robot) {
		this.robot = robot;
	}

	// We immediately determine the target's absolute bearing
	public void enemySeen(int turnSeen, ScannedRobotEvent target) {
		this.turnSeen = turnSeen;
		this.target = target;
		double targetBearing = target.getBearingRadians();
		double robotHeading = robot.getHeadingRadians();
		targetDirection = Utils.normalRelativeAngle(targetBearing + robotHeading);
		System.out.println("Target direction: " + targetDirection);
	}

	public void fire() {
		int turnsAgo = robot.getTurn() - turnSeen;
		System.out.println("test");
		if (target != null & turnsAgo <= 3) {
			double power = 3;
			if (target.getDistance() > 300)
				power = 1;
			double gunHeading = Utils.normalRelativeAngle(robot.getGunHeadingRadians());
			double gunTurn = targetDirection - gunHeading;
			System.out.println("Gun heading: " + gunHeading);
			System.out.println("Gun turn" + gunTurn);
			System.out.println();
			robot.setTurnGunRightRadians(gunTurn);
			if (Math.abs(gunTurn) < 0.1) { // we will be able to fire
				if (robot.getGunHeat() <= 0) {
					robot.setFire(power);
				}
			}
		}
	}
}
