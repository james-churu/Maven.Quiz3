package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        int count = 0;
        for(int x = 0; x <= str.length() -1 ; x++){
            if(Character.isLetter(str.charAt(x))){
                count++;
            }
        }

        String[] newArr = new String[count];

        String lowerCase = str.toLowerCase();

        int indx =0;
        for(int x = 0; x <= count-1; x++) {
            String answer = "";
            char[] StrtoChar = lowerCase.toCharArray();

            if(Character.isAlphabetic(StrtoChar[indx])){
                String upperS = "";
                upperS += StrtoChar[indx];
                StrtoChar[indx] = upperS.toUpperCase().charAt(0);
                for(char element : StrtoChar){
                    answer+=element;
                }
                newArr[x] = answer;
                indx++;
            }else{

                x--;
                indx++;
            }

        }

        return newArr;
    }
}
