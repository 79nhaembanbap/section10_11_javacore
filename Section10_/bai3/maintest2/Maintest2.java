package maintest2;

import java.util.Scanner;

import Model.Student;
import Service.StudentService;
import ServiceImpl.StudentServiceImpl;

public class Maintest2 {
	public static void main(String[] args) { 
		System.out.println("Nhap so Student ban can");
		int n = new Scanner(System.in).nextInt();

		Student[] students = new Student[n];
		StudentService studentService = new StudentServiceImpl();

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			studentService.input(students[i]);
		}
		
		for (Student student : students) {
			studentService.info(student);
		}
		
		 // tim hoc sinh co so tuoi lon nhat
		
		int max=0,j=0;
		for (int i = 0; i < students.length; i++) {
			if (max < students[i].getAge() ) {
				max= students[i].getAge() ;
				j=i;
						
			}
		}
		System.out.println("Thong tin student co so tuoi lon nhat : ");
		studentService.info(students[j]);
	}
	
	
	
	
	
}
