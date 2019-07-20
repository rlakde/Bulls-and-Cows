/*
<applet code="ht" width=900 height=600>
<param name = "img" value = "fbkaf.png">
<param name = "img1" value = "TITLE.png">
<param name = "img3" value = "HappyZoozoo.jpg">
<param name = "img4" value = "loser.png">

</applet>
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ht extends Applet implements ActionListener
{	Font f;int j,c=0;
	String msg="0",msg2="0",msg3="0",msg4="0",msg5="0",msg6="0",n="0",p="0",v="0";
        Button Newgame,Help,Exit,About,Quit,Enter,Back,Ok;
	Image img,img1,img2,img3,img4;
	 
	TextField name,level,num;
        boolean nextp=false;
        boolean nextr=false;
        boolean status=true;
	 boolean star=true;
	 boolean tar=true;
	boolean nexts=false;
        boolean nextq=false;
	boolean nextt=false;
	boolean nexto=false;
	boolean nextu=false;
	 boolean ar=true;
	int x=0,y,a=1,step=0;
        int d[]=new int[10];
	int b[]=new int[10];
        int cows=0,bulls=0;
public void init()
{
        setBackground(Color.black);
	Newgame = new Button("Newgame");
	
	Help = new Button("Help");
	Exit = new Button("Exit");
	About = new Button("About");
	Quit = new Button("Quit");
	Enter = new Button("Enter");
        Back= new Button("Back");
	Ok = new Button("Ok");
	 name=new TextField(20);
       level=new TextField(20);
	num=new TextField(20);
        img = getImage(getDocumentBase(), getParameter("img"));
	img1 = getImage(getDocumentBase(), getParameter("img1"));
	img2 = getImage(getDocumentBase(), getParameter("img2"));
	img3 = getImage(getDocumentBase(), getParameter("img3"));
	img4 = getImage(getDocumentBase(), getParameter("img4"));
	f=new Font(msg,Font.BOLD,30);
        f=new Font(msg2,Font.BOLD,20);
        f=new Font(msg3,Font.BOLD,20);
	f=new Font(msg4,Font.BOLD,30);
        f=new Font(msg5,Font.BOLD,20);
        f=new Font(msg6,Font.BOLD,20);


        setFont(f);
	msg = "BY: ROHIT LAKDE ";
	 msg2= "Helping Hands:Chinmay,Sameer,Mahendra,Nitin Raje,Akshay,Amit,Santosh. ";
        msg3=  "Created Under Software Lab VJTI,MUMBAI .";
	msg4 = "Cows denotes Correct number with wrong position  ";
        msg5= "Bulls denotes Correct number with correct position ";
        msg6=  "Select level between two to nine.";
        setLayout(null);
	Newgame.setBounds(280,450,90,30);
	Help.setBounds(390,450,80,30);
	Exit.setBounds(480,450,80,30);
	About.setBounds(570,450,80,30);
	Quit.setBounds(680,45,90,30);
	Enter.setBounds(590,70,80,30);
        Back.setBounds(380,400,80,30);
	Ok.setBounds(370,320,80,30);
        name.setBounds(450,160,120,25);
        level.setBounds(450,215,120,25);
	num.setBounds(380,70,120,25);
	
	Ok.addActionListener(this); 
        Enter.addActionListener(this); 
	Newgame.addActionListener(this);
	Exit.addActionListener(this);
	Help.addActionListener(this);
	About.addActionListener(this);
	Back.addActionListener(this);
	add(Newgame);
	add(Help);
	add(Exit);
	add(About);
	add(Enter);
	add(Quit);
        add(Help);
	add(Ok);
	add(name);
        add(level);
	add(num);
        Enter.setVisible(false);
	Quit.setVisible(false);
	Ok.setVisible(false);
	name.setVisible(false);
	level.setVisible(false);
	num.setVisible(false);

}
public void paint(Graphics g)
{



if(nextp)
{
	setBackground(Color.black);
        setForeground(Color.red);
	setBackground(Color.black);
 	g.drawString("Enter Your Name:",250,185);
        g.drawString("Enter Level:",280,240);
        name.setVisible(true);
        level.setVisible(true);
        Ok.setVisible(true); 
	Newgame.setVisible(false);
	Help.setVisible(false);
	Exit.setVisible(false);
	About.setVisible(false);
	 name.setText("");
	 level.setText("");
	step=0;
      

 }



if(nextt)
{
try
{
x=Integer.parseInt(p);
}
catch(Exception e){}


if( x==0)
{
JOptionPane.showMessageDialog(null,new String("Enter level"));
setBackground(Color.black);
        setForeground(Color.red);
	setBackground(Color.black);
 	g.drawString("Enter Your Name:",250,185);
        g.drawString("Enter Level:",280,240);
        name.setVisible(true);
        level.setVisible(true);
        Ok.setVisible(true); 
	Newgame.setVisible(false);
	Help.setVisible(false);
	Exit.setVisible(false);
	About.setVisible(false);
	 name.setText("");
	 level.setText("");
	step=0;
}

else
{	
d=new int[10];
Random r=new Random();



int z=0;
while(z!=x)
{
y=r.nextInt(10) ;
if(a==1&&y!=0)
d[z]=y;
for(int i=0;i<z;i++)
if(d[i]==y||y==0)
{
a=0;
z--;
continue;
}
z++;
a=1;

}
String out=new String("");
for(int i=0;i<x;i++)
out+=""+d[i];

       
      //g.drawString(out,10,50);
      // g.drawString(n,10,100);
       // g.drawString(p,70,100);
       String rt="Enter ur Number";
	name.setVisible(false);
	level.setVisible(false);
	num.setVisible(true);
	 setBackground(Color.black);
        Ok.setVisible(false);Enter.setVisible(true);
         g.drawString(rt, 200,87);
        g.drawImage(img2,0,0,this);
 }
}

if(nexto==true)
{    String rt="Enter ur Number";   
   g.drawString(rt, 200,87);
         int o=0,y=0;
       g.drawImage(img2,0,0,this);
       // g.drawString(v,100,150);
      num.setText("");
try
{
o=Integer.parseInt(v);
}
catch(Exception e){}
 int pown=1;  
	for(int i=0;i<x;i++)
        pown*=10;
          
	step++;
       
	g.drawString(n+    " Step="+step,270,400);
        

       if(o>pown||o<pown/10)
	{
	JOptionPane.showMessageDialog(null,new String("Enter "+p+"digits"));
	
         num.setText("");

        }
 	else
	{
	for(int i=0;i<x;i++)
	{
	y=o%10;
	o/=10;
	b[x-1-i]=y;
	}



	cows=0;
	bulls=0;	
	for(int i=0;i<x;i++)
	{
 	for(int j=0;j<x;j++)
        {
        if(d[i]==b[j])
        {
        if(i==j)
        bulls++;
	else
	cows++;
	}
	}
	}
     g.drawString("Cows: "+cows+" \n Bulls: " +bulls,450,400);
	}
if(bulls==x)
{
 setBackground(Color.red);
Enter.setVisible(false);
num.setVisible(false);
Exit.setVisible(true);
g.drawImage(img3,100,100,this);

g.drawString(n,150,350);
g.drawString("Steps:"+step,130,380);
}


if(step>20)
{Enter.setVisible(false);
num.setVisible(false);
 setBackground(Color.red);
g.drawImage(img4,100,100,this);
Exit.setVisible(true);
}

}

if(nextp==false && nextr==false && nextq==false && nexts==false && nextt==false && nexto==false )
{


g.drawImage(img,0,0,this);
g.drawImage(img1,320,20,this);
}

if(nextr)
{	

        Newgame.setVisible(false);Help.setVisible(false);
        Exit.setVisible(false);About.setVisible(false);
	g.drawString(msg,50,80);
        g.drawString(msg2,50,120);
	g.drawString(msg3,50,160);
	setBackground(Color.black);
        setForeground(Color.red);
      
}
if(nextq)
{	
	setBackground(Color.black);
        setForeground(Color.red);
        Newgame.setVisible(false);Help.setVisible(false);
        Exit.setVisible(false);About.setVisible(false);
	g.drawString(msg4,50,80);
        g.drawString(msg5,50,120);
	g.drawString(msg6,50,160);
	
}


if(nexts)
 {  remove(Back);
    setBackground(Color.black);
    Newgame.setVisible(true);Help.setVisible(true);
Exit.setVisible(true);About.setVisible(true);
    g.drawImage(img,0,0,this); 
    g.drawImage(img1,320,20,this);
}
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==Ok )
    {n=name.getText();
	p=level.getText();
	repaint();
	nextt=true;
	nextp=false;
	nexts=false;
	nextr=false;
	nextq=false;
     }

if(ae.getSource()==Enter)
    { 
	v=num.getText();
	repaint();
	nexto=true;
	nextt=false;
	nextp=false;
	nexts=false;
	nextr=false;
	nextq=false;
	
     }


if(status)
{if(ae.getSource()==Newgame)
{
nextp=true;
nexts=false;
nextr=false;
nextq=false;
nextt=false;
nexto=false;
repaint();
}
}

if(star)
{if(ae.getSource()==About )
{
nextr=true;
nexts=false;
nextp=false;
nextq=false;
nextt=false;
nexto=false;

repaint();
add(Back);
}
}
if(tar)
{if(ae.getSource()==Back)
{
nexts=true;
nextr=false;
nextp=false;
nextq=false;
nextt=false;
nexto=false;

repaint();
}
}
 if(ae.getSource()==Exit)
{nexts=true;
nextr=false;
nextp=false;
nextq=false;
nextt=false;
nexto=false;
repaint();
}




if(ar)
{if(ae.getSource()==Help)
{
nextq=true;
nexts=false;
nextr=false;
nextp=false;
nextt=false;
nexto=false;

repaint();
add(Back);

}
}
}
}



























