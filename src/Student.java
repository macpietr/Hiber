public class Student {
    private int studentId;
    private String name;
    private String surname;

    public Student(){}
    public Student(int studentId, String name, String surname){
        this.studentId=studentId;
        this.name=name;
        this.surname=surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
