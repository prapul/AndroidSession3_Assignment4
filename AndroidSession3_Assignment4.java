package prapul;

public class AndroidSession3_Assignment4 {
	int marks,RollNo, grade;
	String name;
	public static void main(String args[]){
		AndroidSession3_Assignment4 student1 = new AndroidSession3_Assignment4("Prapul", 98, 1, 8);
		System.out.println(student1.toString());
		AndroidSession3_Assignment4 student2 = new AndroidSession3_Assignment4("Payal", 96, 2, 9);
		System.out.println(student2.toString());
		AndroidSession3_Assignment4 student3 = new AndroidSession3_Assignment4("Mamatha", 95, 3, 10);
		System.out.println(student3.toString());
	}
	public AndroidSession3_Assignment4(String n, int m, int r, int g){
		RollNo = r;
		name = n;
		marks = m;
		grade = g;
	}
	public String toString(){
		return ("[Roll Number: "+ RollNo + "]"
				+ ""+"[Name: "+ name + "]"
						+ "" + "[Grade: " + grade + "th grade]"
								+ "" + "[Marks: "+ marks + "]");
	}
}
