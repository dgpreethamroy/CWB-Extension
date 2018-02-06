package org.hey.pms.handlers;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.Rectangle;
import java.awt.Dimension;


public class tt
    extends JFrame
{
  JPanel    contentPane;
  JMenuBar  jMenuBar1 =           new JMenuBar();
  JMenu     jMenuFile =           new JMenu();
  JMenuItem jMenuFileExit =       new JMenuItem();
  JMenu     jMenuHelp =           new JMenu();
  JMenu     jMenuUpload=          new JMenu();
  JMenuItem     jMenuUploadNewFile=          new JMenuItem();
  JMenuItem     jMenuUploadNewMetrics=          new JMenuItem();
  JMenuItem jMenuHelpAbout =      new JMenuItem();
  JMenu     jMenuRun =            new JMenu();
  JMenuItem jMenuRunTest1Amazon =       new JMenuItem();
  JMenuItem jMenuRunTest2Amazon =       new JMenuItem();
  JMenuItem jMenuRunTest3Google  =       new JMenuItem();
  JMenuItem jMenuRunTest4Google =       new JMenuItem();
  JMenuItem jMenuRunEnvironment = new JMenuItem();
  JLabel    testLabel =           new JLabel();
  JLabel    LatencyLabel=         new JLabel();
  JLabel    checkLabel=			  new JLabel();
  JLabel    initialLabel =        new JLabel();
  JLabel    n1 =                  new JLabel();
  JLabel    n2 =                  new JLabel();
  JLabel    n3 =                  new JLabel();
  JLabel    n4 =                  new JLabel();
  JLabel    l1i =                 new JLabel();
  JLabel    l2i =                 new JLabel();
  JLabel    l3i =                 new JLabel();
  JLabel    l4i =                 new JLabel();
  
  JLabel    t1i =                 new JLabel();
  JLabel    t2i =                 new JLabel();
  JLabel    t3i =                 new JLabel();
  JLabel    t4i =                 new JLabel();
  JLabel    messageLabel =        new JLabel();
  JLabel    javaRunTimeLabel =    new JLabel();
  JLabel    javaVmLabel =         new JLabel();
  JLabel    classPathLabel =      new JLabel();

  //Construct the frame
  public tt()
  {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try
    { jbInit(); }
    catch(Exception e)
    { e.printStackTrace(); }
  }

  //Component initialization
  private void jbInit() throws Exception
  {
    contentPane = (JPanel)this.getContentPane();
    contentPane.setLayout(null);
    this.setSize(new Dimension(600, 800));
    this.setTitle("METRICS");
    jMenuFile.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuFile.setText("File");
    jMenuFileExit.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuFileExit.setText("Exit");
    jMenuFileExit.addActionListener(new tt_jMenuFileExit_ActionAdapter(this));
    jMenuUpload.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuUpload.setText("Upload");
    jMenuUploadNewFile.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuUploadNewFile.setText("New File");
    jMenuUploadNewFile.addActionListener(new tt_jMenuUploadNewFile_ActionAdapter(this));
    jMenuUploadNewMetrics.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuUploadNewMetrics.setText("New Metrics");
    jMenuUploadNewMetrics.addActionListener(new tt_jMenuUploadNewMetrics_ActionAdapter(this));
    jMenuHelp.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuHelp.setText("Help");
    jMenuHelpAbout.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuHelpAbout.setText("About");
    jMenuHelpAbout.addActionListener(new tt_jMenuHelpAbout_ActionAdapter(this));
    jMenuRun.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuRun.setText("Run");
    
    testLabel.setFont(new java.awt.Font("Dialog", 0, 20));
    testLabel.setHorizontalAlignment(SwingConstants.LEADING);
    testLabel.setText("Test");
    testLabel.setBounds(new Rectangle(24, 21, 56, 22));
    
    LatencyLabel.setFont(new java.awt.Font("Dialog", 0, 20));
    LatencyLabel.setText("Latency");
    LatencyLabel.setBounds(new Rectangle(400, 22, 200, 23));
    
    initialLabel.setFont(new java.awt.Font("Dialog", 0, 20));
    initialLabel.setText("Mili Seconds");
    initialLabel.setBounds(new Rectangle(100, 22, 200, 23));
    
    checkLabel.setFont(new java.awt.Font("Dialog", 0, 20));
    checkLabel.setText("Check");
    checkLabel.setBounds(new Rectangle(250, 21, 200, 22));
    
    n1.setFont(new java.awt.Font("Dialog", 0, 20));
    n1.setText("1.");
    n1.setBounds(new Rectangle(37, 65, 22, 17));
    n2.setFont(new java.awt.Font("Dialog", 0, 20));
    n2.setText("2.");
    n2.setBounds(new Rectangle(37, 96, 22, 15));
    n3.setFont(new java.awt.Font("Dialog", 0, 20));
    n3.setText("3.");
    n3.setBounds(new Rectangle(37, 124, 22, 17));
    n4.setFont(new java.awt.Font("Dialog", 0, 20));
    n4.setText("4.");
    n4.setBounds(new Rectangle(37, 155, 22, 17));
    l1i.setFont(new java.awt.Font("Dialog", 0, 20));
    l1i.setPreferredSize(new Dimension(119, 26));
    l1i.setText("0000");
    l1i.setBounds(new Rectangle(400, 68, 135, 19));
    l2i.setFont(new java.awt.Font("Dialog", 0, 20));
    l2i.setPreferredSize(new Dimension(119, 26));
    l2i.setText("0000");
    l2i.setBounds(new Rectangle(400, 98, 138, 17));
    l3i.setFont(new java.awt.Font("Dialog", 0, 20));
    l3i.setPreferredSize(new Dimension(119, 26));
    l3i.setText("0000");
    l3i.setBounds(new Rectangle(400, 125, 133, 15));
    l4i.setFont(new java.awt.Font("Dialog", 0, 20));
    l4i.setPreferredSize(new Dimension(44, 26));
    l4i.setText("0000");
    l4i.setBounds(new Rectangle(400, 151, 119, 16));
    t1i.setFont(new java.awt.Font("Dialog", 0, 20));
    t1i.setPreferredSize(new Dimension(119, 26));
    t1i.setText("0000");
    t1i.setBounds(new Rectangle(118, 68, 135, 19));
    t2i.setFont(new java.awt.Font("Dialog", 0, 20));
    t2i.setPreferredSize(new Dimension(119, 26));
    t2i.setText("0000");
    t2i.setBounds(new Rectangle(119, 98, 138, 17));
    t3i.setFont(new java.awt.Font("Dialog", 0, 20));
    t3i.setPreferredSize(new Dimension(119, 26));
    t3i.setText("0000");
    t3i.setBounds(new Rectangle(118, 125, 133, 15));
    t4i.setFont(new java.awt.Font("Dialog", 0, 20));
    t4i.setPreferredSize(new Dimension(44, 26));
    t4i.setText("0000");
    t4i.setBounds(new Rectangle(117, 151, 119, 16));
    jMenuRunTest1Amazon.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuRunTest1Amazon.setText("Run Test 1 Amazon");
    jMenuRunTest1Amazon.addActionListener(new tt_jMenuRunTest1_actionAdapter(this));
    jMenuRunTest2Amazon.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuRunTest2Amazon.setText("Run Test 2 Amazon");
    jMenuRunTest2Amazon.addActionListener(new tt_jMenuRunTest2_actionAdapter(this));
    messageLabel.setFont(new java.awt.Font("Dialog", 1, 15));
    messageLabel.setText("Please run the tests.");
    messageLabel.setBounds(new Rectangle(21, 308, 593, 28));
    jMenuRunTest3Google.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuRunTest3Google.setText("Run Test 3 Google");
    jMenuRunTest3Google.addActionListener(new tt_jMenuRunTest3_actionAdapter(this));
    jMenuRunTest4Google.setFont(new java.awt.Font("Dialog", 1, 16));
    jMenuRunTest4Google.setText("Run Test 4 Google");
    jMenuRunTest4Google.addActionListener(new tt_jMenuRunTest4_actionAdapter(this));
    javaRunTimeLabel.setFont(new java.awt.Font("Dialog", 1, 16));
    javaRunTimeLabel.setText("------------------------------------------");
    javaRunTimeLabel.setBounds(new Rectangle(17, 229, 578, 25));
    javaVmLabel.setFont(new java.awt.Font("Dialog", 1, 16));
    javaVmLabel.setText("-----------------------------------------------");
    javaVmLabel.setBounds(new Rectangle(15, 258, 570, 23));
    classPathLabel.setFont(new java.awt.Font("Dialog", 1, 16));
    classPathLabel.setText("--------------------------------------------");
    classPathLabel.setBounds(new Rectangle(16, 285, 568, 19));
    //jMenuRunEnvironment.setFont(new java.awt.Font("Dialog", 1, 16));
    //jMenuRunEnvironment.setText("Environment");
   // jMenuRunEnvironment.addActionListener(new tt_jMenuRunEnvironment_actionAdapter(this));
    //jMenuRunEnvironment.addActionListener(new tt_jMenuRunEnvironment_actionAdapter(this));
    jMenuFile.add(jMenuFileExit);
    jMenuHelp.add(jMenuHelpAbout);
    jMenuBar1.add(jMenuUpload);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuRun);
    jMenuBar1.add(jMenuHelp);
    jMenuUpload.add(jMenuUploadNewFile);
    jMenuUpload.add(jMenuUploadNewMetrics);
    contentPane.add(testLabel, null);
    contentPane.add(LatencyLabel, null);
    contentPane.add(checkLabel, null);
    contentPane.add(n1, null);
    contentPane.add(n2, null);
    contentPane.add(n3, null);
    contentPane.add(initialLabel, null);
    contentPane.add(n4, null);
    contentPane.add(l3i, null);
    contentPane.add(l4i, null);
    contentPane.add(l1i, null);
    contentPane.add(l2i, null);
    contentPane.add(t3i, null);
    contentPane.add(t4i, null);
    contentPane.add(t1i, null);
    contentPane.add(t2i, null);
    contentPane.add(messageLabel, null);
    contentPane.add(classPathLabel, null);
    contentPane.add(javaRunTimeLabel, null);
    contentPane.add(javaVmLabel, null);
    jMenuRun.add(jMenuRunTest1Amazon);
    jMenuRun.add(jMenuRunTest2Amazon);
    jMenuRun.add(jMenuRunTest3Google);
    jMenuRun.add(jMenuRunTest4Google);
    jMenuRun.add(jMenuRunEnvironment);
    this.setJMenuBar(jMenuBar1);
  } // END jbInit()

  //File | Exit action performed
  public void jMenuFileExit_actionPerformed(ActionEvent e)
  { System.exit(0); }
  public void jMenuUploadNewFile_actionPerformed(ActionEvent e)
  { System.exit(0); }
  public void jMenuUploadNewMetrics_actionPerformed(ActionEvent e)
  { System.exit(0); }
  
  //Help | About action performed
  public void jMenuHelpAbout_actionPerformed(ActionEvent e)
  {
    tt_AboutBox dlg = new tt_AboutBox(this);
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x,
                    (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.pack();
//    dlg.show();
    dlg.setVisible(true);
  }

  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e)
  {
    super.processWindowEvent(e);
    if(e.getID() == WindowEvent.WINDOW_CLOSING)
      { jMenuFileExit_actionPerformed(null); }
  }


