package curso_java;

import java.util.Locale;

public class exe003 {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.print(loc.getDisplayLanguage());
    }
    
}
