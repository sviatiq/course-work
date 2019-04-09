public class ClassExample {
    private String className;
    private int classNum;
    public int classCode;

    public ClassExample(){
        className = "";
    }

    public ClassExample(String className, int classNum){
        this.className = className;
        this.classNum = classNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    protected void printClassNumber(){
        System.out.println(classNum);
    }



}
