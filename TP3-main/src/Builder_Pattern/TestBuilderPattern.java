package Builder_Pattern;

public class TestBuilderPattern {
	
	public static void main(String[] args) {
	    Computer computer = new Computer.ComputerBuilder("1To", "16Go")
	                            .setGraphicsCardEnabled(true)
	                            .setBluetoothEnabled(true)
	                            .build();

	    System.out.println("HDD : " + computer.getHDD());
	    System.out.println("RAM : " + computer.getRAM());
	    System.out.println("Graphics card enabled : " + computer.isGraphicsCardEnabled());
	    System.out.println("Bluetooth enabled : " + computer.isBluetoothEnabled());
	}

}
