public class Module {
    private String module_code;
    private double marksICT;
    private double marksCW;

    public Module(String module_code, double marksICT, double marksCW) {
        this.module_code = module_code;
        this.marksICT = marksICT;
        this.marksCW = marksCW;
    }

    private double getFinalMark(){
        return (marksCW + marksICT)/2;
    }

    public boolean isPassed(){
        double finalMark = getFinalMark();

        if (finalMark >= 40) {
            return true;
        } else return false;
    }

    public String getModule_code() {
        return module_code;
    }
}
