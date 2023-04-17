import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private int mileage;
    private static int count;
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.mileage = 0;
        count++;
    }
    public void addMileage(int mileage){
        this.mileage += mileage;
    } // 객체가 들고 있는 값
    public boolean isPass() {
        if(mileage >= 500){
            System.out.println(name+"("+id+"): 마일리지->PASS");
            return true;
        }
        else{
            System.out.println(name+"("+id+"): 마일리지->FAIL");
            return false;
        }
    }
    public static int getStudentCount(){ //고정
        return count; //값
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Student[] students = new Student[N]; //객체
        for(int i = 0; i < N; i++) {
            String name = sc.next();
            String id = sc.next();
            students[i] = new Student(name, id);

            int M = sc.nextInt();

            for (int j = 0; j < M; j++) {
                int mileage = sc.nextInt();
                students[i].addMileage(mileage);
            }
        }
        for (int i = 0; i < N; i++){
            students[i].isPass();
        }
        System.out.println(Student.getStudentCount()); //클래스
    }
}
