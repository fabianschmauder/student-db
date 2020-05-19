package de.neuefische.studentdb.db;

import de.neuefische.studentdb.model.Student;

public class StudentDb {

  private Student[] students;

  public StudentDb() {
    this.students = new Student[0];
  }

  public StudentDb(Student[] students) {
    this.students = students;
  }

  @Override
  public String toString() {
    String result = "";

    for (int i = 0; i < this.students.length; i++) {
      result += this.students[i];
      if (i < this.students.length - 1) {
        result += ",";
      }
    }

    return "[" + result + "]";
  }

  public Student randomStudent() {
    if (this.students.length < 1) {
      return null;
    }
    int randomIndex = (int) (Math.random() * this.students.length);
    return this.students[randomIndex];
  }

  public void add(Student student) {
    Student[] newStudentArray = new Student[this.students.length + 1];
    for (int i = 0; i < this.students.length; i++) {
      newStudentArray[i] = this.students[i];
    }
    newStudentArray[newStudentArray.length - 1] = student;

    this.students = newStudentArray;
  }

  public void remove(int id) {
    Student[] newStudentArray = new Student[this.students.length - 1];
    boolean studentFound = false;
    for (int i = 0; i < newStudentArray.length; i++) {
      if (this.students[i].getId() == id) {
        studentFound = true;
      }
      int oldIndex = studentFound ? i + 1 : i;
      newStudentArray[i] = this.students[oldIndex];
    }

    this.students = newStudentArray;
  }
}
