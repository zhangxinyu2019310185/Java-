package Exp1;

public class Test {
	public static void main(String args[]){
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
		cpu.setSpeed(2200);
		cpu.setAvailability(1);
		HD.setAmount(200);
		HD.setType("SSD");
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}
}