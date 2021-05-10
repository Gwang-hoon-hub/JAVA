package Array;

import java.util.ArrayList;

public class Student {
	int stdID;
	String stdName;
	ArrayList<Subject> subjectList;
	
	public Student(int stdID, String stdName) {
		this.stdID = stdID;
		this.stdName = stdName;
		subjectList = new ArrayList<Subject>(); // ArrayList 생성
	}
	public void addSubject(String name, int score) {
		Subject stdSubject = new Subject(); // Subject 클래스 객체 생성
		stdSubject.setName(name);
		stdSubject.setScore(score);
		subjectList.add(stdSubject); // 배열에 객체 저장하기
	}
	public void show() {
		int total =0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(stdName + "학생의 "+ "("+ stdID+")"+ subject.getName() + " 과목의 점수 : " + subject.getScore());
		}
	}
}
