package course;

/**
 * 课程类，就是一个模板
 */
public abstract class Course {

    protected  final  void createCourse(){
        this.yuxi();
        this.shangke();
        this.send();

        if(needHomework()){
            check();
        }

    }
   //定义的方法形成了一套上课的流程
    final void yuxi(){
        System.out.println("预习资料");
    }
    final  void shangke(){
        System.out.println("开始上课");
    }
    final void send(){
        System.out.println("发送上课资料");

    }
    //抽象方法检查作业，可有可无，只有布置作业才会检查
    abstract void check();
    //进行判断是否留了作业，微妙变化的控制
    protected boolean needHomework(){
        return  false;
    }
}
