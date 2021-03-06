import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > maximumDifference) {
                    maximumDifference = diff;
                }
            }
        }
   }

} // End of Difference class
