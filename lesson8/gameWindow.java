package lesson8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

class GameWindow extends JFrame {
    private static GameWindow gameWindow = new GameWindow();
    private static Image background;
    private static Image target;

    private static float targetLeft = 100;  //координата х верхнего левого угла цели
    private static float targetTop = -200;  //координата y верхнего левого угла цели

    private static int score = 0;

    public static void main(String[] args) throws IOException {

        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.jpg"));
        target= ImageIO.read(GameWindow.class.getResourceAsStream("target.png"));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200, 100);
        gameWindow.setSize(852, 480);
//        lastFrameTime = System.nanoTime(); //возвращает текущее время в наносекундах

        GameField gameField = new GameField();
        gameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX(); // координаты курсора
                int y = e.getY();
                float rocket_right = targetLeft + target.getWidth(null); //ширина объекта
                float rocket_bottom = targetTop + target.getHeight(null); //высота объекта
                boolean coinx = x >= targetLeft && x <= rocket_right && y >= targetTop && y <= rocket_bottom;
                if (coinx) {
                    targetTop = -100;
                    targetLeft =(int) (Math.random() * (gameField.getWidth() - target.getWidth(null)));
//                    rocket_v = rocket_v + 20;
                    score++;
                    gameWindow.setTitle("Score: " + score);
                }


            }
        });
        gameWindow.add(gameField);
        gameWindow.setResizable(false);
        gameWindow.setVisible(true);

    }
    private static  void onRepaint (Graphics g) {
//        long current_time = System.nanoTime();
//        float delta_time = (current_time - last_frame_time) * 0.000000001f; //считаем разницу во времени между кадрами и переводим в секунды
//        last_frame_time = current_time;
//        rocket_top = rocket_top + rocket_v * delta_time; //движение по оси у
        //rocket_left = rocket_left + rocket_v * delta_time; //движение по оси х
        g.drawImage(background, 0,0, null);
        g.drawImage(target, (int) targetLeft, (int) targetTop, null);




    }
    private static class  GameField extends JPanel {
        @Override
        protected  void  paintComponent (Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}
