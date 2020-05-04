package fastcampus.cofT;

public class CoffeeTest {

		public static void main(String[] args) { 
			
			 
			Person kim = new Person("Kim", 10000); 
			Person Lee = new Person("Lee", 7000); 
			StarCoffee starCoffee = new StarCoffee(); 
			BeanCoffee beanCoffee = new BeanCoffee(); 
		 		 
			kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO); 
			Lee.buyBeanCoffee(beanCoffee, Menu.BEANAMERICANO);


	}
}

