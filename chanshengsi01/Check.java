package chanshengsi01;

import java.util.ArrayList;
//用于推理匹配，检查规则库中是否有符合的知识。
public class Check {

    public int checkRule(ArrayList a1, ArrayList a2) {
        int length1 = a1.size();
        int length2 = a2.size();
        //将输入框中内容 与 规则 进行匹配
        for (int i = 0; i < length1; i++) {
            String s1 = (String) a1.get(i);
            int j;
            for (j = 0; j < length2; j++) {
                String s2 = (String) a2.get(j);
                if (s1.equals(s2)) {//若此字符匹配成功 则跳出本轮循环 对a1（某规则的前提 字符串 ）的每个字符串 ，搜索a2（用户的所有输入）字符串
                    break;
                }
            }

            if (j >= length2) { //某个规则的前提 未完全匹配上 用户的输入
                return 0;
            }

        }
        return 1;
    }
}

