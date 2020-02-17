package mn223dn_assign4.sort_cities;

import java.io.*;
import java.util.*;

public class SortCities {
	public static void main(String[] args) {
		ArrayList<City> unsortArr = new ArrayList<City>();

		try {
			unsortArr = readCities("c:\\temp\\cities.txt");
			System.out.println("Unsorted array: " + unsortArr);
		} catch (Exception e) {
			System.err.println("Error");
			e.printStackTrace();
		}
		
		System.out.println( numberOfCities(unsortArr) );
		
		System.out.println("Sorted: " + sortCitiesArray(unsortArr));
	}

	
	private static ArrayList<City> arr = new ArrayList<City>();

	public static ArrayList<City> readCities(String path) throws IOException {

		File file = new File(path);
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			StringBuilder name = new StringBuilder();
			StringBuilder zip = new StringBuilder();
			StringBuilder sb = new StringBuilder();

			sb.append(scan.nextLine());
			String s = sb.toString();
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					zip.append(s.charAt(i));
				} else if (Character.isLetter(s.charAt(i))) {
					name.append(s.charAt(i));

				}

			}
			City city = new City(Integer.parseInt(zip.toString()), name.toString());

			arr.add(city);

		}
		scan.close();
		return arr;
	}

	public static String numberOfCities(ArrayList<City> inArr){
		return "Number of cities found: "+inArr.size();
	}
	
	public static ArrayList<City> sortCitiesArray(ArrayList<City> inArr) {

		ArrayList<City> sortedArr = new ArrayList<City>();

		for (int i = 0; i < inArr.size(); i++) {
			sortedArr.add(inArr.get(i));
		}

		for (int i = 0; i < sortedArr.size() - 1; i++) {
			City a = sortedArr.get(i);
			City b = sortedArr.get(i + 1);

			if (a.compareTo(b) == 0) {
				City temp = b;
				sortedArr.remove(b);
				sortedArr.add(i, temp);
				i = 0;
			}

		}
		return sortedArr;
	}
}
