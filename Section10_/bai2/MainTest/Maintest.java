package MainTest;

import Model.Laptop;
import Service.LaptopService;
import Service.StudentService;
import ServiceImpl.LaptopServiceImpl;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop();
		LaptopService laptopService = new LaptopServiceImpl();
		laptopService.input(laptop);
		laptopService.info(laptop);
	}

}
