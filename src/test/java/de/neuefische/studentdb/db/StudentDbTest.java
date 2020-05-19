package de.neuefische.studentdb.db;

import de.neuefische.studentdb.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDbTest {

  @Test
  public void toStringWithEmtpyDbShouldReturnEmptyList() {
    //GIVEN
    Student[] students = new Student[0];
    StudentDb db = new StudentDb(students);

    //WHEN
    String result = db.toString();

    //THEN
    assertEquals("[]", result);
  }

  @Test
  public void toStringWithOneStudentShouldReturnListWithStudent() {
    //GIVEN
    Student[] students = new Student[1];
    students[0] = new Student(1, "Rolf");
    StudentDb db = new StudentDb(students);

    //WHEN
    String result = db.toString();

    //THEN
    assertEquals("[" + new Student(1, "Rolf") + "]", result);
  }

  @Test
  public void toStringWithStudentsShouldReturnListWithStudents() {
    //GIVEN
    Student[] students = new Student[3];
    students[0] = new Student(1, "Caro");
    students[1] = new Student(2, "Rolf");
    students[2] = new Student(3, "Peter");
    StudentDb db = new StudentDb(students);

    //WHEN
    String result = db.toString();

    //THEN
    assertEquals("[" +
        new Student(1, "Caro") + "," +
        new Student(2, "Rolf") + "," +
        new Student(3, "Peter")
        + "]", result);
  }


  @Test
  public void addShouldAddAStudentToEmptyDb() {
    //GIVEN
    StudentDb db = new StudentDb();

    //WHEN
    db.add(new Student(1, "Frank"));
    String result = db.toString();

    //THEN
    assertEquals("[" + new Student(1, "Frank") + "]", result);

  }

  @Test
  public void addShouldAddAStudentToDbWithStudents() {
    //GIVEN
    StudentDb db = new StudentDb();
    db.add(new Student(1, "Frank"));
    //WHEN
    db.add(new Student(2, "Caro"));
    String result = db.toString();

    //THEN
    assertEquals("[" + new Student(1, "Frank") + "," +

        new Student(2, "Caro")
        + "]", result);

  }

  @Test
  public void removeShouldRemoveAStudentFromDb() {
    //GIVEN
    StudentDb db = new StudentDb();
    db.add(new Student(1, "Frank"));
    //WHEN
    db.remove(1);
    String result = db.toString();

    //THEN
    assertEquals("[]", result);
  }


  @Test
  public void removeShouldRemoveAStudentFromNotEmptyDb() {
    //GIVEN
    StudentDb db = new StudentDb();
    db.add(new Student(1, "Frank"));
    db.add(new Student(2, "Caro"));
    db.add(new Student(3, "Marwin"));
    //WHEN
    db.remove(2);
    String result = db.toString();

    //THEN
    assertEquals("[" + new Student(1, "Frank") + "," +
        new Student(3, "Marwin")
        + "]", result);
  }
}
