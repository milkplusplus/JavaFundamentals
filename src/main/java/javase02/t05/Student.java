package javase02.t05;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Student {

    private String name;
    private String universityGroup;

    public Student(String name, String universityGroup) {
        this.name = name;
        this.universityGroup = universityGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversityGroup() {
        return universityGroup;
    }

    public void setUniversityGroup(String universityGroup) {
        this.universityGroup = universityGroup;
    }
}