//  Variables used by the following tests
  long startTime;
  long totalTime;
  long lowTime;
  long highTime;
  String elapsedTime = new String();
  double count;

// Run test 1
  void jMenuRunTest1_actionPerformed(ActionEvent e)
    {
    lowTime = 100000;
    highTime = 0;
    for (int j=0; j<6; j++)
      {
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 50000000; i++) ; // 46 - 67 milli seconds
        totalTime = System.currentTimeMillis() - startTime;
        if (totalTime < lowTime)
          lowTime = totalTime;
        if (totalTime > highTime)
          highTime = totalTime;
      }
    System.out.println(highTime);
    double latency = highTime/10.0 + 0.987;
    elapsedTime = (lowTime + " - " + highTime);
    t1i.setText(elapsedTime);
    

    l1i.setText(String.valueOf(latency));
   // messageLabel.setText("Average time for executing 50,000,000 null for/next loops.");
    }

// Run test 2
  void jMenuRunTest2_actionPerformed(ActionEvent e)
    {
    lowTime = 100000;
    highTime = 0;
    for (int j=0; j<6; j++)
      {
      startTime = System.currentTimeMillis();
      for (int i = 0; i < 500000; i++)
        count = (Math.sin(3.20) + Math.cos(3.3)) / 2.4367;// 140 - 156 milli seconds
      totalTime =  System.currentTimeMillis() - startTime;
      if (totalTime < lowTime)
        lowTime = totalTime;
      if (totalTime > highTime)
        highTime = totalTime;
      }
    double latency = highTime/10.0 + 0.987;
    elapsedTime = (lowTime + " - " + highTime);
    t2i.setText(elapsedTime);
    l2i.setText(String.valueOf(latency));
   // messageLabel.setText("Average time for executing 500,000 sin cos math calculations.");
    }

