package org.iesfm.intituto;

import java.util.List;
import java.util.Objects;

public class Instituto {

    private String higthSchoolName;

    private List<Group> groups;

    public Instituto(String higthSchoolName, List<Group> groups) {
        this.higthSchoolName = higthSchoolName;
        this.groups = groups;
    }

    public String getHigthSchoolName() {
        return higthSchoolName;
    }

    public void setHigthSchoolName(String higthSchoolName) {
        this.higthSchoolName = higthSchoolName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(higthSchoolName, instituto.higthSchoolName) && Objects.equals(groups, instituto.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(higthSchoolName, groups);
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "higthSchoolName='" + higthSchoolName + '\'' +
                ", groups=" + groups +
                '}';
    }
}
