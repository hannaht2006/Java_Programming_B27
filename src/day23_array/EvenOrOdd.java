package day23_array;

public class EvenOrOdd {
    public static void main(String[] args) {

        int [] nums = {3, 5, 12, 12, 5, 12, 4, 2};
        int even = 0, odd = 0;

        for (int each : nums){

            if (each % 2 == 0){
                even++;

            }else {
                odd++;
            }
        }

      //  for (int i = 0; i< nums.length; i++){

      //      if (nums[i] % 2 == 0){
       //         even++;

        //    }else {
        //        odd++;
         //   }
       // }
        System.out.println("even: "+ even);
        System.out.println("Odd: "+odd);
    }

}
