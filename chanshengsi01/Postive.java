package chanshengsi01;

import java.util.ArrayList;
//综合数据库，用于接收用户输入的事实或者推理机产生的中间结果
public class Postive {
    public ArrayList s1;

    Postive() {
        s1 = new ArrayList();
    }

    public ArrayList getS1() {
        return s1;
    }
    public void setS1(ArrayList s1) {
        this.s1 = (ArrayList) s1.clone();
    }
    public void delete() {
        this.s1.clear();
    }
}
