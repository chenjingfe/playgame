package Window;

import Game.Poker;
import Game.game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class GameJframe extends JFrame {
    //管理 地主按钮
    JButton []landlord=new JButton [2];

    //管理出牌按钮
    JButton [] publishCard=new JButton [2];
    //集合嵌套集合
    //大集合中有三个小集合，分别对应3个玩家要出的牌
    ArrayList<ArrayList<Poker>> currentlist=new ArrayList<>();

    //集合嵌套集合
    //有三个小集合，分别对应玩家手上的牌
    ArrayList<ArrayList<Poker>> playerlist=new ArrayList<>();


    //牌盒，装所有的牌
    ArrayList<Poker> pokerList = new ArrayList();

    //设置根容器
    private final JPanel root=new JPanel();

    //设置界面的宽高
    public GameJframe() {
        initJFrame();
        this.setContentPane(root);
        root.setLayout(null);
        initCard();

        root.setBackground(Color.CYAN);



        this.setVisible(true);


    }
    private  void initCard () {
        //准备牌
        //把所有的牌，包括大小王都添加到牌盒cardList当中
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 13; j++) {
                if ((i == 5) && (j > 2)) {
                    break;
                } else {
                    Poker poker = new Poker(this, i + "-" + j, true);
                    poker.setLocation(350, 150);

                    pokerList.add(poker);
                    root.add(poker);
                }
            }
        }
        //洗牌
        Collections.shuffle(pokerList);
        //创建三个集合用来装三个玩家的牌，并把三个小集合放到大集合经行管理
        ArrayList<Poker> player0 = new ArrayList<>();
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();
        for (int i=0;i<pokerList.size();i++) {
            //获取当前遍历的牌
            Poker poker = pokerList.get(i);

        }
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(830, 620);
        //设置界面的标题
        this.setTitle("游戏界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置位置
        this.setLocationRelativeTo(null);
        //设置窗口无法调节
        this.setResizable(false);
        //设置关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private  void initJButton () {
        //创建抢地主的按钮
        JButton robBut=new JButton("抢地主");
        //设置位置
        robBut.setBounds(320,400,75,20);
        //添加点击事件

        //设置隐藏
        robBut.setVisible(false);
        //添加到数组中统一管理
        landlord[0]=robBut;
        //添加到界面
        root.add(landlord[0]);

        //创建不抢的按钮
        JButton noBut=new JButton("不抢");
        //设置位置
        noBut.setBounds(420,400,75,20);
        //添加事件

        //设置隐藏
        noBut.setVisible(false);
        //添加到数组统一管理
        landlord[1]=noBut;
        //添加到界面
        root.add(landlord[1]);


        //创建出牌的按钮
        JButton outCardBut = new JButton("出牌");
        outCardBut.setBounds(320, 400, 60, 20);
        //outCardBut.addActionListener(this);
        outCardBut.setVisible(false);
        publishCard[0] = outCardBut;
        root.add(outCardBut);

        //创建不要的按钮
        JButton noCardBut = new JButton("不要");
        noCardBut.setBounds(420, 400, 60, 20);
       // noCardBut.addActionListener(this);
        noCardBut.setVisible(false);
        publishCard[1] = noCardBut;
        root.add(noCardBut);



        //创建倒计时
        //每个玩家一个


    }


}
