package course;

public class JavaCourse extends Course {
    private  boolean flag=false;

    public JavaCourse(boolean flag) {
        this.flag=flag;
    }

    @Override
    void check() {
        System.out.println("检查java课后作业");
    }
    protected boolean needHomeWork(){
        return this.flag;
    }
}
