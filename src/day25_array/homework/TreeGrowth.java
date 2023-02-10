package day25_array.homework;

public class TreeGrowth {
    /*
    Use a loop to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years, and then afterwards it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.
Use the format:
year x - growth x cm
tree size: x cm

where the 'x' values are different values of year, the growth amount, and the total tree size up to that year
     */
    public static void main(String[] args) {
        int year = 0;
        int growth =0;
        int treeSize = 0;
        for ( int i = 0; i <3; i++){
            year += 1;
            growth =1;
            treeSize +=1;
            System.out.println("year " +year + " - growth " + growth + " cm");
            System.out.println("Treesize: "+ treeSize + " cm");
            System.out.println();
        }

        for (int j  = 0; j<7; j++) {
            year += 1;
            growth = 2;
            treeSize +=2;
            System.out.println("year " +year + " - growth " + growth + " cm");
            System.out.println("treesize: "+ treeSize + " cm");
            System.out.println();

        }
    }
}
