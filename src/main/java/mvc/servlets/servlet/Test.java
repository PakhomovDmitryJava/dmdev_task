package mvc.servlets.servlet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;

public class Test {
    public static void main(String[] args) {
       testDefaultResource();
    }

    public static void testDefaultResource() {
        // can we see default resources
        BufferedInputStream result = (BufferedInputStream)
                ObjectInputFilter.Config.class.getClassLoader().getResourceAsStream("first.json");
        byte [] b = new byte[256];
        int val = 0;
        String txt = null;
        do {
            try {
                val = result.read(b);
                if (val > 0) {
                    txt += new String(b, 0, val);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (val > -1);
        System.out.println(txt);
    }
}
