package Window;

import Game.game;

import javax.swing.*;
import java.util.ArrayList;

public class GameJframe extends JFrame {
    static ArrayList<Object> list=new ArrayList<>();
    static  {
        for (int i = 0; i < 54; i++) {
            JLabel label = new JLabel(new ImageIcon("gamepicture/"+(i+1)+".png"));
            label.setHorizontalAlignment(JLabel.CENTER);
            list.add(label);
        }

    }
    //设置界面的宽高
    public GameJframe() {
        initJFrame();
        initJmenuBar();
        new  game();







    }

    private void initJmenuBar() {
        //初始化菜单
        //创建对象
        JMenuBar menuBar = new JMenuBar();

        //创建选项对象
        JMenu menu =new JMenu("功能");


        //创建选项下的条目对象
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem closeItem=new JMenuItem("关闭游戏");
        menu.add(replayItem);
        menu.add(closeItem);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603,600);
        //设置界面的标题
        this.setTitle("游戏界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置位置
        this.setLocationRelativeTo(null);
        //设置关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private  void Initimage (){
        JLabel jab=new JLabel(new ImageIcon("D:\\user\\user.png"));



    }


}
