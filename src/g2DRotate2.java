import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
 
public class g2DRotate2 extends Applet implements ActionListener{
 Label label;
 TextField angle;
 Button b1,b2;
 int flag=1;
 
 public void init(){
  setLayout(null);
  label=new Label("旋转角度:");
  label.setBounds(250,100,65,20);
  
  angle=new TextField("0.0",10);
  angle.setBounds(330,100,65,20);
  
  b1=new Button("顺时针旋转");
  b2=new Button("逆时针旋转");
  b1.setBounds(250,130,65,20);
  b2.setBounds(330,130,65,20);
  b1.addActionListener(this);
  b2.addActionListener(this);
  
  add(label);
  add(angle);
  add(b1);
  add(b2);
  
  show();
 }
 
 public void paint(Graphics g){
  int x=130,y=100;
  int i=0;
  Graphics2D g2=(Graphics2D)g;
  g.setColor(Color.blue);
  g2.draw(new Ellipse2D.Double(x,y,20,90));
  
  g.setColor(Color.black);
  g.drawRect(x,y,20,90);
  
  g2.translate(150,100);//平移到（150，100），作为下面旋转的起点
  if(flag==1)
   g2.rotate(Double.parseDouble(angle.getText()));//将角度转换成弧度
  else
   g2.rotate(-Double.parseDouble(angle.getText()));
  g.setColor(Color.blue);
  g2.draw(new Ellipse2D.Double(-20,0,20,90));
  
  g.setColor(Color.black);
  g.drawRect(-20,0,20,90); 
 }
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==b1){
   flag=1;
   repaint();
  }else{
   flag=-1;
   repaint();
  }
 }
}