import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] data = new int[4][4];
    private int x = -1;
    private int y = -1;
    int[][] win = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    int step = 0;
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("联系方式");

    public GameJFrame() {
        initJFrame();
        initJMenuBar();
        initData();
        initImage();

        setVisible(true);
    }

    private void initData() {
        //生成随机二维数组
        int[] tempArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        getContentPane().removeAll();
        if (victory()) {
            JLabel winJLable = new JLabel(new ImageIcon("d16/image/win.png"));
            winJLable.setBounds(203, 283, 197, 73);
            getContentPane().add(winJLable);
        }
        //步数
        JLabel stepCount=new JLabel("步数："+step);
        stepCount.setBounds(50,30,100,20);
        getContentPane().add(stepCount);
        //打乱图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel1 = new JLabel(new ImageIcon("d16/images/qiee_" + data[i][j] + ".jpg"));
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel1.setBorder(new BevelBorder(BevelBorder.LOWERED));//加边框
                getContentPane().add(jLabel1);
            }
        }
        //加背景
        JLabel background = new JLabel(new ImageIcon("d16/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        getContentPane().add(background);
        getContentPane().repaint();
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于");
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);
        aboutMenu.add(accountItem);
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);
        setJMenuBar(jMenuBar);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
    }

    private void initJFrame() {
        setSize(603, 680);
        setTitle("拼图 1.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon("d16/images/qiee_full.jpg"));
            all.setBounds(83, 134, 420, 420);
            getContentPane().add(all);
            JLabel background = new JLabel(new ImageIcon("d16/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            getContentPane().add(background);
            getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {//向左
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {//向上
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {//向右
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {//向下
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj= e.getSource();
        if(obj==replayItem){
            step = 0;
            initData();
            initImage();
        } else if (obj==reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();
        }else if (obj==closeItem) {
            System.exit(0);
        }else if (obj==accountItem) {
            JDialog jDialog=new JDialog();
            JLabel jLabel= new JLabel(new ImageIcon("d16/image/about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
