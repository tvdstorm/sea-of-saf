package tst;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ReadDoubleFromConsole {
  public static void _main(String[] args) {
    System.out.println("Enter a number.");
    double numberFromConsole; 
    try {
      InputStreamReader isr = new InputStreamReader(System.in);
      System.out.println("1");
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      System.out.println("2");
      DecimalFormat df = new DecimalFormat();
      Number n = df.parse(s);
      numberFromConsole = n.doubleValue();
    } catch (IOException e) {
      numberFromConsole = 0;
    } catch (ParseException e) {
      numberFromConsole = 0;
    }
    System.out.println(numberFromConsole );
  }
}