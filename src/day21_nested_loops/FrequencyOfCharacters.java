package day21_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        /*
        given a string determine how many times character is in the String java
        j - 1
        a - 2
        v - 1
        check j:
        j==j
        j==a
        j==v
        j==a
        check a:
        a==j
        a==a
        a==v
        a==a
         */
        String str = "hello world java";
        String check = "";

        for (int i = 0; i < str.length(); i++){ //outer: iterating one character at a time --> str.charAt(i)
            int count = 0; // the counter should reset back to 0 for every character

            if(!check.contains("" + str.charAt(i))) {// only run the counting and inner loop if the character has not already been checked


                for (int j = 0; j < str.length(); j++) {//inner ; compare the character we are looking at (i) with each other character in the string --> str.charAt(j)
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }

                }
                System.out.println(str.charAt(i) + " - " + count);
                check += str.charAt(i); // adds to the checked string
            }// if statement ends

        }// outer loop ends
    }
}
/*
String str = "java";
        String check = "";

        for (int i = 0; i < str.length(); i++){ //outer: iterating one character at a time --> str.charAt(i)
            int count = 0; // the counter should reset back to 0 for every character

            if(check.contains("" + str.charAt(i))){
                continue;
            }

            for (int j = 0; j< str.length(); j++){//inner ; compare the character we are looking at (i) with each other character in the string --> str.charAt(j)
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            System.out.println(str.charAt(i)+ " - "+ count);
            check += str.charAt(i);

        }
    }
}

 */
