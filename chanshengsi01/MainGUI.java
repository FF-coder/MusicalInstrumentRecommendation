package chanshengsi01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
//该类为主界面类，调用GuiFrame类显示主窗口。

public class MainGUI {


    public static void main(String[] args) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }  //换GUI风格


        GuiFrame g=new GuiFrame("乐器推荐系统");//主窗口
//        JPanel jp=new JPanel();
//        g.add(jp);
//        jp.setBackground(Color.GREEN);
    }

}
