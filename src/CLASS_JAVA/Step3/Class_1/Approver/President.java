package CLASS_JAVA.Step3.Class_1.Approver;

import CLASS_JAVA.Step3.Class_1.Note;

public class President extends Approver{
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(Note note) {
        if(note.getDay()<30){
            System.out.println("总经理"+this.name+"审批请假:"+note.getDay()+"日");
        }
        else {
            this.successor.processRequest(note);
        }
    }
}
