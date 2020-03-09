package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String answer = "";

        for(int x = 0; x<= str.length() -1; x++){
            if(x == indexToCapitalize){
                Character uppy = str.charAt(indexToCapitalize);
                String temp = "";
                temp += uppy;
                answer += temp.toUpperCase();
            }else{
                answer += str.charAt(x);
            }

        }
        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char actual = baseString.charAt(indexOfString);
        if(actual == characterToCheckFor){
            return true;
        }else{
            return false;
        }
    }

    public static String[] getAllSubStrings(String string) {

        ArrayList<String> answer = new ArrayList<>();


        for(int x =0; x<= string.length() ; x++){

            for(int z = x+1 ; z <= string.length() ; z++){
                String holder = string.substring(x,z);
                answer.add(holder);
            }
        }

        String[] newArr = new String[answer.size()];
        int index =0;
        for(String element : answer){
            if(index != 0 && element.equals(newArr[index -1])){

            }else{
                newArr[index] = element;
                index++;
            }
        }

        return newArr;
    }


    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length -1;
    }
}
