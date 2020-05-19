package de.neuefische.studentdb;

import de.neuefische.studentdb.db.StudentDb;
import de.neuefische.studentdb.model.BiologyStudent;
import de.neuefische.studentdb.model.ChemistryStudent;
import de.neuefische.studentdb.model.Student;

public class AppMain {

  public static void main(String[] args) {


    Student[] students = new Student[3];

    students[0] = new BiologyStudent(1, "Frank");
    students[1] = new ChemistryStudent(2, "Marwin");

    StudentDb db = new StudentDb(students);

    System.out.println(db.toString());
    System.out.println(db.randomStudent());

    print(new BiologyStudent(1, "Frank"));
    print(new ChemistryStudent(1, "Frank"));
  }

  public static void print(Student student){
    System.out.println(student.getName());
  }


}
