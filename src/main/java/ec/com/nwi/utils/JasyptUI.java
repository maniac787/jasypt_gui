package ec.com.nwi.utils;

import javax.swing.*;
import java.util.Arrays;

public class JasyptUI extends JFrame {
    private JTextField txtUsuario;
    private JTextField txtClave;
    private JTextField txtUrl;
    private JTextField txtLlave;
    private JButton btnGenerar;
    private JButton btnLimpiar;
    private JPanel jpJasypt;

    public JasyptUI() {
        setContentPane(jpJasypt);
//        setTitle("asd");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        Arrays.stream(looks).map(UIManager.LookAndFeelInfo::getClassName).forEach(System.out::println);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JasyptUI jasyptUI = new JasyptUI();
    }
}
