package Array;

import java.util.ArrayList;

public class Student {
	int stdID;
	String stdName;
	ArrayList<Subject> subjectList;
	
	public Student(int stdID, String stdName) {
		this.stdID = stdID;
		this.stdName = stdName;
		subjectList = new ArrayList<Subject>(); // ArrayList ����
	}
	public void addSubject(String name, int score) {
		Subject stdSubject = new Subject(); // Subject Ŭ���� ��ü ����
		stdSubject.setName(name);
		stdSubject.setScore(score);
		subjectList.add(stdSubject); // �迭�� ��ü �����ϱ�
	}
	public void show() {
		int total =0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(stdName + "�л��� "+ "("+ stdID+")"+ subject.getName() + " ������ ���� : " + subject.getScore());
		}
	}
}
