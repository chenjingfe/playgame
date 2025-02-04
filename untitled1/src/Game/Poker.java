package Game;


import Window.GameJframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //游戏主界面
    GameJframe frame;
    //牌的名字
    String name;
    //牌显示正面还是反面
    boolean up;
    //是否可点击
    boolean canClick=false;
    //判断当前状态
    boolean clicked=false;

    public  Poker (GameJframe m, String name, boolean up){
        this.frame=m;
        this.name = name;
        this.up = up;
        //判断当前的牌是显示正面还是背面
        if (this.up){
            this.turnFront();
        }else {
            this.turnRear();
        }
        //设置牌的宽高大小
        this.setSize(71, 96);
        //把牌显示出来
        this.setVisible(true);
        //给每一张牌添加鼠标监听
        this.addMouseListener(this);
    }
    //显示正面
    public void turnFront() {
        this.setIcon(new ImageIcon("D:\\playgame\\untitled1\\poker\\" + name + ".png"));
        this.up = true;
    }

    //显示背面
    public void turnRear() {
        this.setIcon(new ImageIcon("D:\\playgame\\untitled1\\poker\\rear.png"));
        this.up = false;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (canClick) {
            Point from = this.getLocation();
            int step;
            if (clicked){
                step = 20;
            }else {
                step = -20;
            }
            clicked = !clicked;
            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }




    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
