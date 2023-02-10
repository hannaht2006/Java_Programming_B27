package day24_array.homework;

import java.util.Arrays;

public class MultipleWords {
    /*
    Multiple Words

	Given a String of words that are separate by comma and spaces. Find and print any words that have more than one word

	Example

		Input:
			knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer
		Output:
			wooden spoons
			trash can
			dish washer
     */
    public static void main(String[] args) {
        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String spaceWord = "";

        String []words = str.split(", ");
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(" ")) {
                spaceWord += "\n" + words[i];
            }
        }
        System.out.println(spaceWord);
    }
}
