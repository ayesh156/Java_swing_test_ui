package gui;

import com.formdev.flatlaf.FlatDarkLaf;

public class TestUI {

    private static final javax.swing.JFrame frame1 = new javax.swing.JFrame();
    private static final javax.swing.JButton button1 = new javax.swing.JButton();
    private static final javax.swing.JLabel label1 = new javax.swing.JLabel();

    public static void main(String[] args) {

        frame1.setSize(300, 300);
        frame1.setTitle("Test Frame");
        frame1.setLayout(null);

        button1.setText("Click Me");
        button1.setSize(250, 50);
        button1.setLocation(15, 100);

        java.awt.event.ActionListener listener1 = new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                Runnable runnable1 = new Runnable() {
                    @Override
                    public void run() {

                        while (true) {
                            java.util.Date date1 = new java.util.Date();

                            java.text.SimpleDateFormat format1 = new java.text.SimpleDateFormat("yyyy-MMM-dd hh:mm:ss a");

                            String stringDate1 = format1.format(date1);

                            label1.setText(stringDate1);

                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                    }
                };

                Thread thread1 = new Thread(runnable1);
                thread1.start();

            }

        };

        button1.addActionListener(listener1);

        frame1.add(button1);

//        javax.swing.JLabel label1 = new javax.swing.JLabel();
        label1.setText("None");
        label1.setSize(250, 50);
        label1.setLocation(25, 150);

        frame1.add(label1);

        frame1.setVisible(true);

    }

}
