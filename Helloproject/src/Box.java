
public class Box {

	public static void main(String args[]) {
		
		String Select = "선택";
		String Attack = "공격";
		String[] Terran = new String[2];
		Terran[0] = "Marine";
		Terran[1] =  "SCV";
		String[] Zerg = new String[2];
		Zerg[0] = "Drone";
		Zerg[1] = "Zergring";
		String[] result = new String[2];
	
		result[1] = Terran[0].concat(Select);
		result[2] = Zerg[1].concat(Attack);
		
		System.out.println(result[1] + result[2]);
		
		
			
			
		}
	}
