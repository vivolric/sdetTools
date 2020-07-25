package TestNG.Day3;

import java.util.ArrayList;
import java.util.Random;

public class HowisRandomNumMethodIsWorking {

    public static void main(String[] args) {

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("a1");
        s1.add("a2");
        s1.add("a3");
        s1.add("a4");
        s1.add("a5");

        for(int i = 0 ; i<10 ;i++){
            Random rnd = new Random();
            int randomNum= rnd.nextInt(5-1)+1;

            System.out.println(s1.get(randomNum));
        }
    }
}
