import java.util.ArrayList;

public class Student {
    private String name;
    private String ID;
    private Module module;


    private ArrayList<Module> modules;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        modules = new ArrayList<>();
        this.module = module;
    }

    public String getName(){
        return this.name; }

    public String getID() {
        return ID;
    }
}