// Run test 3
  void jMenuRunTest3_actionPerformed(ActionEvent e)
    {
    double longArray[];
    lowTime = 100000;
    highTime = 0;
    for (int j=0; j<6; j++)
      {
      startTime = System.currentTimeMillis();
      for (int i = 0; i < 50000; i++)
        longArray = new double[5000];   // 750 - 797 milli seconds
      totalTime =  System.currentTimeMillis() - startTime;
      if (totalTime < lowTime)
        lowTime = totalTime;
      if (totalTime > highTime)
        highTime = totalTime;
      }
    double latency = highTime/10.0 + 0.987;
    elapsedTime = (lowTime + " - " + highTime);
    t3i.setText(elapsedTime);
    l3i.setText(String.valueOf(latency));
   // messageLabel.setText("Average time for allocating an array of 5,000 doubles 50,000 times.");
    }

// Run test 4
    class MyPoint
      {
      double x;
      double y;
      }; //MyPoint

    private MyPoint fillPoint(double x, double y)
      {
      MyPoint newPoint = new MyPoint();
      newPoint.x = x;
      newPoint.y = y;
      return newPoint;
      } //fillPoint

  void jMenuRunTest4_actionPerformed(ActionEvent e)
    {
    lowTime = 100000;
    highTime = 0;
    MyPoint fixedLatLonArray[] = new MyPoint[50000];
    lowTime = 100000;
    highTime = 0;
    for (int j=0; j<6; j++)
      {
      startTime = System.currentTimeMillis();
      for (int a = 0; a < 20; a++)  // 515 -563 milli seconds
        for (int i = 0; i < 50000; i++)
          fixedLatLonArray[i] = fillPoint(2.4537893, 3.4561254);
      totalTime =  System.currentTimeMillis() - startTime;
      if (totalTime < lowTime)
        lowTime = totalTime;
      if (totalTime > highTime)
        highTime = totalTime;
      }
    double latency = highTime/10.0 + 0.987;
    elapsedTime = (lowTime + " - " + highTime);
    t4i.setText(elapsedTime);
    l4i.setText(String.valueOf(latency));
   //s messageLabel.setText("Average time for filling an array of 50,000 Points 20 times.");
    }




