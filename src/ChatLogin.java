import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import User.User;

import java.awt.Font;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;


public class ChatLogin extends JFrame {
	
	protected static Logger log =
			LoggerFactory.getLogger(ChatLogin.class);
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatLogin frame = new ChatLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatLogin() {
		setTitle("\u804A\u5929\u5BA4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 235);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("用户名");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		
		JOptionPane anOptionPane=new JOptionPane();
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		//button事件处理
		btnNewButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent event)
           {    
			String myname=textField.getText();   
             if(myname.compareTo("")!=0 )
             {
    			//创建自己的对象
    			String myMAC = getHostIp();
    			String myIP = getHostMac();
    			User me = new User(myname,null,myMAC,myIP);
       
           // textField.setVisible(true); // pop up dialog
             }else
             JOptionPane.showMessageDialog(null, "User name can't be empty!");
          }
		//显示上线窗口
public  void showFrameLogin() {
	try {
		ChatLogin framelogin;
		framelogin = new ChatLogin();
		framelogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		// 把窗口置于中心
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					Dimension frameSize =  framelogin.getSize();
					if (frameSize.height > screenSize.height) {
					frameSize.height = screenSize.height;
					}
					if (frameSize.width > screenSize.width) {
					frameSize.width = screenSize.width;
					}
					 framelogin.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height -
					frameSize.height) / 2);
					
					 framelogin.setVisible(true);
					log.info("login frame show up.");
		}catch (Exception e) {
			e.printStackTrace();
		}
}

        
		});
		

			
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addComponent(lblNewLabel)
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(112, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	
	
	//内部函数
	//获得本机IP地址
protected String getHostIp(){
String myip =null;
	try{
		InetAddress local=InetAddress.getLocalHost();
		myip=local.getHostAddress();
		
	}catch(UnknownHostException e){
		e.printStackTrace();
	}
	return myip;
}
//获得本机Mac地址
protected String getHostMac(){
	String mymac=null;
	NetworkInterface netInterface = null;
	try{
		netInterface = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
		byte[] macAddr = netInterface.getHardwareAddress();
		mymac = new String(macAddr);
	}catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return mymac;	
	
 }

}






