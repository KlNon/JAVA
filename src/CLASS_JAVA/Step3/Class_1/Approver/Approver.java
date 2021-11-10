package CLASS_JAVA.Step3.Class_1.Approver;

import CLASS_JAVA.Step3.Class_1.Note;

public abstract class Approver {
    Approver successor;
    String name;
    public Approver(String name)
    {
        this.name=name;
    }

    public void setSuccessor(Approver successor){
        this.successor=successor;
    }

    public abstract void processRequest(Note note);
}
