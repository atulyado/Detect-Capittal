
import java.util.regex.Pattern;
class Solution {
    public boolean detectCapitalUse(String word) {
       return Pattern.matches("([A-Z]+|[a-z]+|[A-Z][a-z]*)",word);//[A-Z] checks all caps [a-z] checks all lows [A-Z][a-z] check if the first is caps and last is low
    }// example this FLaG this is false
}
