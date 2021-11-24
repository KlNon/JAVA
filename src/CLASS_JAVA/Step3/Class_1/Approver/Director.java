package CLASS_JAVA.Step3.Class_1.Approver;

import CLASS_JAVA.Step3.Class_1.Note;

public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(Note note) {
        if(note.getDay()<3){
            System.out.println("主任: "+this.name+" 审批请假:"+note.getDay()+"日");
        }
        else {
            this.successor.processRequest(note);
        }
    }
}
