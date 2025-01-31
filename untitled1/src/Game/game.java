package Game;

import java.util.*;

public class game {
    static ArrayList<Integer> list=new ArrayList<Integer>();
    //只要把牌与序号产生对应关系
    static HashMap<Integer,String>  hap=new HashMap<Integer,String>();

    //准备牌
    //静态代码快
    static {
        //"1,2,3,4,5,6,7,8,9,10"
        String []  color={"方块","梅花","黑桃","红桃"};
        String []  number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num=1;
        for (String s : number) {
            for (String string : color) {
                hap.put(num,string+s);
                num++;
            }
        }
        hap.put(num,"小王");
        num++;
        hap.put(num,"大王");
        for (int i=1;i<=hap.size();i++) {
            list.add(i);
        }

    }
//    1方块3 2梅花3 3黑桃3 4红桃3 5方块4 6梅花4 7黑桃4 8红桃4 9方块5 10梅花5
//11黑桃5 12红桃5 13方块6 14梅花6 15黑桃6 16红桃6 17方块7 18梅花7 19黑桃7 20红桃7
//21方块8 22梅花8 23黑桃8 24红桃8 25方块9 26梅花9 27黑桃9 28红桃9 29方块10 30梅花10
//31黑桃10 32红桃10 33方块J 34梅花J 35黑桃J 36红桃J 37方块Q 38梅花Q 39黑桃Q 40红桃Q
//41方块K 42梅花K 43黑桃K 44红桃K 45方块A 46梅花A 47黑桃A 48红桃A 49方块2 50梅花2
//51黑桃2 52红桃2 53小王 54大王


    public  void test (){
        for (Integer i : list) {
            System.out.print(i+hap.get(i)+" ");
            if (i%10==0){
                System.out.println();
            }
        }
    }
    public game (){
       /* ArrayList<Object> dipai= new ArrayList<>();
        ArrayList<Object> P1= new ArrayList<>();
        ArrayList<Object> P2= new ArrayList<>();
        ArrayList<Object> P3= new ArrayList <>();
        Collections.shuffle(list);

        for (int i=0;i<list.size();i++) {
            if (i<=2){
                dipai.add(list.get(i));
            }
            if (i%3==0){
                P1.add(list.get(i));
            }else if (i%3==1){
                P2.add(list.get(i));
            }else if (i%3==2){
                P3.add(list.get(i));
            }

        }

        sortplay(dipai);
        sortplay(P1);
        sortplay(P2);
        sortplay(P3);

        lookplay("底牌",dipai);
        lookplay("农民",P1);
        lookplay("农民",P2);
        lookplay("地主",P3);*/


    }
    public void lookplay (String name,ArrayList<Object> list){
        System.out.print(name+":");
        for (int i=0;i<list.size();i++) {
            System.out.print(hap.get(list.get(i))+" ");
        }
        System.out.println();
    }
    public void sortplay (ArrayList<Object> list){
       Collections.sort(list,Collections.reverseOrder());
    }




}
