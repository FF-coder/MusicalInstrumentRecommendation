package chanshengsi01;
import java.util.ArrayList;
import java.util.Arrays;

import static chanshengsi01.Rules.addARule;
import static chanshengsi01.Rules.rulesNum;

public class Brain {
    GuiTemp gt;
    static Rules rule = new Rules();static Rules[] r=new Rules[rulesNum];
    Brain(){r = rule.RuleInit();}

    public String identify(ArrayList al)
    {
        String result = null;

        Postive p = new Postive();
        p.setS1(al); //al为用户的全部输入 字符串组 将al传入p

        Check ch = new Check();
      //  GuiTemp gt = null;
       Rules rule = new Rules();
        Rules[] r = new Rules[rulesNum];//改为static 长度 10
        r = rule.RuleInit();
        System.out.println(r.length);
        int i;
        int temp_count=0;//  temp_count=0;

        //int Max=rulesNum;
        Rules[] tempR=new Rules[rulesNum];
        tempR=rule.RuleInit(); //注：必须初始化！！！!!!!! 不然会报错 空指针？
        for (i = 0; i < r.length; i++)//遍历规则库
        {
            System.out.println(i+":"+r[i].getIs_temp());
            if (r[i].getIs_use() == 0 && ch.checkRule(r[i].getCondition(), p.getS1()) == 1) //若规则i未使用过且其前提字符串集合完全与用户的输入匹配上了
            {
                System.out.println("匹配项是否中间"+r[i].getIs_temp());
                if (r[i].getIs_temp() == 0) // 如果匹配上的规则不是中间值，打印为最终结果；
                {
                    System.out.println("进入if// 如果匹配上的规则不是中间值，打印为最终结果");
                    result = r[i].getResult();
                    System.out.println("have got Result");
                    temp_count+=1;tempR[temp_count]=r[i];
                    System.out.println("最终结果加入tempR");
                   gt= new GuiTemp(tempR,temp_count);
                    System.out.println("TEMPR 最终节点:"+temp_count);
                    break;
                }
                else// 如果规则i是中间值，显示出来，并把结论加到postive中
                {
                    System.out.println("进入if// 如果规则i是中间值，显示出来，并把结论加到postive中");
                    r[i].setIs_use(1);

                    // 显示中间结果界面
                   // gt = new GuiTemp(r[i]);//每个中间值一个窗口。。。。。。
                    Rules ruleT = new Rules(r[i].getCondition(),r[i].getResult());
                    tempR[temp_count]=ruleT;//添加用到过的中间规则

                    System.out.println("TEMPR 中间:"+temp_count);

                    p.s1.add(r[i].getResult());//中间结果加入用户输入作为下一轮的匹配项之一
                    temp_count+=1;//中间结果个数+1
                    // 进行下一轮匹配
                    i = 0;//得到中间结果后要找一步结果需要重新遍历规则库
                }

            }
        }

        if (i >= r.length)//本轮已遍历完仍无可匹配的
        {
            if (temp_count==0)result = "无推荐";//推理无结果    // 如果未匹配到，则机器不认识
            else//推理有结果
            {
                //tempR[temp_count+1]=p.;
//                gt= new GuiTemp(tempR,temp_count);//传入中间结果显示器

               // gt=new GuiTemp(tempR, temp_count);
                gt= new GuiTemp(tempR,temp_count);
                result= (String) p.s1.get(p.s1.size() - 1);//若已有中间结果且新一轮搜索无匹配 则取最后一次中间结果作为最终结果result
                System.out.println(result);
//                r = Arrays.copyOf(r,1);//扩容
//              addARule(r,al,result,0);//添加此规则入
//                System.out.println("add:+1");

            }
        }
       // gt= new GuiTemp(tempR,temp_count);
        //String result1 = result;
        return result;

    }
}
