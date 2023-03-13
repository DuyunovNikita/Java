package org.example;

        import com.ritaja.xchangerate.api.CurrencyConverterBuilder;
        import com.ritaja.xchangerate.util.Strategy;
        import com.tunyk.currencyconverter.api.CurrencyConverter;
        import org.jibx.schema.net.webservicex.currencyconvertor.Currency;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.math.BigDecimal;
        import Converter.*;

/**
 * Hello world!
 *
 */
public class App extends JFrame {
    public App() {
        setBounds(500,500,600,600);
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel text = new JLabel("КОНВЕРТЕР ВАЛЮТ");
        text.setBounds(250, 10, 120, 32);
        add(text);



        JLabel dollar = new JLabel("Доллар USD: ");
        dollar.setBounds(20, 60, 120, 32);
        add(dollar);

        JTextField fieldDollar = new JTextField();
        fieldDollar.setBounds(210, 60, 125, 32);
        add(fieldDollar);

        int doll = 0;

        fieldDollar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int doll = Integer.parseInt(fieldDollar.getText());
            }
        });

        fieldDollar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int doll = Integer.parseInt(fieldDollar.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(doll, Converter.ValuteArr.get("USD")));
            }
        });


        JLabel euro = new JLabel("Евро EUR: ");
        euro.setBounds(20, 120, 120, 32);
        add(euro);

        JTextField fieldEuro = new JTextField();
        fieldEuro.setBounds(210, 120, 125, 32);
        add(fieldEuro);

        int eu = 0;

        fieldEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int eu = Integer.parseInt(fieldEuro.getText());
            }
        });

        fieldEuro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int eu = Integer.parseInt(fieldEuro.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(eu, Converter.ValuteArr.get("EUR")));
            }
        });

        JLabel aud = new JLabel("Австралийский доллар AUD: ");
        aud.setBounds(20, 180, 180, 32);
        add(aud);

        JTextField fieldAud = new JTextField();
        fieldAud.setBounds(210, 180, 125, 32);
        add(fieldAud);

        int au = 0;

        fieldAud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int au = Integer.parseInt(fieldAud.getText());
            }
        });

        fieldAud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int au = Integer.parseInt(fieldAud.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(au, Converter.ValuteArr.get("AUD")));
            }
        });

        JLabel cad = new JLabel("Канадский доллар CAD: ");
        cad.setBounds(20, 240, 180, 32);
        add(cad);

        JTextField fieldCad = new JTextField();
        fieldCad.setBounds(210, 240, 125, 32);
        add(fieldCad);

        int ca = 0;

        fieldCad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int ca = Integer.parseInt(fieldCad.getText());
            }
        });

        fieldCad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int ca = Integer.parseInt(fieldCad.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(ca, Converter.ValuteArr.get("CAD")));
            }
        });

        JLabel gbp = new JLabel("Фунт стерлингов GBP: ");
        gbp.setBounds(20, 300, 180, 32);
        add(gbp);

        JTextField fieldGbp = new JTextField();
        fieldGbp.setBounds(210, 300, 125, 32);
        add(fieldGbp);

        int gb = 0;

        fieldGbp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int gb = Integer.parseInt(fieldGbp.getText());
            }
        });

        fieldGbp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int gb = Integer.parseInt(fieldGbp.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(gb, Converter.ValuteArr.get("GBP")));
            }
        });

        JLabel chf = new JLabel("Швейцарский франк CHF: ");
        chf.setBounds(20, 360, 180, 32);
        add(chf);

        JTextField fieldChf = new JTextField();
        fieldChf.setBounds(210, 360, 125, 32);
        add(fieldChf);

        int ch = 0;

        fieldChf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int ch = Integer.parseInt(fieldChf.getText());
            }
        });

        fieldChf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int ch = Integer.parseInt(fieldChf.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(ch, Converter.ValuteArr.get("CHF")));
            }
        });

        JLabel jpy = new JLabel("Японская иена JPY: ");
        jpy.setBounds(20, 420, 180, 32);
        add(jpy);

        JTextField fieldJpy = new JTextField();
        fieldJpy.setBounds(210, 420, 125, 32);
        add(fieldJpy);

        int jp = 0;

        fieldJpy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int jp = Integer.parseInt(fieldJpy.getText());
            }
        });

        fieldJpy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                int jp = Integer.parseInt(fieldJpy.getText());
                JOptionPane.showMessageDialog(App.this,
                        "В рублях: " + Converter.converter(jp, Converter.ValuteArr.get("JPY")));
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new App();
    }
}
