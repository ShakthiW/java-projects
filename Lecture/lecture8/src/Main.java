public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getID());

        Student s2 = new Student("Shakthi", "w1954044", 88, 90);
        System.out.println(s2.getName());
        System.out.println(s2.getID());

        Student s3 = new Student("Raveen", "w1954123");
        System.out.println(s3.getName());
        System.out.println(s3.getID());
    }
}