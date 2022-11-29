package chanshengsi01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

//该类主要实现主界面的布局，以及两个按钮的监听器。
// 点击匹配按钮会调用Brain类的identify函数，来根据输入到综合数据库的事实去匹配结果。
// 点击查看规则按钮会调用GuiRules显示出规则库里面的知识。
public class GuiFrame extends JFrame {
    //JFrame扩展于AWT的Frame类，JFrame是Swing的组件。Swing是AWT的升级版本。



    JButton button;//匹配按钮
    JButton button1;//查看规则按钮
    JLabel label;//标题标签
    JLabel label_result;//结果标签
    JTextField textField1;//输入框1
    JTextField textField2;//输入框2
    JTextField textField3;//输入框3
    JTextField textField4;//输入框4
    Container contentPane;

    public GuiFrame(String title) {  //title “”
        super(title); //supper创建一个具有指定标题 的最初不可见的新框架。此构造函数将组件的区域设置属性设置为 JComponent.getDefaultLocale 返回的值。
        this.setSize(330, 350);
        this.setLocation(350, 150);
        this.setDefaultLookAndFeelDecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("推理");
        button.setBounds(60, 168, 75, 30);
        button1 = new JButton("查看规则");
        button1.setBounds(150, 168, 100, 30);
        label = new JLabel("设置事实（初学者的特点或兴趣方向）");
        label.setBounds(55, 2, 250, 50);
        label_result = new JLabel("推荐乐器：");
        label_result.setBounds(60, 210, 200, 20);
        textField1 = new JTextField(16);
        textField1.setBounds(55, 40, 200, 23);
        textField2 = new JTextField(16);
        textField2.setBounds(55, 72, 200, 23);
        textField3 = new JTextField(16);
        textField3.setBounds(55, 104, 200, 23);
        textField4 = new JTextField(16);
        textField4.setBounds(55, 136, 200, 23);
        contentPane = this.getContentPane();
        contentPane.setLayout(null);

        // 添加控件到容器
        contentPane.add(label);
        contentPane.add(textField1);
        contentPane.add(textField2);
        contentPane.add(textField3);
        contentPane.add(textField4);
        contentPane.add(button);
        contentPane.add(button1);
        contentPane.add(label_result);


        // 设置按钮点击作用
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  //监听用户行为
                ArrayList al = new ArrayList();//用来存储输入框中用户填写的的字符串
                String str1 = textField1.getText();// 获取输入内容
                if (!str1.equals("")) {
                    al.add(str1);
                }
                String str2 = textField2.getText();// 获取输入内容
                if (!str2.equals("")) {
                    al.add(str2);
                }
                String str3 = textField3.getText();// 获取输入内容
                if (!str3.equals("")) {
                    al.add(str3);
                }
                String str4 = textField4.getText();// 获取输入内容
                if (!str4.equals("")) {
                    al.add(str4);
                } //al存储用户的所有输入

                // 匹配
                Brain brain = new Brain();//new一个推理机
                String result = brain.identify(al);//将a1输入推理机推理

                // 结果界面
                label_result.setText("推荐乐器:" + result);
                setVisible(true);//设置该窗口可见？？？
               // result=null;//清空结果
            }
        });

        button1.addActionListener(new ActionListener() { //查看规则按钮的监听按下按钮后
            public void actionPerformed(ActionEvent e) {
                GuiRules gt=new GuiRules();
            }
        });
        this.setVisible(true);//设置guiframe窗口可见

    }
}

