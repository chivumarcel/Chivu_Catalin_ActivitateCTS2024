package examParticipation;

import java.util.HashMap;
import java.util.Map;

public class ExamParticipation {

    private String subject;
    private Map<Integer, Student> studentsList = new HashMap<>();

    public ExamParticipation(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public Map<Integer, Student> getStudentsList() {
        return studentsList;
    }

    public void studentRegistrationExam(Student student) {
        if (studentsList.containsKey(student.getId())) {
            System.out.println("Permission denied for " + student.getName() + " to participate at " + subject + " exam because already has participated.\n");
        } else {
            studentsList.put(student.getId(), student);
            System.out.println("Permission accepted for " + student.getName() + " to participate at " + subject + " exam.\n");
        }
    }
}