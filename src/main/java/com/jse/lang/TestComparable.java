package com.jse.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * description: Comparable（实体类直接实现）和Comparator（作为一个比较器）的比较，参考java 151个建议那边电子书第73条
 *
 * createtime: 2013-4-18 上午10:12:03
 *
 * @author zenghua
 * @version 1.0
 */

public class TestComparable {
	public static void main(String[] args) {
		Employee e1 = new Employee("zhangshan", 32);
		Employee e2 = new Employee("lisi", 1);
		Employee e3 = new Employee("a", 21);
		Employee e4 = new Employee("b", 12);
		Employee e5 = new Employee("boss", 41);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		Collections.sort(employees);
		for (Employee e : employees) {
//			System.out.println(e);
		}
		
		
		//---------测试Comparator--------
		Student s1 = new Student("a", 5, 5);
		Student s2 = new Student("a", 4, 26);
		Student s3 = new Student("c", 15, 12);
		Student s4 = new Student("d", 20, 34);
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		Collections.sort(students, new StudentComparator());
		for (Student s : students) {
			System.out.println(s);
		}
	}
}

//Comparable优势在于
class Employee implements Comparable<Employee> {
	private String name;
	private Integer age;
	
	
	public Employee() {
		
	}
	
	public Employee (String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Collections.sort方法根据这里的返回值进行排序，负数表示当前值小于引用对象的值，0表示相等，整数表示大于
	@Override
	public int compareTo(Employee o) {
//		return this.getAge().compareTo(o.getAge());
		//CompareToBuilder可以对一个对象中的多个属性进行排序，参考文档
//		System.out.println("this.getAge() : " + this.getAge());
//		System.out.println("o.getAge() : " + o.getAge());
//		System.out.println("=========================================");
		//参考ComparableTimSort\TimSort的算法
		return new CompareToBuilder().append(age, o.getAge()).toComparison();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


//---------------------------Comparator进行比较----------------------------------------
class Student {
	private String name;
	private int number;
	private int age;
	
	public Student(String name, int number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

//比较器的作用比较灵活，可以根据不同的需求使对象的属性进行比较
class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		//先按照学号再按年龄排序，
		return new CompareToBuilder().append(o1.getName(), o2.getName())
			.append(o1.getNumber(), o2.getNumber())
			.append(o1.getAge(), o2.getAge()).toComparison();
	}
	
}