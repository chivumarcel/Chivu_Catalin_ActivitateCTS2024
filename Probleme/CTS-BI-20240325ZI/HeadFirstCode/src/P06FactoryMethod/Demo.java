package P06FactoryMethod;

public class Demo {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.print("HLD Modules: ");
        System.out.println(hldCourse.modules);
        System.out.print("LLD Modules: ");
        System.out.println(lldCourse.modules);
    }
}
