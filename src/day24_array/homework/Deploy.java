package day24_array.homework;

import java.util.Arrays;

public class Deploy {
    /*
    Given two values:
	app = "google"
	& zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1"

deploy the app to each zone. Each zone is seperated by the # character

	Ex:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		etc...
     */
    public static void main(String[] args) {
        String zone ="us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";
        String app = "google";
        String []zones = zone.split("#");
        System.out.println(Arrays.toString(zones));

        for (String each :zones){
            System.out.println("Deploying "+ app+ " to " +each +" ...");
            System.out.println("Deployment completed for " +each);
            System.out.println();
        }
    }
}
