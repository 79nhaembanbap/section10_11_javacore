package Model;

public class Laptop {
	private int id;
	private String cpu;
	private String ram;
	private String vga;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getVga() {
		return vga;
	}

	public void setVga(String vga) {
		this.vga = vga;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
}
