package domainProblem;

import java.util.HashMap;

public class Domain {

	public static void main(String[] args) {

		HashMap<String, Integer> domainNames = new HashMap<>();

		domainNames.put("google.com", 10);
		domainNames.put("chat.google.com", 30);
		domainNames.put("xyz.com", 30);
		domainNames.put("chat.xyz.com", 30);
		domainNames.put("ayz.com", 30);
		domainNames.put("htg.in", 40);

		HashMap<String, Integer> domainNames2 = new HashMap<>();
		HashMap<String, Integer> domainNames3 = new HashMap<>();

		domainNames.forEach((key, value) -> {
			String name = key;
			String domainArr[] = name.split("\\.");
			int count = value;
			String temp = "";
			for (int i = domainArr.length - 1; i >= domainArr.length - 2; i--) {

				if (temp.length() == 0) {
					temp = "";
				} else {
					temp = "." + temp;
				}

				temp = domainArr[i] + temp;

				domainNames2.put(temp, domainNames2.getOrDefault(temp, 0) + count);
			}

		}

				);
		System.out.println("domain count ");
		domainNames2.forEach((key, value) -> {

			System.out.println(key + "  " + value);
		});

		domainNames.forEach((key, value) -> {
			String name = key;
			String domainArr[] = name.split("\\.");
			int count = value;
			String temp = ".";


			if (domainArr.length >1) {

				temp = domainArr[domainArr.length - 2] + temp + domainArr[domainArr.length - 1];


				domainNames3.put(temp, domainNames3.getOrDefault(temp, 0) + count);
			}
		});

		System.out.println("Same domain hit count ");
		domainNames3.forEach((key, value) -> {

			System.out.println(key + "  " + value);
		});




	}

}
