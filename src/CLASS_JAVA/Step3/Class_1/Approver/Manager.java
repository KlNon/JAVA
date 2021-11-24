package CLASS_JAVA.Step3.Class_1.Approver;

import CLASS_JAVA.Step3.Class_1.Note;

public class Manager extends Approver{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(Note note) {
        if(note.getDay()<10){
            System.out.println("经理: "+this.name+" 审批请假:"+note.getDay()+"日");
        }
        else {
            this.successor.processRequest(note);
        }
    }
}
