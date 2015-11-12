package LangPackage;

class Student implements Comparable<Student> {

	String name;
	int rank;

	public Student(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("Comparing - "+this.name+"["+this.rank+"] : "+o.name+"["+o.rank+"]");
		if (this.name.equalsIgnoreCase(o.name)) {
			if (this.rank == o.rank){
				System.out.print("Duplicate ");
				return 0;
			}
			else
				return -1;
		} else
			return +1;
	}

}

public class StudentCompareDemo {
	public static void main(String[] args) {
		Student stud1 = new Student("Afroz Mohammed", 1);
		Student stud2 = new Student("Afroz Mohammed", 5);
		Student stud3 = new Student("Ravitej Varada", 1);
		Student stud4 = new Student("Afroz Mohammed", 1);
		compareStudnets(stud1, stud2);
		compareStudnets(stud1, stud3);
		compareStudnets(stud1, stud4);
		compareStudnets(stud3, stud1);
	}

	private static void compareStudnets(Student stud1, Student stud2) {
		if (stud1.compareTo(stud2) == 0) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
	}
}