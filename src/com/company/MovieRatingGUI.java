package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieRatingGUI extends JFrame{
    private JPanel rootPanel;
    private JComboBox movieRatingComboBox;
    private JTextField movieNameTextField;
    private JButton submitButton;

    protected MovieRatingGUI(){
        this.setContentPane(rootPanel);

        configureRatings();
        configureButton();

        pack();
        setVisible(true);
    }

    private void configureButton() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movieName = movieNameTextField.getText();
                String rating = (String)movieRatingComboBox.getSelectedItem();
                String result = "You gave " + movieName + " " + rating;
                JOptionPane.showMessageDialog(MovieRatingGUI.this, result);
            }
        });

    }

    private void configureRatings() {
        for (int x = 1; x <=5; x++){
            if (x==1) {
                movieRatingComboBox.addItem(x + " star ");
            }else{
                movieRatingComboBox.addItem(x + " stars ");
                }
            }
        }
    }

