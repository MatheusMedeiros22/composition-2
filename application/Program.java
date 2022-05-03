package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter with the departament name: ");
		String departamentName = sc.nextLine();
		Departament departament = new Departament(departamentName);
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.println("Base salary");
		Double baseSalary = sc.nextDouble();
		
		System.out.println("How many contracts to this worker: ");
		int manyContracts = sc.nextInt();
		
		for(int i = 1; i <= manyContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.println("Date (DD/MM/YYYY)");
			Date date = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
		}
		
		
		
		sc.close();
	}

}
