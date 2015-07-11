package User;

public class User implements java.io.Serializable {
	String name;//用户名
	String remark;//备注
	String IP;//IP地址
	String MAC;//MAC地址
	
public  User(String na,String re,String ip,String mac)
{
	name=na;remark=re;IP=ip;MAC=mac;
}
public String getRemark(){
	return this.remark;
}
public String getIP(){
	return this.IP;
}
public String getMAC(){
	return this.MAC;
}
//保存用户备注等信息
public void setRemark(String re){
	this.remark = re;
}
public void setIP(String ip){
	this.IP=ip;
}
public void setMAC(String mac){
	this.MAC=mac;
}
public String toString(){
	return name+","+remark+","+IP+","+MAC;
}
}
