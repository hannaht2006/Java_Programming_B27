package day28_methods.homework;

public class FixFormat {
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James
     */
    public static void main(String[] args) {
        String str = "hannah";
        System.out.println(fixFormat(str));
    }
    public static String fixFormat(String str){
        String str1 = str.toLowerCase().trim();
        String fixFormat = str1.substring(0,1).toUpperCase()+str1.substring(1,str1.length());

        return fixFormat;
    }

}
