package nyc.c4q.fattyduck;

import com.sun.org.apache.xalan.internal.xsltc.runtime.StringValueHandler;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by fattyduck on 3/31/15.
 */
public class exer1 {

//    public static HashMap<String, Integer> WordTracker(){
//
//        return WordTracker;
//    }

    public static void main(String[] args) {
        HashMap<String, Integer> WordTracker = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        boolean addMode = true;
        System.out.println("Give me some words and tell me when to stop");


        while (true) {
            String key = scan.nextLine();
            if (key.equalsIgnoreCase("stop")) {
                System.out.println("Thanks you have given me " + WordTracker.size() + " words");
                System.out.println(WordTracker);
                break;
            }
            if (key.equalsIgnoreCase("rm")) {
                addMode = false;
                continue;
            } else if (key.equalsIgnoreCase("add")) {
                addMode = true;
                continue;
            } else {
                if (!addMode) {
                    WordTracker.remove(key);
                } else {
                    WordTracker.put(key, 1);
                }
            }
        }
        Set keySet= WordTracker.keySet();
        String key = keySet.toString();
        key=key.replace("[","");
        key=key.replace("]","");
        key=key.replace(" ","");
        String[] keys = key.split(",");
        for(int i=0; i<keys.length; i++){
            System.out.println(keys[i]+" : "+WordTracker.get(keys[i]));
        }
    }
}
