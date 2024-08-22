package xyz.itwill05.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
	public static void main(String[] args) {
		System.out.println("=============== Spring Container 초기화 전 ===============");
		ApplicationContext context=new ClassPathXmlApplicationContext("05-1_di.xml");
		System.out.println("=============== Spring Container 초기화 후 ===============");
		Student student1=context.getBean("student1", Student.class);
		//참조변수를 출력하면 참조변수에 저장된 객체를 참조해 클래스의 toString() 메소드를 
		//호출하여 반환값을 제공받아 출력 처리 - 필드값 확인
		System.out.println(student1);
		System.out.println("==========================================================");
		Student student2=context.getBean("student2", Student.class);
		System.out.println(student2);
		System.out.println("==========================================================");
		Student student3=context.getBean("student3", Student.class);
		System.out.println(student3);
		System.out.println("==========================================================");
		Student student4=context.getBean("student4", Student.class);
		System.out.println(student4);
		System.out.println("==========================================================");
		Student student5=context.getBean("student5", Student.class);
		System.out.println(student5);
		System.out.println("==========================================================");
		((ClassPathXmlApplicationContext)context).close();
	}
}
