package chanshengsi01;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import static chanshengsi01.Rules.rulesNum;

public class GuiTemp extends JFrame {
    JLabel l1;
    Container contentPane;
    String s1="";
    //String[] resultTemp=null;
    Rules[] r1;
//    GuiTemp(){
//    }
//    GuiTemp(int tempCount){
//
//        this.r1 = new Rules[tempCount];//中间结果rule对象
//    }
//    public GuiTemp(Rules r) {
//        super("推理出中间结果");
//
//        this.setSize(200, 200);
//        this.setLocation(800, 150);
//        this.setDefaultLookAndFeelDecorated(true);
//        contentPane = this.getContentPane();
//        contentPane.setLayout(null);
//
//        ArrayList a=r.getCondition();
//        s1=(String) a.get(0);
//        for(int i=1;i<a.size();i++) {
//            s1=s1+"^"+a.get(i);
//        }//获取规则r的前提所对应的字符串
//        s1=s1+"--->"+r.result;
//        l1=new JLabel(s1);
//        l1.setBounds(20, 20, 200, 100);
//        contentPane.add(l1);
//        this.setVisible(true);

  public  GuiTemp(Rules[] r,int tempCount) {
    super("推理过程");

    this.setSize(400, 500);
    this.setLocation(800, 150);
    this.setDefaultLookAndFeelDecorated(true);
    contentPane = this.getContentPane();
    contentPane.setLayout(null);
//    ArrayList a = null;
//   for (int g=0;g<tempCount;g++)
//   {
//       a.add(r[g].getCondition());
//   }
       int x=0;
       for (int i = 0; i < tempCount; i++) { //10
           //获取第i条规则的前提
           ArrayList a = (ArrayList) r[i].getCondition().clone();
           // String s = "(R" + (i + 1) + ")" + (String) a.get(0); //获取第i条规则的前提的首个字符串 eg：体型大
           String s = "(" + (i + 1) + ")" + (String) a.get(0); //获取第i条规则的前提的首个字符串 eg：体型大
           for (int j = 1; j < a.size(); j++) { //获取剩下的字符串 用^连接
               s = s + "∧" + a.get(j);
           }
           s=s+"--->"+r[i].result; //后件
           JLabel l = new JLabel(s);
           l.setBounds(20, x, 300, 100);
           x=x+20; //每加一条规则 对应加高度
           contentPane.add(l);
          // this.setVisible(true);
       }
       //qiangxian
       //String ss="(R15)民族吹奏类乐器"+"∧"+"容易入门"+"--->"+"竹笛";
//      String ss="(4)"+"民族吹奏类乐器"+"∧"+"容易入门"+"--->"+"竹笛";
//      JLabel l1 = new JLabel(ss);
//      l1.setBounds(20, x, 300, 100);
//      x=x+20; //每加一条规则 对应加高度
//      contentPane.add(l1);
       this.setVisible(true);


//
    }
}
