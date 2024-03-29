package example_inheritance_composition;

public class Main {

	public static void main(String[] args) {
		Employee e=new Employee(100, "Rajesh", "Revature", "Trainee", 1200.00);
		printAnything(e);
		
		Team team=new Team(99, "Superstars", "JayKumar");
		Player p=new Player(1001, "Kiran", team, "Center");
		printAnything(p);
		
		Person per=new Person(999, "Lucky");
		printAnything(per);
		
		printAnything(new Object());
	}
	
	public static void printAnything(Object o) {
		
		if(o instanceof Employee) {
			Employee e=(Employee) o;
			e.printEmployee();
		}else if(o instanceof Player) {
			Player p=(Player)o;
			p.printPlayer();
		}else if(o instanceof Person) {
			Person p=(Person) o;
			p.printPerson();
		}else {
			System.out.println("Its just java.lang.Object");
		}
		
	}

}
