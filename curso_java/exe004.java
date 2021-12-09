package curso_java;

import java.awt.Dimension;
import java.awt.Toolkit;

public class exe004 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double heigth = screenSize.getHeight();
        System.out.print(width);
        System.out.print(" x ");
        System.out.print(heigth);
    }
}
