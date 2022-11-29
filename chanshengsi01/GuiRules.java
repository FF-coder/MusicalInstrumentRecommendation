package chanshengsi01;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import static chanshengsi01.Rules.rulesNum;
import static javax.swing.SwingConstants.VERTICAL;

public class GuiRules extends JFrame {
    JLabel l;
    String s;
    Rules rule;
    //Rules[] r;
    Container contentPane;

    GuiRules() {
        super("查看规则");
        //Scrollbar();//构造一个新的垂直滚动条。
       // Scrollbar SL=new Scrollbar(VERTICAL) ;//构造具有指定方向的新滚动条。
       // Scrollbar(int orientation,20, 30, 5, 30) //构造一个具有指定方向，初始值，可见数量以及最小值和最大值的新滚动条。

        this.setSize(400, 650);
        this.setLocation(800, 150);
        this.setDefaultLookAndFeelDecorated(true);
        contentPane = this.getContentPane();//返回此框架的内容窗格对象
        contentPane.setLayout(null);

        rule = new Rules();
        Rules[] r = new Rules[rulesNum];//10个rule对象
        r = rule.RuleInit();
        //Brain B=new Brain();
        int x=0;
        for (int i = 0; i < rulesNum; i++) { //10
            ArrayList a = r[i].getCondition();//获取第i条规则的前提
            s = "R"+(i+1)+":  "+(String) a.get(0); //获取第i条规则的前提的首个字符串 eg：体型大
            for (int j = 1; j < a.size(); j++) { //获取剩下的字符串 用^连接
                s = s + "∧" + a.get(j);
            }
            s=s+"--->"+r[i].result; //后件
            l=new JLabel(s);
            l.setBounds(20, x, 300, 100);
            x=x+20; //每加一条规则 对应加高度
            contentPane.add(l);
        }
        //contentPane.add(SL);
        this.setVisible(true);
    }
}

