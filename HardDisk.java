package Exp1;

public class HardDisk {
	private int amount;
	public String type;
	HardDisk(){}
	HardDisk(int amount,String type){
		this.amount = amount;
		this.type = type;
		}
	void setAmount(int a){
		amount = a;
	}
	int getAmount(){
		return amount;
	}
	String setType(String b){
		this.type = b;
		String SSD = new String("SSD");
		String HDD = new String("HDD");
		if (type.equals(SSD))
		{
			return type;
		}
		else if(type.equals(HDD)){
			return type;
		}
		else{
			type = "这不是一个正确的硬盘种类！";
					return type;
		}
		
	}
}