package de.neuefische.studentdb.model;

import java.util.Objects;

public class ChemistryStudent implements Student {

  private int id;
  private String name;
  private String program;

  public ChemistryStudent(int id, String name) {
    this.id = id;
    this.name = name;
    this.program = "Chemistry";
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getId() {
    return this.id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getProgram() {
    return this.program;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChemistryStudent that = (ChemistryStudent) o;
    return id == that.id &&
        Objects.equals(name, that.name) &&
        Objects.equals(program, that.program);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, program);
  }
}
