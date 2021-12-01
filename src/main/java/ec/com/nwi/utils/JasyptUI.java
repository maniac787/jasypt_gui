package ec.com.nwi.utils;

import com.alee.laf.WebLookAndFeel;
import com.alee.skin.modena.ModenaSkin;

import javax.swing.*;

public class JasyptUI extends JFrame{
    private JTextField txtUsuario;
    private JTextField txtClave;
    private JTextField txtUrl;
    private JButton btnGenerar;
    private JButton btnLimpiar;
    private JPanel jpJasypt;
    private JPasswordField passwordField1;
    private JTextArea txtResultado;

    public JasyptUI() {
        setTitle("N.W.I");
        add(jpJasypt);
        setTitle("N.W.I");
        setSize(500, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pack();
        validate();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Install WebLaF as application LaF
//                WebLookAndFeel.install();
                new JasyptUI();
                // You can also specify preferred skin right-away
//                 WebLookAndFeel.install ( WebDarkSkin.class );
                WebLookAndFeel.install(ModenaSkin.class);

                // You can also do that in one of the old-fashioned ways
                // UIManager.setLookAndFeel ( new WebLookAndFeel () );
                // UIManager.setLookAndFeel ( "com.alee.laf.WebLookAndFeel" );
                // UIManager.setLookAndFeel ( WebLookAndFeel.class.getCanonicalName () );

                // You can also configure other WebLaF managers as you like now
                // StyleManager
                // SettingsManager
                // LanguageManager
                // ...

                // Initialize your application once you're done setting everything up
//                JFrame frame = new JFrame("N.W.I");




                // You can also use Web* components to get access to some extended WebLaF features
                // WebFrame frame = ...

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