// ###########################################################################
// ###### File | Exit
class tt_jMenuFileExit_ActionAdapter
    implements ActionListener
{
  tt adaptee;
  tt_jMenuFileExit_ActionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuFileExit_actionPerformed(e); }
}

class tt_jMenuUploadNewFile_ActionAdapter
implements ActionListener
{
tt adaptee;
tt_jMenuUploadNewFile_ActionAdapter(tt adaptee)
{ this.adaptee = adaptee; }
public void actionPerformed(ActionEvent e)
{ adaptee.jMenuUploadNewFile_actionPerformed(e); }
}
class tt_jMenuUploadNewMetrics_ActionAdapter
implements ActionListener
{
tt adaptee;
tt_jMenuUploadNewMetrics_ActionAdapter(tt adaptee)
{ this.adaptee = adaptee; }
public void actionPerformed(ActionEvent e)
{ adaptee.jMenuUploadNewMetrics_actionPerformed(e); }
}
// ###########################################################################
// ###### Help | About
class tt_jMenuHelpAbout_ActionAdapter
    implements ActionListener
{
  tt adaptee;
  tt_jMenuHelpAbout_ActionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuHelpAbout_actionPerformed(e); }
}
// ###########################################################################
// ###### Run | Run Test 1
class tt_jMenuRunTest1_actionAdapter implements java.awt.event.ActionListener
{ tt adaptee;
  tt_jMenuRunTest1_actionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuRunTest1_actionPerformed(e); }
}
// ###########################################################################
// ###### Run | Run Test 2
class tt_jMenuRunTest2_actionAdapter implements java.awt.event.ActionListener
{ tt adaptee;
  tt_jMenuRunTest2_actionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuRunTest2_actionPerformed(e); }
}
// ###########################################################################
// ###### Run | Run Test 3
class tt_jMenuRunTest3_actionAdapter implements java.awt.event.ActionListener
{ tt adaptee;
  tt_jMenuRunTest3_actionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuRunTest3_actionPerformed(e); }
}
// ###########################################################################
// ###### Run | Run Test 4
class tt_jMenuRunTest4_actionAdapter implements java.awt.event.ActionListener
{ tt adaptee;
  tt_jMenuRunTest4_actionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuRunTest4_actionPerformed(e); }
}
// ###########################################################################
  void jMenuRunEnvironment_actionPerformed(ActionEvent e)
  {
  String enviroment = new String();

  enviroment = System.getProperty("java.version");
  javaRunTimeLabel.setText("Java Runtime Environment = " + enviroment);

  enviroment = System.getProperty("java.vm.specification.version");
  javaVmLabel.setText("Java VM = " + enviroment);

  enviroment = System.getProperty("java.io.tmpdir");
  classPathLabel.setText("Java Temp Dir = " + enviroment);
  }
// ###########################################################################
// ###### Run | Environment
class tt_jMenuRunEnvironment_actionAdapter implements java.awt.event.ActionListener
{ tt adaptee;
  tt_jMenuRunEnvironment_actionAdapter(tt adaptee)
  { this.adaptee = adaptee; }
  public void actionPerformed(ActionEvent e)
  { adaptee.jMenuRunEnvironment_actionPerformed(e); }
}
// ###########################################################################

}// END class tt
