package org.example;

import Converter.Converter;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App extends JFrame {

    List<Object[]> textFields = new ArrayList<Object[]>();

    public void setEventOnJTextField() {

        for (int i = 0; i < textFields.size(); i++) {
            String valute = (String) textFields.get(i)[0];
            JTextField currentTextField = (JTextField) textFields.get(i)[1];

            currentTextField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String outputValue;
                        double value = Double.parseDouble(currentTextField.getText());

                        System.out.println(valute);

                        outputValue = "В рублях: " + String.valueOf(Converter.converter(value, Converter.ValuteArr.get(valute)));

                        JOptionPane.showMessageDialog(App.this, outputValue);
                    } catch(NumberFormatException ex) {
                        System.out.println("Введена пустая строка!");
                    }
                }
            });
        }
    }

    public String valuteSub(String valute) {
        return valute.substring(valute.indexOf(":") - 3, valute.lastIndexOf(":"));
    }

    public App() {
        this.setBounds(500, 500, 600, 600);
        this.setTitle("Test");
        this.setDefaultCloseOperation(3);
        this.setLayout((LayoutManager) null);

        String valute = "";

        //List<JTextField> textFields = new ArrayList<JTextField>();

        JLabel text = new JLabel("КОНВЕРТЕР ВАЛЮТ");
        text.setBounds(250, 10, 150, 32);
        this.add(text);


        JLabel dollar = new JLabel("Доллар USD: ");
        dollar.setBounds(20, 60, 120, 32);
        this.add(dollar);

        final JTextField fieldDollar = new JTextField();
        fieldDollar.setBounds(210, 60, 125, 32);
        this.add(fieldDollar);

        valute = dollar.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldDollar});


        JLabel euro = new JLabel("Евро EUR: ");
        euro.setBounds(20, 120, 120, 32);
        this.add(euro);

        final JTextField fieldEuro = new JTextField();
        fieldEuro.setBounds(210, 120, 125, 32);
        this.add(fieldEuro);

        valute = euro.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldEuro});


        JLabel aud = new JLabel("Австралийский доллар AUD: ");
        aud.setBounds(20, 180, 180, 32);
        this.add(aud);

        final JTextField fieldAud = new JTextField();
        fieldAud.setBounds(210, 180, 125, 32);
        this.add(fieldAud);

        valute = aud.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldAud});


        JLabel cad = new JLabel("Канадский доллар CAD: ");
        cad.setBounds(20, 240, 180, 32);
        this.add(cad);

        final JTextField fieldCad = new JTextField();
        fieldCad.setBounds(210, 240, 125, 32);
        this.add(fieldCad);


        valute = cad.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldCad});


        JLabel gbp = new JLabel("Фунт стерлингов GBP: ");
        gbp.setBounds(20, 300, 180, 32);
        this.add(gbp);

        final JTextField fieldGbp = new JTextField();
        fieldGbp.setBounds(210, 300, 125, 32);
        this.add(fieldGbp);


        valute = gbp.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldGbp});


        JLabel chf = new JLabel("Швейцарский франк CHF: ");
        chf.setBounds(20, 360, 180, 32);
        this.add(chf);

        final JTextField fieldChf = new JTextField();
        fieldChf.setBounds(210, 360, 125, 32);
        this.add(fieldChf);


        valute = chf.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldChf});


        JLabel jpy = new JLabel("Японская иена JPY: ");
        jpy.setBounds(20, 420, 180, 32);
        this.add(jpy);

        final JTextField fieldJpy = new JTextField();
        fieldJpy.setBounds(210, 420, 125, 32);
        this.add(fieldJpy);

        valute = jpy.getText();
        textFields.add(new Object[] {valuteSub(valute), fieldJpy});

        setEventOnJTextField();

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}

