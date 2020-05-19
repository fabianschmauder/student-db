package de.neuefische.studentdb.model;

import java.util.Objects;

public class BiologyStudent implements Student{

  private int id;
  private String name;

  public BiologyStudent(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId(){
    return  id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getProgram() {
    return "Biology";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BiologyStudent that = (BiologyStudent) o;
    return id == that.id &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "BiologyStudent{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
