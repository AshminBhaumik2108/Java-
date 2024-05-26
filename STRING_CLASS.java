
import java.util.Scanner; // OR import java.util.*;

public class STRING_CLASS {
    public static void main(String[] args) {

        // To take inputs..
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine(); // Taking input of Strings
        String name = "Ashmin";
        System.out.println(name);
        // length of the String....
        int lengthOfName = name.length();
        System.out.println("The length of Name is: "+lengthOfName);
        // To lowerCase of the string.....
        String lowerCase = name.toLowerCase();
        System.out.println("The Lower Case is: "+lowerCase);
        // To upperCase of the String.....
        String upperCase = name.toUpperCase();
        System.out.println("The Lower Case is: "+upperCase);
        // to trim the String type in Java....
        String trimString = "    Ashmin    ";
        System.out.println("Before Trim String: "+trimString);
        System.out.println("The String to Trim: "+trimString.trim()+" is my name.");
        // Substring methods in java.....
        String subString = "Hello Ashmin, Welcome to Java..";
        System.out.println(subString.substring(6));
        System.out.println(subString.substring(6, 20)); // end = index-1..
        // Rename Sentences in Java...
        System.out.println(subString.subSequence(3, 20)); // I think same as substring...
        // Rename characters in Java.......
        String characterReplacement = "Hi Harry, How are you...";
        System.out.println(characterReplacement.replace('r', 'p')); // Replaces the char with newChar.
        System.out.println(characterReplacement.replace("rry", "ier")); // It can also replace Strings.
        // The function of StartsWih and EndsWith functions in Strings...
        String startEndMatch = "Hi Harry, How are you...";
        System.out.println(startEndMatch.startsWith("Hi")); // true
        System.out.println(startEndMatch.endsWith("Hi")); // false
        // charAt defines the index at tell what the position of the character....
        String charAt = "Ashmin Bhaumik";
        System.out.println(charAt.charAt(5)); // 'n' is the output.
        // indexOf returns the index of the String in java...
        String indexof = "Ashmin Bhaumik";
        System.out.println(indexof.indexOf("hm")); // 2 is the output.
        // now start searching index from index 4 or any index onwards.
        System.out.println(indexof.indexOf('n', 5, indexof.length())); // 5 is the Output.
        // NOTE: indexof.lastIndexOf() - starts finding the string from the last of the String.
        // for Checking the String is equals to the given string...
        System.out.println(indexof.equals("Ashmin Bhaumik")); // true - Since, it is case-sensitive and
        // for checking Strings are equal or not but it doesn't check whether the string is in upperCase or in lower...
        System.out.println(indexof.equalsIgnoreCase("ASHMIN Bhaumik")); // it is not case-sensitive...
        // Escape Sequence character...
        System.out.println("Hello, my name is \"Ashmin\tBhaumik\""); // '\t' - used for tab space....
        // Compare two strings with compareTo Functions...
        String stringCompare1 = "forget";
        String stringCompare2 = "forgive";
        int valueOfStringCompare = stringCompare1.compareTo(stringCompare2); // For Comparing two Values together...
        // NOTE: For caseSensative cases we should use '<var_Name1>.compareToIgnoreCase(<var_Name2>)'....
        // Loop to check the statements.....
        if(valueOfStringCompare < 0) System.out.println("stringCompare1 comes before stringCompare2");
        else if(valueOfStringCompare > 0) System.out.println("stringCompare2 comes before stringCompare1");
        else System.out.println("Both the Values are Equal...");

        // Good Code..................................................................................................
        // for accidental change of strings we should use....
        String accidentalStringChange = "Hello <|name|>, my name is Amit..";
        // accidentalStringChange.replace("<|name|>", "Ashmin"); // It will not change like this since string imutable.
        accidentalStringChange = accidentalStringChange.replace("<|name|>", "Ashmin");
        System.out.println(accidentalStringChange);


        // STRING BUILDER CLASS.......................................................................................
        StringBuilder objectStr1 = new StringBuilder("Ashmin");
        StringBuilder objectStr2 = new StringBuilder(" Bhaumik ");
//        // appending in String builder class...
//        System.out.println(objectStr1.append(objectStr2)); // objectStr1 is changed to
//        // inserting a value or String in StringBuilder class which and it is mutable...
//        System.out.println(objectStr1.insert(0, objectStr2)); // for inserting a string...
//        System.out.println(objectStr1.insert(0, 'B')); // for inserting a character...

        // NOTE: 'String' is Immutable(can't be changed) while 'StringBuilder' & 'StringBuffer'
        //       is a mutable(can be changed) class....
        System.out.println(objectStr1.append(21));


    }
}
