public class Student {
    // Data
    private String name;
    private String ID;
    private int marksICT;
    private int marksCW;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String ID, int marksICT, int marksCW) {
        this.name = name;
        this.ID = ID;
        this.marksICT = marksICT;
        this.marksCW = marksCW;
    }

    // Constructor overloading
    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getMarksICT() {
        return marksICT;
    }

    public void setMarksICT(int marksICT) {
        this.marksICT = marksICT;
    }

    public int getMarksCW() {
        return marksCW;
    }

    public void setMarksCW(int marksCW) {
        this.marksCW = marksCW;
    }
}

