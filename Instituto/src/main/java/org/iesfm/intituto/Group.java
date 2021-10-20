package org.iesfm.intituto;

import java.util.List;
import java.util.Objects;

public class Group {
    private String letter;
    private String course;
    private List<Student> students;

    public Group(String letter, String course, List<Student> students) {
        this.letter = letter;
        this.course = course;
        this.students = students;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(letter, group.letter) && Objects.equals(course, group.course) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, course, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "letter='" + letter + '\'' +
                ", course='" + course + '\'' +
                ", students=" + students +
                '}';
    }
}
