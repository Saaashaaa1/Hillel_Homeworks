package util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvider {
    static List<String> Listname = Arrays.asList("Suleiman", "TestCatUser", "Lucifer");
    static List<Integer> ListAget = Arrays.asList(1,4,7);

    public static String getRandomName(){
        return Listname.get(new Random().nextInt(Listname.size()));
    }
    public static int getRandomAget(){
        return ListAget.get (new Random().nextInt(ListAget.size()));
    }
}
