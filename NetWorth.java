import java.util.*;
import javax.swing.JFrame;
import javax.swing.border.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.event.ActionListener;

public class NetWorth implements ActionListener{

  JLabel NewMessage;
  JLabel AssetLabel;
  JTextField Assets;
  JTextField Liabilities;
  JLabel LiabilitiesLabel;
  JButton button;
  JLabel NetWorth;
  JTextField NetWorthBox;
  JFrame frame;
  int AssetsValue;
  int LiabilitiesValue;
  int Total;

  public static void main(String[] args) {

    NetWorth netWorthCalculator = new NetWorth();
        netWorthCalculator.NetWorthGUI();

  }

  public void NetWorthGUI() {

    NewMessage = new JLabel("Calculate Your Net Worth");
    NewMessage.setFont(new Font(null,Font.BOLD,13));
    NewMessage.setBounds(140,55,175,25);

    AssetLabel = new JLabel("Assets");
    AssetLabel.setBounds(50,100,75,25);

    Assets = new JTextField();
    Assets.setBounds(125,100,200,25);
    Assets.addActionListener(this);
    

    Liabilities = new JTextField();
    Liabilities.setBounds(125,150,200,25);
    Liabilities.addActionListener(this);

    LiabilitiesLabel = new JLabel("Liabilities");
    LiabilitiesLabel.setBounds(50,150,75,25);

    button = new JButton("Calculate");
    button.setBounds(125,200,200,55);
    button.setFocusable(false);
    button.addActionListener(this);

    NetWorth = new JLabel("Net Worth");
    NetWorth.setBounds(50,275,75,25);

    NetWorthBox = new JTextField();
    NetWorthBox.setBounds(125,275,75,25);
    NetWorthBox.addActionListener(this);
    
    frame = new JFrame();
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(420,420);
    frame.setVisible(true);
    frame.setTitle("Calculate Your Net Worth");

    frame.add(NewMessage);
    frame.add(AssetLabel);
    frame.add(Assets);
    frame.add(Liabilities);
    frame.add(LiabilitiesLabel);
    frame.add(button);
    frame.add(NetWorth);
    frame.add(NetWorthBox);

  }  

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
        // Get the text values of assets and liabilities
        int assetsValue = Integer.parseInt(Assets.getText());
        int liabilitiesValue = Integer.parseInt(Liabilities.getText());

        // Calculate net worth
        int netWorthValue = assetsValue - liabilitiesValue;

        // Set the calculated net worth value in the NetWorthBox

        NetWorthBox.setText(Integer.toString(netWorthValue));

        if(netWorthValue > 0){

          System.out.println("You have a positive net worth of: " + netWorthValue);

        }
        else if(netWorthValue < 0){
          System.out.println("You have a negative net worth of: " + netWorthValue);
        }
        else{
          System.out.println("You have a net worth of 0");
        }

    }
  }

  
}
