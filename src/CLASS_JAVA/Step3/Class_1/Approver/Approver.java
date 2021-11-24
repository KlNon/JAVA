package CLASS_JAVA.Step3.Class_1.Approver;

import CLASS_JAVA.Step3.Class_1.Note;

public abstract class Approver {
    Approver successor;
    String name;
    public Approver(String name)
    {
        this.name=name;
    }

//    设置上司
    public void setSuccessor(Approver successor){
        this.successor=successor;
    }

//    提交假条
    public abstract void processRequest(Note note);
}
