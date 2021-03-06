package ServiceImpl;

import java.util.Scanner;

import Model.Address;
import Model.Laptop;
import Service.AddressService;
import Service.LaptopService;

public class AddressServiceImpl implements AddressService {

	@Override
	public void input(Address address) {

		System.out.println("Vui long nhap ID");
		address.setId(new Scanner(System.in).nextInt());

		System.out.println("Vui long nhap Street");
		address.setStreet(new Scanner(System.in).nextLine());

		System.out.println("Vui long nhap City");
		address.setCity(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(Address address) {
		System.out
				.println("ID: " + address.getId() + " Street: " + address.getStreet() + " City: " + address.getCity());

	}
}
