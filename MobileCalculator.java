import java.awt.*;
import java.awt.event.*;

class MobileCalculator
{
    public static void main (String arf[])
    {
        MarvellousCalculator mobj = new MarvellousCalculator(400,400,"Marvellous");
    }
}

class MarvellousCalculator extends WindowAdapter //implements ActionListener
{
    public Frame fobj;
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    public TextField t1,t2;
    public Label lobj;

    public MarvellousCalculator(int width, int height, String title)
    {
        fobj = new Frame(title);
        fobj.setSize(width,height);

        fobj.addWindowListener(this);

        b1 = new Button("C");
        b2 = new Button("%");
        b3 = new Button("BACK");
        b4 = new Button("DIV");
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");
        b8 = new Button("MULTI");
        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("SUB");
        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");
        b16 = new Button("ADD");
        b17 = new Button("00");
        b18 = new Button("0");
        b19 = new Button(".");
        b20 = new Button("=");

        t1 = new TextField();
        t2 = new TextField();

        b1.setBounds(10,280,80,40);
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);
        b5.setBounds(10,300,80,40);
        b6.setBounds(100,480,80,40);
        b7.setBounds(190,480,80,40);
        b8.setBounds(290,480,80,40);
        b9.setBounds(10,680,80,40);
        b10.setBounds(100,680,80,40);
        b11.setBounds(190,680,80,40);
        b12.setBounds(290,680,80,40);
        b13.setBounds(10,880,80,40);
        b14.setBounds(100,880,80,40);
        b15.setBounds(190,880,80,40);
        b16.setBounds(290,880,80,40);
        b17.setBounds(10,1080,80,40);
        b18.setBounds(100,1080,80,40);
        b19.setBounds(190,1080,80,40);
        b20.setBounds(290,1080,80,40);

        t1.setBounds(10,100,300,40);
       // t1.setBounds(0,100,100,40);    // X,Y,W,H
        t2.setBounds(10,0,300,40);    // X,Y,W,H


        fobj.add(b1);
        fobj.add(b2);
        fobj.add(b3);
        fobj.add(b4);

        fobj.add(t1);

        lobj = new Label();
        lobj.setBounds(150,25,200,100);
        fobj.add(lobj);

        fobj.setLayout(null);
        fobj.setVisible(true);
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}