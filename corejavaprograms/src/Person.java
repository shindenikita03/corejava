
public class Person {
	
		String name;
		 
		public  Person(String name){
		this.name = name;
			
		}
		
		public void greet()
		{
			System.out.println("Hey, my name is: " + name);
		}
		
     public static void main(String[] args) {
			
			
			Person person = new Person("Nikita");
			  
			person.greet();
		
	}

}
