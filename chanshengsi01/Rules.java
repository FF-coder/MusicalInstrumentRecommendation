package chanshengsi01;
import java.util.ArrayList;
//系统的规则库 可在此添加规则
public class Rules {
    ArrayList condition;//前提
    String result;//后件
    int is_temp;//
    int is_use = 0;//初始时 暂未用到该规则
    static int rulesNum=26;//规则库中规则的个数
    static int addNum=0;//是否添加新规则 添加个数
    ArrayList addRuleCondition;//添加的规则的前提
    String addRuleResult;//添加的后件

    Rules() {
        condition = new ArrayList();
    } //构造
    Rules(ArrayList con,String re)
    {
        this.condition= (ArrayList) con.clone();
        this.result=re;
    }
    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }

    public int getIs_temp() {
        return is_temp;
    }

    public void setIs_temp(int is_temp) {
        this.is_temp = is_temp;
    }

    public ArrayList getCondition() {
        return condition;
    }

    public void setCondition(ArrayList condition) {
        this.condition = (ArrayList) condition.clone();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setAddNum(int is_add){addNum=is_add;}
    public void setAddRuleCondition(ArrayList conditionAdd){conditionAdd=(ArrayList) conditionAdd.clone();}
    public void setAddRuleResult( String resultAdd ){addRuleResult=resultAdd;}
    public static Rules[] RuleInit() { //设置规则
        //rulesNum=10;

//规则
//1 肺活量大∧便携→吹奏类乐器
//2 手指灵活∧便携→拉弦乐器
//3 手指灵活→弹奏乐器
//4 节奏感强→打击乐器
//5 中国文化→民族乐器
//6 外国文化→西洋乐器
//7 吹奏类乐器∧民族乐器→民族吹奏类乐器
//8 吹奏类乐器∧西洋乐器→西洋吹奏类乐器
//9 拉弦乐器∧民族乐器→民族拉弦乐器
//10 拉弦乐器∧西洋乐器→西洋拉弦乐器
//11 弹奏乐器∧民族乐器→民族弹奏乐器
//12 弹奏乐器∧西洋乐器→西洋弹奏乐器
//13 打击乐器∧民族乐器→中国鼓
//14 打击乐器∧西洋乐器→架子鼓
//15 民族吹奏类乐器∧容易入门→竹笛
//16 民族吹奏类乐器∧适合进阶→箫
//17 西洋吹奏类乐器∧高档→长笛
//18 西洋吹奏类乐器∧经济→双簧管
//19 民族拉弦乐器∧音色柔美 →二胡
//20 民族拉弦乐器∧音色厚重→马头琴
//21 西洋拉弦乐器∧音色悠扬→小提琴
//22 西洋拉弦乐器∧音色低沉→大提琴
//23 民族弹奏乐器∧古典底蕴→古筝
//24 民族弹奏乐器∧注重指法→琵琶
//25 西洋弹奏乐器∧古典底蕴→钢琴
//26 西洋弹奏乐器∧注重指法→吉他


       Rules[] r = new Rules[rulesNum]; //初始设置10个规则
        Rules rule0 = new Rules();
        r[0] = rule0;
        ArrayList c0 = new ArrayList();
        c0.add("肺活量大");
        c0.add("便携");
        System.out.println(c0);
        r[0].setCondition(c0);
        r[0].setResult("吹奏类乐器");
        r[0].setIs_temp(1);

        Rules rule1 = new Rules();
        r[1] = rule1;
        ArrayList c1 = new ArrayList();
        c1.add("手指灵活");
        c1.add("便携");
        r[1].setCondition(c1);
        r[1].setResult("拉弦乐器");
        r[1].setIs_temp(1);

        Rules rule2 = new Rules();
        r[2] = rule2;
        ArrayList c2 = new ArrayList();
        c2.add("手指灵活");
        c2.add("风格流派众多");
        r[2].setCondition(c2);
        r[2].setResult("弹奏乐器");
        r[2].setIs_temp(1); //初始时默认设为是中间值

        Rules rule3 = new Rules();
        r[3] = rule3;
        ArrayList c3 = new ArrayList();
        c3.add("节奏感强");
        r[3].setCondition(c3);
        r[3].setResult("打击乐器");
        r[3].setIs_temp(1);



        Rules rule4 = new Rules();
        r[4] = rule4;
        ArrayList c4 = new ArrayList();
        c4.add("中国文化");
        r[4].setCondition(c4);
        r[4].setResult("民族乐器");
        r[4].setIs_temp(1);

        Rules rule5 = new Rules();
        r[5] = rule5;
        ArrayList c5 = new ArrayList();
        c5.add("外国文化");
        r[5].setCondition(c5);
        r[5].setResult("西洋乐器");
        r[5].setIs_temp(1);

        Rules rule6 = new Rules();
        r[6] = rule6;
        ArrayList c6 = new ArrayList();
        c6.add("吹奏类乐器");
        c6.add("民族乐器");
        r[6].setCondition(c6);
        r[6].setResult("民族吹奏类乐器");
        r[6].setIs_temp(1);

        Rules rule7 = new Rules();
        r[7] = rule7;
        ArrayList c7 = new ArrayList();
        c7.add("吹奏类乐器");
        c7.add("西洋乐器");
        r[7].setCondition(c7);
        r[7].setResult("西洋吹奏类乐器");
        r[7].setIs_temp(1);

        Rules rule8 = new Rules();
        r[8] = rule8;
        ArrayList c8 = new ArrayList();
        c8.add("拉弦乐器");
        c8.add("民族乐器");
        r[8].setCondition(c8);
        r[8].setResult("民族拉弦乐器");
        r[8].setIs_temp(1);

        Rules rule9 = new Rules();
        r[9] = rule9;
        ArrayList c9 = new ArrayList();
        c9.add("拉弦乐器");
        c9.add("西洋乐器");
        r[9].setCondition(c9);
        r[9].setResult("西洋拉弦乐器");
        r[9].setIs_temp(1);

        Rules rule10= new Rules();
        r[10] = rule10;
        ArrayList c10 = new ArrayList();
        c10.add("弹奏乐器");
        c10.add("民族乐器");
        r[10].setCondition(c10);
        r[10].setResult("民族弹奏乐器");
        r[10].setIs_temp(1);

        Rules rule11 = new Rules();
        r[11] = rule11;
        ArrayList c11 = new ArrayList();
        c11.add("弹奏乐器");
        c11.add("西洋乐器");
        r[11].setCondition(c11);
        r[11].setResult("西洋弹奏乐器");
        r[11].setIs_temp(1);

        Rules rule12 = new Rules();
        r[12] = rule12;
        ArrayList c12 = new ArrayList();
        c12.add("打击乐器");
        c12.add("民族乐器");
        r[12].setCondition(c12);
        r[12].setResult("中国鼓");
        r[12].setIs_temp(0);

        Rules rule13 = new Rules();
        r[13] = rule13;
        ArrayList c13 = new ArrayList();
        c13.add("打击乐器");
        c13.add("西洋乐器");
        r[13].setCondition(c13);
        r[13].setResult("架子鼓");
        r[13].setIs_temp(0);

        Rules rule14 = new Rules();
        r[14] = rule14;
        ArrayList c14 = new ArrayList();
        c14.add("民族吹奏类乐器");
        c14.add("容易入门");
        r[14].setCondition(c14);
        r[14].setResult("竹笛");
        r[14].setIs_temp(0);

        Rules rule15 = new Rules();
        r[15] = rule15;
        ArrayList c15 = new ArrayList();
        c15.add("民族吹奏类乐器");
        c15.add("适合进阶");
        r[15].setCondition(c15);
        r[15].setResult("箫");
        r[15].setIs_temp(0);

        Rules rule16 = new Rules();
        r[16] = rule16;
        ArrayList c16 = new ArrayList();
        c16.add("西洋吹奏类乐器");
        c16.add("高档");
        r[16].setCondition(c16);
        r[16].setResult("长笛");
        r[16].setIs_temp(0);

        Rules rule17 = new Rules();
        r[17] = rule17;
        ArrayList c17 = new ArrayList();
        c17.add("西洋吹奏类乐器");
        c17.add("经济");
        r[17].setCondition(c17);
        r[17].setResult("双簧管");
        r[17].setIs_temp(0);

        Rules rule18 = new Rules();
        r[18] = rule18;
        ArrayList c18 = new ArrayList();
        c18.add("民族拉弦乐器");
        c18.add("音色柔美");
        r[18].setCondition(c18);
        r[18].setResult("二胡");
        r[18].setIs_temp(0);

        Rules rule19 = new Rules();
        r[19] = rule19;
        ArrayList c19 = new ArrayList();
        c19.add("民族拉弦乐器");
        c19.add("音色厚重");
        r[19].setCondition(c19);
        r[19].setResult("马头琴");
        r[19].setIs_temp(0);

        Rules rule20 = new Rules();
        r[20] = rule20;
        ArrayList c20 = new ArrayList();
        c20.add("西洋拉弦乐器");
        c20.add("音色悠扬");
        r[20].setCondition(c20);
        r[20].setResult("小提琴");
        r[20].setIs_temp(0);

        Rules rule21 = new Rules();
        r[21] = rule21;
        ArrayList c21 = new ArrayList();
        c21.add("西洋拉弦乐器");
        c21.add("音色低沉");
        r[21].setCondition(c21);
        r[21].setResult("大提琴");
        r[21].setIs_temp(0);

        Rules rule22 = new Rules();
        r[22] = rule22;
        ArrayList c22 = new ArrayList();
        c22.add("民族弹奏乐器");
        c22.add("古典底蕴");
        r[22].setCondition(c22);
        r[22].setResult("古筝");
        r[22].setIs_temp(0);


        Rules rule23 = new Rules();
        r[23] = rule23;
        ArrayList c23 = new ArrayList();
        c23.add("民族弹奏乐器");
        c23.add("注重指法");
        r[23].setCondition(c23);
        r[23].setResult("琵琶");
        r[23].setIs_temp(0);

        Rules rule24 = new Rules();
        r[24] = rule24;
        ArrayList c24 = new ArrayList();
        c24.add("西洋弹奏乐器");
        c24.add("古典底蕴");
        r[24].setCondition(c24);
        r[24].setResult("钢琴");
        r[24].setIs_temp(0);

        Rules rule25 = new Rules();
        r[25] = rule25;
        ArrayList c25 = new ArrayList();
        c25.add("西洋弹奏乐器");
        c25.add("注重指法");
        r[25].setCondition(c25);
        r[25].setResult("吉他");
        r[25].setIs_temp(0);

        //可添加rule
//        if (addNum!=0)//需要添加时
//        {
//
//        }

        return r;
    }
    public static void addARule(Rules[] r,ArrayList conditionAdd, String resultAdd,int addIs_temp)
    {
//        this.addRuleCondition=(ArrayList) conditionAdd.clone();
//        this.addRuleResult=resultAdd;
        rulesNum+=1;

//            for (int k=0;k<addNum;k++)
//            {
        Rules ruleAdd = new Rules();
        r[rulesNum-1] = ruleAdd;
//                addRule(conditionAdd, resultAdd);
        ArrayList cAdd = new ArrayList();
        for (int i=0;i<conditionAdd.size();i++)
        {  cAdd.add(conditionAdd.get(i));}
        r[rulesNum-1].setCondition(cAdd);
        r[rulesNum-1].setResult(resultAdd);
        r[rulesNum-1].setIs_temp(addIs_temp);
//            }
    }
}
