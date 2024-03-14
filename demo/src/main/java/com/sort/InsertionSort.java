// Java program for implementation of Insertion Sort
package com.sort;

import org.json.simple.*;

public class InsertionSort {

  private static int count = 0;

  public static void main(String[] args) {
    String fileName = "/Users/mystery/src/data-structures/Lovelace-Cupcakes---Insertion-Sort/demo/src/main/java/com/sort/cupcake_3906.json";

    // read cupcake names
    JSONArray cupcakeArray = JSONFile.readArray(fileName);
    String[] cupcakeNameArray = nameArray(cupcakeArray);
    System.out.println(cupcakeNameArray);

    // print unsorted list
    System.out.println("----- Unsorted array -----");
    print(cupcakeNameArray);

    // sort
    sort(cupcakeNameArray);

    // print sorted list
    System.out.println("----- Sorted array----- ");
    print(cupcakeNameArray);

    // print statistics
    System.out.println("----- Statistics -----");
    System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
    System.out.printf("Count = %d\n", count);
  }

  // print cupcake array
  public static void print(String[] cupcakeNameArray) {
    System.out.printf("Number\tName\n");
    System.out.printf("------\t---------------\n");
    for (int i = 0; i < cupcakeNameArray.length; i++) {
      System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
    }
  }

  // get array of cupcake names
  public static String[] nameArray(JSONArray cupcakeArray) {
    String[] arr = new String[cupcakeArray.size()];

    // get names from json object
    for (int i = 0; i < cupcakeArray.size(); i++) {
      JSONObject o = (JSONObject) cupcakeArray.get(i);
      String name = (String) o.get("name");
      arr[i] = name;
    }
    return arr;
  }
	/*Function to sort array using insertion sort*/
	public static void sort(String[] arr)
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
				count++;
			}
			arr[j + 1] = key;
		}
	}

};


/* This code is contributed by Rajat Mishra. */

