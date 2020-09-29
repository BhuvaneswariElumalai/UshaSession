package packageUsha;

public class DemoCars {
	

		// speed
		private int speed;

		// gear

		private int gear;

		// model

		private int model;
		
		
		
		public DemoCars(){
			this(1,4);
			this.speed=0;
			this.gear=0;
			System.out.println("Executing Default Constructor");
			
		}
		
		public DemoCars(int speed ,int gear)
		{
			this.speed = speed;
			this.gear=gear;
			System.out.println("Executing Constructor with arguments");
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

