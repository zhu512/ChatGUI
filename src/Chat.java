import java.awt.Button;

import java.awt.Color;

import java.awt.Frame;

import java.awt.Label;

import java.awt.Panel;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat implements ActionListener{
	
		Frame nw=new Frame("登录");
		Panel nn=new Panel();
		
		Label a1=new Label("用户名");
		
		TextField b1=new TextField("");
		
		Button n1=new Button("登录");
 public void run(){		
		nn.add(a1);
		nn.add(b1);
		nn.add(n1);
		nw.add(nn);
		n1.addActionListener(this);
		nw.setSize(300,250);
		nw.setVisible(true);
     }
 public static void main(String agrs[]){

		Chat e1=new Chat();
		e1.run();
		
	}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==n1){
		Frame nw1=new Frame("信息");
		TextField b3=new TextField("功能尚未开放");
		nw1.add(b3);
		nw1.setSize(200,200);
		nw1.setVisible(true);
	}
	
}
}


