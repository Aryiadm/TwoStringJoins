import com.sun.scenario.effect.Merge;

import java.util.ArrayList;

public class twoStringMethods {

    public static void main(String[] args) {
        abcTest("abc.123");
        twoStrings("Hi", "There");
        System.out.println(twoStrings("Hi", "There"));

    }

    public static String twoStrings(String str1, String str2) {

        String remainderLetters = "";
        String MergedString = "";
        String newMergedString;
        String letterAtIndexStr1;
        String letterAtIndexStr2;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                letterAtIndexStr1 = str1.substring(i, i + 1);
                letterAtIndexStr2 = str2.substring(i, i + 1);
                MergedString = MergedString + letterAtIndexStr1 + letterAtIndexStr2;
            }

        }

        if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                letterAtIndexStr1 = str1.substring(i, i + 1);
                letterAtIndexStr2 = str2.substring(i, i + 1);
                MergedString =  MergedString +letterAtIndexStr1 + letterAtIndexStr2;
            }
                remainderLetters =remainderLetters+ str1.substring(str2.length());
        }
        if (str2.length() > str1.length()) {
            for (int i = 0; i < str1.length(); i++) {
                letterAtIndexStr1 = str1.substring(i, i + 1);
                letterAtIndexStr2 = str2.substring(i, i + 1);
                MergedString =  MergedString + letterAtIndexStr1 + letterAtIndexStr2;
            }
                remainderLetters =remainderLetters+ str2.substring(str1.length());
        }

        newMergedString = MergedString + remainderLetters;

        return newMergedString;
    }


    public static boolean abcTest(String textInput) {
        // check if textInput has .abc
        // if yes... return false

        if ((textInput.contains(".abc"))) {
            return false;
        }
        return true;
    }

}
