package org.hey.pms.handlers;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
//import com.borland.jbcl.layout.VerticalFlowLayout;
//import java.awt.Rectangle;
//import com.borland.jbcl.layout.XYLayout;
//import com.borland.jbcl.layout.*;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: </p>
 * @author Fred Pospeschil
 * @version 1.0 A
 */

public class tt_AboutBox extends JDialog implements ActionListener
{

  JPanel       panel1 =        new JPanel();
  JPanel       panel2 =        new JPanel();
  JPanel       insetsPanel1 =  new JPanel();
  JPanel       insetsPanel2 =  new JPanel();
  JPanel       insetsPanel3 =  new JPanel();
  JButton      button1 =       new JButton();
  JLabel       imageLabel =    new JLabel();
  JLabel       label1 =        new JLabel();
  JLabel       label2 =        new JLabel();
  JLabel       label3 =        new JLabel();
  JLabel       label4 =        new JLabel();
  ImageIcon    image1 =        new ImageIcon();
  BorderLayout borderLayout1 = new BorderLayout();
  BorderLayout borderLayout2 = new BorderLayout();
  String product   = "Speed Test";
  String version   = "1.0 B";
  String copyright = "IIT";
  String comments  = "";
  GridBagLayout gridBagLayout1 = new GridBagLayout();
  GridBagLayout gridBagLayout2 = new GridBagLayout();
  public tt_AboutBox(Frame parent)
  {
    super(parent);
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try
    { jbInit(); }
    catch(Exception e)
    { e.printStackTrace(); }
  }
  //Component initialization
  private void jbInit() throws Exception
  {
    image1 = new ImageIcon(tt.class.getResource("about.png"));
    imageLabel.setIcon(image1);
    this.setTitle("About");
    panel1.setLayout(borderLayout1);
    panel2.setLayout(borderLayout2);
    insetsPanel1.setLayout(gridBagLayout1);
    label1.setFont(new java.awt.Font("Dialog", Font.BOLD, 20));
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    label1.setHorizontalTextPosition(SwingConstants.CENTER);
    label1.setText("Metrics Values");
    label2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 20));
    label2.setHorizontalAlignment(SwingConstants.CENTER);
    label2.setText("1.0 B - Copyright (c) 2008");
    label3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 20));
    label3.setHorizontalAlignment(SwingConstants.CENTER);
    label3.setText("F. W. Pospeschil");
    label4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 16));
    label4.setHorizontalAlignment(SwingConstants.CENTER);
    label4.setText("Last update March 2012");
    insetsPanel3.setLayout(gridBagLayout2);
    button1.setText("Ok");
    button1.addActionListener(this);
    insetsPanel3.setBorder(null);
    insetsPanel2.setBorder(null);
    insetsPanel1.setBorder(null);
    insetsPanel2.add(imageLabel, null);
    panel2.add(insetsPanel2, BorderLayout.WEST);
    this.getContentPane().add(panel1, null);
    panel1.add(panel2, java.awt.BorderLayout.CENTER);
    panel1.add(insetsPanel3, java.awt.BorderLayout.EAST);
    panel1.add(insetsPanel1, java.awt.BorderLayout.SOUTH);
    insetsPanel1.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
                                                     , GridBagConstraints.EAST,
                                                     GridBagConstraints.NONE,
                                                     new Insets(3, 189, 7, 146),
                                                     0, 0));
    insetsPanel3.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
                                                    , GridBagConstraints.WEST,
                                                    GridBagConstraints.NONE,
                                                    new Insets(0, 11, 0, 14),
                                                    91, 0));
    insetsPanel3.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
                                                    , GridBagConstraints.WEST,
                                                    GridBagConstraints.NONE,
                                                    new Insets(5, 105, 0, 104),
                                                    30, 0));
    insetsPanel3.add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
                                                    , GridBagConstraints.WEST,
                                                    GridBagConstraints.NONE,
                                                    new Insets(0, 52, 0, 34),
                                                    111, 0));
    insetsPanel3.add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
                                                    , GridBagConstraints.WEST,
                                                    GridBagConstraints.NONE,
                                                    new Insets(0, 24, 14, 0),
                                                    153, 0));
    setResizable(true);
  }
  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e)
  {
    if (e.getID() == WindowEvent.WINDOW_CLOSING)
    { cancel(); }
    super.processWindowEvent(e);
  }

  //Close the dialog
  void cancel()
  { dispose(); }

  //Close the dialog on a button event
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == button1)
    { cancel(); }
  }
}
