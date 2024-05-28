package SingletonSeminar3zi.main;

import examParticipation.ExamParticipation;
import examParticipation.Student;

public class ProgramSingleton {
    public static void main(String[] args) {
        /*DataBaseConexion dataBaseConexion1 = DataBaseConexion.getInstance("Baza1", 4, "localhost");
        DataBaseConexion dataBaseConexion2 = DataBaseConexion.getInstance("Baza2", 3, "terminalhost");

        System.out.println(dataBaseConexion1);
        System.out.println(dataBaseConexion2);

        dataBaseConexion2.setName("Baza3");
        dataBaseConexion2.setNumberOfTables(100);
        dataBaseConexion2.setConexionLink("terminalHost");

        System.out.println(dataBaseConexion1);*/

        Student student1 = new Student(123, "John", "blabla1@gmail.com", 4);
        Student student2 = new Student(124, "Anna", "blabla2@gmail.com", 2);
        Student student3 = new Student(121, "Andrew", "blabla3@gmail.com", 1);
        Student student4 = new Student(122, "Ciurea", "blabla4@gmail.com", 3);

        ExamParticipation oopExam = new ExamParticipation("Object Oriented Programing");

//        oopExam.studentRegistrationExam(student1);
//        oopExam.studentRegistrationExam(student2);
//        oopExam.studentRegistrationExam(student1);
//        oopExam.studentRegistrationExam(student3);
//        oopExam.studentRegistrationExam(student4);
//        oopExam.studentRegistrationExam(student2);

    }
}