package packageUsha;

public class ClassStatic {
	
	// speed
			private int speed;

			// gear

			private int gear;

			private static int instanceNum=0;
	
	public ClassStatic(){
		this.speed=0;
		this.gear=0;
		instanceNum++;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getInstanceNum() {
		return instanceNum;
	}

	public void setInstanceNum(int instanceNum) {
		instanceNum = instanceNum;
	}

	
	
}
