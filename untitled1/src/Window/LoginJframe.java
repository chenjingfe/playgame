package Window;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginJframe extends JFrame {


    public LoginJframe() {
        //初始化界面
        initLogin();
        //初始化按钮
        initButton();
        //初始化图片
        initImage();


        //让界面显示出来
        this.setVisible(true);



    }

    private void initButton() {
        JButton jtb=new JButton("Login");
        //设置位置和宽高
        jtb.setBounds(270,250,100,40);
        jtb.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jtb.setBackground(new Color(36, 80, 189)); // 绿色背景
        jtb.setForeground(Color.WHITE);
        jtb.setFocusPainted(false); // 去除焦点边框

        this.setLayout(null);
        //添加动作监听(鼠标左键)
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取当前操作对象
                Object obj=e.getSource();
                if (obj==jtb){
                    new GameJframe();

                }
            }

        });
        this.getContentPane().add(jtb);
    }
    private void initImage() {
        //创建ImageIcon图片对象
        //创建JLabel的对象 （管理容器）
        JLabel label=new JLabel(new ImageIcon("D:\\playgame\\untitled1\\DouDiZhu_background.jpg"));
        //指定图片位置
        label.setBounds(0,0,633,423);
        //把容器添加到界面上
        this.getContentPane().add(label);

    }

    private void initLogin() {
        //设置大小
        this.setSize(633,423);
        //设置标题
        this.setTitle("开始");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置位置
        this.setLocationRelativeTo(null);
        //设置关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
