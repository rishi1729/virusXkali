//this program is just a harmless virus created by rishi anand
//donot run this on your computer without understanding code
//as you can fall into serious trouble :P
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class virusXkali 
{
public static void main(String args[])
{
    JFrame realframe=new JFrame();
    JButton btn=new JButton("Exit and regret by clicking");
    JPanel pnl=new JPanel();
    pnl.setBackground(Color.BLACK);
    realframe.setSize(220,220);
    realframe.setDefaultCloseOperation(0);
    pnl.add(btn);
    realframe.add(pnl);
    realframe.setFocusable(true);
    realframe.setVisible(true);
    realframe.addKeyListener(new KeyAdapter()
    {
        public void keyPressed(KeyEvent mm)
        { if(mm.getKeyCode()==KeyEvent.VK_SPACE)
            System.exit(0);
        }
    });
 JFrame f[]=new JFrame[10];
 JFrame f2[]=new JFrame[10];
 JFrame f3[]=new JFrame[10];
 JFrame f4[]=new JFrame[10];
 JFrame f5[]=new JFrame[10];
 btn.addActionListener(new ActionListener()
 {
     public void actionPerformed(ActionEvent e)
     {
         int a=0,b=0,c=700,d=700,g=500;
         try
         {
 for(int i=0;i<=10;i++)
 {
     //direction1
     JFrame fr=new JFrame();
     fr.setDefaultCloseOperation(0);
     fr.setSize(220,220);
     fr.setBounds(a,b,220,220);
     fr.add(pnl);
     fr.setFocusable(true);
     fr.addKeyListener(new KeyAdapter()
     {
         public void keyPressed(KeyEvent q)
         { if(q.getKeyCode()==KeyEvent.VK_SPACE)
             System.exit(0);
         }
        });
     fr.setVisible(true);
     f[i]=fr;
     a=a+50;
     b=b+50;
     //direction 2
     JFrame fr2=new JFrame();
     fr2.setDefaultCloseOperation(0);
     fr2.setSize(220,220);
     fr2.setBounds(c,d,220,220);
     fr2.add(pnl);
     fr2.setFocusable(true);
     fr2.addKeyListener(new KeyAdapter()
     {
         public void keyPressed(KeyEvent q)
         { if(q.getKeyCode()==KeyEvent.VK_SPACE)
            System.exit(0);
         }
        });
     fr2.setVisible(true);
     f2[i]=fr2;
     d=d-50;
     c=c-50;
     //direction3
     JFrame fr3=new JFrame();
     fr3.setDefaultCloseOperation(0);
     fr3.setSize(220,220);
     fr3.setBounds(d,a,220,220);
     fr3.add(pnl);
     fr3.setFocusable(true);
     fr3.addKeyListener(new KeyAdapter()
     {
         public void keyPressed(KeyEvent q)
         { if(q.getKeyCode()==KeyEvent.VK_SPACE)
            System.exit(0);
         }
        });
     fr3.setVisible(true);
     f3[i]=fr3;
     //direction4
      JFrame fr4=new JFrame();
      fr4.setDefaultCloseOperation(0);
     fr4.setSize(220,220);
     fr4.setBounds(a,d,220,220);
     fr4.add(pnl);
     fr4.setFocusable(true);
     fr4.addKeyListener(new KeyAdapter()
     {
         public void keyPressed(KeyEvent q)
         { if(q.getKeyCode()==KeyEvent.VK_SPACE)
            System.exit(0);
         }
        });
     fr4.setVisible(true);
     f4[i]=fr4;
     //direction5
     JFrame fr5=new JFrame();
     fr5.setDefaultCloseOperation(0);
     fr5.setSize(220,220);
     fr5.setBounds(g,0,220,220);
     fr5.add(pnl);
     fr5.setFocusable(true);
     fr5.addKeyListener(new KeyAdapter()
     {
         public void keyPressed(KeyEvent q)
         {
             if(q.getKeyCode()==KeyEvent.VK_SPACE)
             System.exit(0);
         }
        });
     fr5.setVisible(true);
     f5[i]=fr5;
    }
}catch(Exception r){}
}
});

}    
}
