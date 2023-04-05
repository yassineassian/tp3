package Builder_Pattern;

public class Computer {
	
	//required parameters
	private String HDD;
	private String RAM;

	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder builder) {
	    this.HDD = builder.HDD;
	    this.RAM = builder.RAM;
	    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	    this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String getHDD() {
	    return HDD;
	}

	public String getRAM() {
	    return RAM;
	}

	public boolean isGraphicsCardEnabled() {
	    return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
	    return isBluetoothEnabled;
	}

	// Builder class
	public static class ComputerBuilder {

	    //required parameters
	    private String HDD;
	    private String RAM;

	    //optional parameters
	    private boolean isGraphicsCardEnabled;
	    private boolean isBluetoothEnabled;

	    public ComputerBuilder(String HDD, String RAM) {
	        this.HDD = HDD;
	        this.RAM = RAM;
	    }

	    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
	        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	        return this;
	    }

	    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
	        this.isBluetoothEnabled = isBluetoothEnabled;
	        return this;
	    }

	    public Computer build() {
	        return new Computer(this);
	    }
	}

}
