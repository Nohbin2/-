package Main;

import java.util.Scanner;

class Student {
	private String name;
	private String id;
	private int mileage;
	private static int count;

	public Student(String name, String id) { // 설정자
		this.name = name;
		this.id = id;
		this.mileage = 0;
		count++;
	}

	void addMileage(int value) {
		this.mileage += value;
	}
	String getName() {
		return name;
	}
	String getId() {
		return id;
	}
	boolean isPass() {
		if (mileage >= 500) {
			System.out.println(name + "(" + id + "): " + mileage + "->PASS");
			return true;
		} else {
			System.out.println(name + "(" + id + "): " + mileage + "->FAIL");
			return false;
		}
	}

	public static int getStudentCount() {
		return count;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Student[] students = new Student[N];
		for (int i = 0; i < N; i++) {
			String name = sc.next();
			String id = sc.next();
			students[i] = new Student(name, id);
			int M = sc.nextInt();
			for (int j = 0; j < M; j++) {
				int value = sc.nextInt();
				students[i].addMileage(value);
			}
			students[i].isPass();
		}
		System.out.println(Student.getStudentCount());
	}
}
