package Mission;


public class Student {
    private int course;
    private String name;
	private String univer;
    
    public Student(int course, String name, String univer) {
        this.course = course;
        this.name = name;
		this.univer = univer;
	}
	
	public int getCourse() {
		return course;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUniver() {
		return univer;
	}
}

class StudentRun {
	
	    public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Михейчик К.А.", "BSUIR"));
		list.add(new Student(2, "Шевелёв А.И.", "BSUIR"));
		list.add(new Student(3, "Кореньков Д.В.", "BSUIR"));
		list.add(new Student(4, "Хлименков А.С.", "BSUIR"));
		list.add(new Student(1, "Рудковский Н.В.", "BSUIR"));
		list.add(new Student(2, "Котугин Н.С.", "BSUIR"));
		list.add(new Student(3, "Добрук И.Д.", "BSUIR"));
		list.add(new Student(4, "Жур Е.А.", "BSUIR"));

		int course = 1;
		printStudents(list, course);

		course = 2;
		printStudents(list, course);

		course = 3;
		printStudents(list, course);

		course = 4;
		printStudents(list, course);

	}

	public static void printStudents(List<Student> students, int course) {
		System.out.println(" ");
		System.out.println("Студенты " + course + " курса:");
		System.out.println(" ");
		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student student = iter.next();
			if (student.getCourse() == course) {
				System.out.println("Ф.И.О.: " + student.getName() + " Университет: " + student.getUniver());
			}
		}
	}
}