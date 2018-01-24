

class SportsCar extends Car {
		boolean turbo;
		
		
		public void setTurbo(boolean newValue) {
			turbo = newValue;
		}
		
		@Override
		public void speedUp(int increment) {
			speed = speed + 2*increment;
		}
		public void speedDown(int decremnet) {
			speed = speed - 2*decremnet;
		}
		
}
class SUVCar extends Car{
		int pakage;
		int oil;
		public void setpakage(int newValue) {
			pakage = newValue;
		}
		public void setOil(int newOil) {
			oil = newOil;
		}
		public void print() {
			System.out.println("»ö±òÀº = " + color);
			System.out.println("ÁüÄ­ = " + pakage);
			System.out.println("¿¬·á = " + oil);
			
 		}
	}
	
