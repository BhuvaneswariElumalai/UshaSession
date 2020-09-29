package packageUsha;

public class Cars {

	// speed
	private int speed;

	// gear

	private int gear;

	// model

	private int model;
	
	public Cars(){
		this.speed = 0;
		this.gear=0;
	}
	
	public Cars(int speed ,int gear)
	{
		this.speed = speed;
		this.gear=gear;
	}
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed of the car");
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

	public void setModel(int model) {
		
		if(model>2000)
		{
		this.model = model;
		}
		else{
			System.out.println("This is not a valid model");
		}
	}

	public int getModel() {

		return this.model;
	}

}
