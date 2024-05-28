package examParticipation;

public class Student {
    private int id;
    private String name;
    private String email;
    private int year;

    public Student(int id, String name, String email, int year) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student id: " + id +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nYear of study: " + year + "\n\n";
    }
}
