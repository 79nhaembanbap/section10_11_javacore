package ServiceImpl;

import java.util.Scanner;

import Model.Laptop;
import Service.LaptopService;
import Service.StudentService;

public class LaptopServiceImpl implements LaptopService {

	@Override
	public void input(Laptop laptop) {

		
		System.out.println("Vui long nhap ID");
		laptop.setId(new Scanner(System.in).nextInt());

		
		System.out.println("Vui long nhap CPU");
		laptop.setCpu(new Scanner(System.in).nextLine());

		
		System.out.println("Vui long nhap Ram");
		laptop.setRam(new Scanner(System.in).nextLine());

	
		System.out.println("Vui long nhap VGA");
		laptop.setVga(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(Laptop laptop) {
		System.out.println("ID: " + laptop.getId() + " CPU: " + laptop.getCpu() + " Ram: " + laptop.getRam() + " VGA: "
				+ laptop.getVga());
	}

}
