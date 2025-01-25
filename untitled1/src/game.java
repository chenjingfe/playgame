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
    //{1=方块3, 2=方块4, 3=方块5, 4=方块6, 5=方块7, 6=方块8, 7=方块9, 8=方块10, 9=方块J, 10=方块Q, 11=方块K, 12=方块A, 13=方块2, 14=梅花3, 15=梅花4, 16=梅花5, 17=梅花6
    // 18=梅花7, 19=梅花8, 20=梅花9, 21=梅花10, 22=梅花J, 23=梅花Q, 24=梅花K, 25=梅花A, 26=梅花2, 27=黑桃3, 28=黑桃4, 29=黑桃5, 30=黑桃6, 31=黑桃7, 32=黑桃8, 33=黑桃9
    // 34=黑桃10, 35=黑桃J, 36=黑桃Q, 37=黑桃K,38=黑桃A, 39=黑桃2, 40=红桃3, 41=红桃4, 42=红桃5, 43=红桃6, 44=红桃7, 45=红桃8, 46=红桃9, 47=红桃10, 48=红桃J, 49=红桃Q
    // 50=红桃K, 51=红桃A, 52=红桃2, 53=小王, 54=大王}


    public game (){
        ArrayList<Object> dipai= new ArrayList<>();
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
        lookplay("地主",P3);


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
