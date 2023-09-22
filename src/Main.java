import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

    static void screenList(){

    }

    static void screenAdd(){
        
    }

    public static void main(String args[]) {

        Font fontePersonalizada = new Font("Courier", Font.BOLD, 20);
        JFrame screenFrame = new JFrame("Ouvidoria Universidade ABC");

        JPanel panel = new JPanel();
        panel.setBounds(0,0,400,400);
        panel.setBackground(new Color(7, 20, 30));
        panel.setLayout(null);

        JLabel lblTitle = new JLabel("Ouvidoria UniABC");
        lblTitle.setBounds(105,20,200,30);
        lblTitle.setForeground(new Color(7, 124, 238));
        lblTitle.setFont(fontePersonalizada);

        JButton btnList = new JButton("Listar reclamações");
        btnList.setBounds(100,65,200,30);
        btnList.setBackground(new Color(7, 124, 238));
        btnList.setBorderPainted(false);
        btnList.setFont(new Font("Courier", Font.BOLD, 15));
        btnList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });

        JButton btnAdd = new JButton("Criar reclamação");
        btnAdd.setBounds(100,115,200,30);
        btnAdd.setBackground(new Color(7, 124, 238));
        btnAdd.setBorderPainted(false);
        btnAdd.setFont(new Font("Courier", Font.BOLD, 15));
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });

        JButton btnRemove = new JButton("Remover reclamação");
        btnRemove.setBounds(100,165,200,30);
        btnRemove.setBackground(new Color(7, 124, 238));
        btnRemove.setBorderPainted(false);
        btnRemove.setFont(new Font("Courier", Font.BOLD, 15));
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });

        JButton btnUpdate = new JButton("Alterar reclamação");
        btnUpdate.setBounds(100,215,200,30);
        btnUpdate.setBackground(new Color(7, 124, 238));
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFont(new Font("Courier", Font.BOLD, 15));
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });

        JButton btnGetByID = new JButton("Visualizar reclamação");
        btnGetByID.setBounds(100,265,200,30);
        btnGetByID.setBackground(new Color(7, 124, 238));
        btnGetByID.setBorderPainted(false);
        btnGetByID.setFont(new Font("Courier", Font.BOLD, 15));
        btnGetByID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });

        panel.add(lblTitle);
        panel.add(btnList);
        panel.add(btnAdd);
        panel.add(btnRemove);
        panel.add(btnGetByID);
        panel.add(btnUpdate);

        screenFrame.add(panel);
        screenFrame.setSize(400,400);
        screenFrame.setLayout(null);
        screenFrame.setVisible(true);
    }
}