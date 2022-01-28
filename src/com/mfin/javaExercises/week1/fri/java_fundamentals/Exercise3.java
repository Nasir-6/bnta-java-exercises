package com.mfin.javaExercises.week1.fri.java_fundamentals;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */

        String[] content = {"you", "are", "how", "hello"};
        String[] reversedString = printReverseStringArray(content);




    }


    public static String[] printReverseStringArray(String[] content) {
        String[] reversedContent = new String[content.length];
        for(int i=0; i< content.length; i++){
            reversedContent[i] = content[content.length-1-i];
            if(i == content.length-1){
                System.out.print(reversedContent[i]);
            }else{
                System.out.print(reversedContent[i] + " ");
            }
        }
        System.out.println("?");
        return reversedContent;
    }
}
