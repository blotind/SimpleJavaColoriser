import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main
{

  public static void main(String[] args)
  {
    test();
  }

  private static void test()
  {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel(colorise("look some text", Colors.RED));
    
    frame.add(label);
    frame.setSize(500, 150);
    frame.setVisible(true);
    
    JFrame frame2 = new JFrame();
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label2 = new JLabel(colorise("look some text", Colors.BLUE));
    
    frame2.add(label2);
    frame2.setSize(500, 150);
    frame2.setVisible(true);
    
    JFrame frame3 = new JFrame();
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label3 = new JLabel(colorise("look some text", Colors.GREEN));
    
    frame3.add(label3);
    frame3.setSize(500, 150);
    frame3.setVisible(true);
  }

  public static String colorise(String sText, Colors oColor)
  {
    System.out.println(oColor.getValue());
    return "<html><font color=\"" + oColor.getValue() + "\">" + sText + "</font></html>";
  }
  
  public enum Colors
  {
    RED("red"), BLUE("blue"), GREEN("green");
    
    private final String color;

    Colors(String color)
    {
      this.color = color;
    }

    public String getValue()
    {
      return color;
    }
  }

}