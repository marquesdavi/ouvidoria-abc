import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Main {
    public static Ouvidoria ouvidoriaObj = new Ouvidoria();

    static void screenList(Ouvidoria reclamacoesList) {
        String reclamacoes = reclamacoesList.listarReclamacoes();

        JOptionPane.showMessageDialog(null, reclamacoes);
    }

    static void screenAdd() {
        int code = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da reclamação: "));
        String titulo = JOptionPane.showInputDialog("Digite um titulo para a sua reclamação: ");
        String reclamacao = JOptionPane.showInputDialog("Digite a sua reclamação: ");
        String autor = JOptionPane.showInputDialog("Digite o seu nome: ");
        String dateTime = "" + java.time.LocalDate.now();

        ouvidoriaObj.adicionarReclamacao(code, reclamacao, autor, dateTime, titulo);
    }

    static void screenRemove() {
        screenList(ouvidoriaObj);
        String codeStr = JOptionPane.showInputDialog("Digite codigo da reclamação a ser excluida: ");
        int code = Integer.parseInt(codeStr);

        String successMessage = ouvidoriaObj.removerReclamacao(code);
        JOptionPane.showMessageDialog(null, successMessage);
    }

    static void screenUpdate() {
        screenList(ouvidoriaObj);

        int code = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da reclamação: "));
        String changeComplaint = JOptionPane.showInputDialog("Digite a reclamação atualizada: ");

        ouvidoriaObj.alterarReclamaçãoPeloCodigo(code, changeComplaint);
    }

    static void screenGetById() {
        screenList(ouvidoriaObj);

        int code = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da reclamação que deseja ver: "));
        String complaintDetails = ouvidoriaObj.mostraReclamacaoPorCodigo(code);
        JOptionPane.showMessageDialog(null, complaintDetails);
    }

    public static void main(String args[]) {
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(7, 20, 30));
        UI.put("OptionPane.messageForeground", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background", new ColorUIResource(7, 20, 30));

        Font fontePersonalizada = new Font("Courier", Font.BOLD, 20);
        JFrame screenFrame = new JFrame("Ouvidoria Universidade ABC");

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 400);
        panel.setBackground(new Color(7, 20, 30));
        panel.setLayout(null);

        JLabel lblTitle = new JLabel("Ouvidoria UniABC");
        lblTitle.setBounds(105, 20, 200, 30);
        lblTitle.setForeground(new Color(7, 124, 238));
        lblTitle.setFont(fontePersonalizada);

        JButton btnList = new JButton("Listar reclamações");
        btnList.setBounds(100, 65, 200, 30);
        btnList.setBackground(new Color(7, 124, 238));
        btnList.setBorderPainted(false);
        btnList.setFont(new Font("Courier", Font.BOLD, 15));
        btnList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenList(ouvidoriaObj);
            }
        });

        JButton btnAdd = new JButton("Criar reclamação");
        btnAdd.setBounds(100, 115, 200, 30);
        btnAdd.setBackground(new Color(7, 124, 238));
        btnAdd.setBorderPainted(false);
        btnAdd.setFont(new Font("Courier", Font.BOLD, 15));
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenAdd();
            }
        });

        JButton btnRemove = new JButton("Remover reclamação");
        btnRemove.setBounds(100, 165, 200, 30);
        btnRemove.setBackground(new Color(7, 124, 238));
        btnRemove.setBorderPainted(false);
        btnRemove.setFont(new Font("Courier", Font.BOLD, 15));
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenRemove();
            }
        });

        JButton btnUpdate = new JButton("Alterar reclamação");
        btnUpdate.setBounds(100, 215, 200, 30);
        btnUpdate.setBackground(new Color(7, 124, 238));
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFont(new Font("Courier", Font.BOLD, 15));
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenUpdate();
            }
        });

        JButton btnGetByID = new JButton("Visualizar reclamação");
        btnGetByID.setBounds(100, 265, 200, 30);
        btnGetByID.setBackground(new Color(7, 124, 238));
        btnGetByID.setBorderPainted(false);
        btnGetByID.setFont(new Font("Courier", Font.BOLD, 15));
        btnGetByID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenGetById();
            }
        });

        panel.add(lblTitle);
        panel.add(btnList);
        panel.add(btnAdd);
        panel.add(btnRemove);
        panel.add(btnGetByID);
        panel.add(btnUpdate);

        screenFrame.add(panel);
        screenFrame.setSize(400, 400);
        screenFrame.setLayout(null);
        screenFrame.setVisible(true);
    }
}