package CLASS_JAVA.Step3.Class_2;

public class Card implements Comparable<Card>{
    private int num;
    private int flag;
    public Card(int num){
        this.num= num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public int compareTo(Card card) {
        return this.getNum()-card.getNum();
    }
}
