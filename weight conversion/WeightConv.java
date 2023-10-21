import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WeightConv extends JFrame {

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String s = a1.getText();
            double d = Integer.parseInt(s);
            if (kg1.isSelected() && kg2.isSelected()) {
                a2.setText(s);
            }
            if (kg1.isSelected() && pound2.isSelected()) {
                double pou = d * 2.205;
                a2.setText(Double.toString(pou));

            }
            if (kg1.isSelected() && ounce2.isSelected()) {
                double ounce = d * 35.274;
                a2.setText(Double.toString(ounce));
            }

            if (pound1.isSelected() && kg2.isSelected()) {
                double kgs = d / 2.205;
                a2.setText(Double.toString(kgs));
            }
            if (pound1.isSelected() && pound2.isSelected())
                a2.setText(s);

            if (pound1.isSelected() && ounce2.isSelected()) {
                double ounces = d / .0625;
                a2.setText(Double.toString(ounces));
            }
            if (ounce1.isSelected() && kg2.isSelected()) {
                double kgs2 = d / 35.274;
                a2.setText(Double.toString(kgs2));
            }
            if (ounce1.isSelected() && pound2.isSelected())

            {
                double pounds2 = d * .0625;
                a2.setText(Double.toString(pounds2));
            }
            if (ounce1.isSelected() && ounce2.isSelected())
                a2.setText(s);

        }

    }

    JButton b;
    JTextArea a2;
    JTextField a1;
    JCheckBox kg1;
    JCheckBox kg2;
    JCheckBox pound1;
    JCheckBox pound2;
    JCheckBox ounce1;
    JCheckBox ounce2;

    WeightConv() {
        Handler h = new Handler();

        JLabel l = new JLabel("WEIGHT CONVERTER");
        l.setBounds(120, 0, 180, 20);
        add(l);
        JLabel l2 = new JLabel("INPUT UNIT");
        l2.setBounds(56, 65, 100, 10);
        add(l2);
        JLabel l3 = new JLabel("OUTPUT UNIT");
        l3.setBounds(230, 65, 100, 10);
        add(l3);
        b = new JButton("Convert");
        b.setBounds(120, 260, 100, 50);
        a1 = new JTextField();
        a1.setBounds(120, 20, 100, 30);
        a2 = new JTextArea();
        a2.setBounds(120, 310, 100, 40);
        kg1 = new JCheckBox("KG");
        kg1.setBounds(50, 110, 140, 20);
        kg2 = new JCheckBox("KG");
        kg2.setBounds(230, 110, 140, 20);
        pound1 = new JCheckBox("Pounds");
        pound1.setBounds(50, 160, 100, 20);
        pound2 = new JCheckBox("Pounds");
        pound2.setBounds(230, 160, 100, 20);
        ounce1 = new JCheckBox("Ounce");
        ounce1.setBounds(50, 210, 100, 20);
        ounce2 = new JCheckBox("Ounce");
        ounce2.setBounds(230, 210, 100, 20);
        add(b);
        add(kg1);
        add(kg2);
        add(a1);
        add(a2);
        add(pound1);
        add(pound2);
        add(ounce1);
        add(ounce2);
        b.addActionListener(h);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String args[]) {
        WeightConv obj = new WeightConv();
    }

}