package de.neuefische.studentdb;

import de.neuefische.studentdb.db.StudentDb;
import de.neuefische.studentdb.model.Student;

public class AppMain {

  public static void main(String[] args) {


    StudentDb db = new StudentDb();

    for (int i = 0; i < args.length; i++) {
      db.add(new Student(i, args[i]));
    }

    System.out.println(db.toString());
    System.out.println(db.randomStudent());

  }

}
