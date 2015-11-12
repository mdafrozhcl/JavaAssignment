package JavaOOPs;

class RandomProgram {

	static int count = 0;

	public RandomProgram() {
		count++;
	}
	
	public static void getCount(){
		System.out.println("Number of object created so far are: "+count);
	}

}

public class ObjectCount{
	public static void main(String[] args){
		System.out.println("Welcome to instances count program");
		RandomProgram rp = new RandomProgram();
		new RandomProgram();
		Object obj = new RandomProgram();
		RandomProgram.getCount();
		
		
	}
}