import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Star extends JPanel implements ActionListener {
double points[][] = {
 { -100, -15 }, { -25, -25 }, { 0, -90 }, { 25, -25 },
 { 100, -15 }, { 50, 25 }, { 60, 100 }, { 0, 50 },
 { -60, 100 }, { -50, 25 }, { -100, -15 }
 };
 Timer timer;
 private double angle = 0;

 private double scale = 1;
 private double delta = 0.01;

 private double dx = 1;
 private double tx = 0;
 private double dy = 1;

 private double ty = 0;
private static int maxWidth;
private static int maxHeight;
 public Star() {
 timer = new Timer(10, this);
 timer.start();
 }
 public void paint(Graphics g) {
 super.paint(g);

 Graphics2D g2d = (Graphics2D)g;
 g2d.setBackground(Color.black);
 g2d.clearRect(0, 0, maxWidth+1, maxHeight+1);
 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 g2d.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
 g2d.setColor(Color.YELLOW);




 BasicStroke bs1 = new BasicStroke(16, BasicStroke.CAP_ROUND,
 BasicStroke.JOIN_BEVEL);
 g2d.setStroke(bs1);
 g2d.drawRect(10, 10, 480, 450);

 GeneralPath star = new GeneralPath();
 g2d.translate(50, 50);
 star.moveTo(points[0][0], points[0][1]);
 for (int k = 1; k < points.length; k++)
 star.lineTo(points[k][0], points[k][1]);
 star.closePath();
 g2d.fill(star);
 g2d.draw(star);


 g2d.translate(tx, maxHeight/2);

 g2d.translate(tx, ty);
 g2d.scale(scale, scale);

GradientPaint gp = new GradientPaint(5, 25,new Color(2,50,10), 20, 2, new Color(100,90,100), true);
g2d.setPaint(gp);
g2d.fillRect(50, 50, 80, 30);
 GradientPaint gp1 = new GradientPaint(110, 100,new Color(2,0,100), 20, 2, new Color(209,190,70), true);
 g2d.setPaint(gp1);
 g2d.fillRect(130, 50, 5, 30);
 g2d.setPaint(gp);
 g2d.fillRect(135, 50, 80, 30);
 g2d.setPaint(gp1);
 g2d.fillRect(50, 80, 165, 5);
 g2d.setPaint(gp);
 g2d.fillRect(50, 85, 40, 30);
 g2d.setPaint(gp1);
 g2d.fillRect(90, 85, 5, 30);
 g2d.setPaint(gp);
 g2d.fillRect(95, 85, 75, 30);
 g2d.setPaint(gp1);
 g2d.fillRect(170, 85, 5, 30);
 g2d.setPaint(gp);
 g2d.fillRect(175, 85, 40, 30);
 g2d.setPaint(gp1);
 g2d.fillRect(50, 110, 165, 5);
 g2d.setPaint(gp);
 g2d.fillRect(50, 115, 80, 30);
 g2d.setPaint(gp1);
 g2d.fillRect(130, 115, 5, 30);
 g2d.setPaint(gp);
 g2d.fillRect(135, 115, 80, 30);

 }
 public static void main(String[] args) {
 JFrame frame = new JFrame("Lab_2");
 frame.add(new Star());
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(500, 500);
 frame.setResizable(false);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);

Dimension size = frame.getSize();
 Insets insets = frame.getInsets();
 maxWidth = size.width - insets.left - insets.right - 1;
 maxHeight = size.height - insets.top - insets.bottom - 1;
 }
 public void actionPerformed(ActionEvent e) {
 if ( scale < 0.01 ) {
 delta = -delta;
 } else if (scale > 0.99) {
 delta = -delta;
 }
 if (tx > -1 && tx < 110 && ty == 1) {
  dy = 0;
  dx = 1;
 } 
 else if (tx > 109 && ty > -120 && ty < 2) {
   dy = -1;
   dx = 0;
 } else if (ty < -119 && tx < 120 && tx > 1) {
   dy = 0;
   dx = -1;
 }
 else {
   dx = 0;
   dy = 1;
 }
  tx += dx;
  ty += dy;

 scale += delta;
 angle += 0.02;

 repaint();
 }
}