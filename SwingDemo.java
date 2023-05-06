import javax.swing.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
    } 
}

class SwingDemo
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
/*
        AWT         Swing
     Frame          JFrame
     Button         JButton
     TextField      JTextfield
*/