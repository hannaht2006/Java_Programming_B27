package day23_array.homework;

public class WebCheck {
    /*
    Website checker

	Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain

Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu
     */
    public static void main(String[] args) {
        String [] domain = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0, org = 0, gov = 0, edu = 0, net = 0, io = 0, jp = 0;
        for (int i = 0; i < domain.length; i++) {
            if (domain[i].contains(".com")){
                com +=1;
            }else if (domain[i].contains(".org")){
                org +=1;
            } else if (domain[i].contains(".gov")){
                gov +=1;
            }else if (domain[i].contains(".edu")){
                edu +=1;
            }
        }
        System.out.println("Number of website has domain .com : " + com);
        System.out.println("Number of website has domain .org : " + org);
        System.out.println("Number of website has domain .gov : " + gov);
        System.out.println("Number of website has domain .edu : " + edu);


    }
}
