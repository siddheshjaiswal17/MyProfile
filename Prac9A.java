import java.awt.*;
import java.awt.event.*;
public class Prac9A extends Frame implements ActionListener
{
TextField t1;
Button b1;
int num,i,fact=1;
String msg,s1;
Label l1, l2,l3;
public Prac9A ()
{
 setLayout(null);
l1=new Label("Enter 1 num ");
l1.setBounds(50,50,80,30);
t1=new TextField(4);
t1.setBounds(180,50,80,30);
b1=new Button("Calculate");
b1.setBounds(50,100,100,30);
l2=new Label("Result");
l2.setBounds(50,150,80,30);
l3=new Label("");
l3.setBounds(150,150,100,30);
add(l1); add(t1);
add(b1);
add(l2);  add(l3);
b1.addActionListener(this);
setLayout(null);
setVisible(true);
setSize(400,400);
}
public void actionPerformed(ActionEvent ae)
{
msg=t1.getText();
if(msg!="")
{
 fact=1;
num=Integer.parseInt(msg);
for(i=num;i>0;i--)
{
 fact=fact*i;
}
s1=""+fact;
l3.setText(s1);
}
}
public static void main(String arg[])
{
 new Prac9A();
  }
}
