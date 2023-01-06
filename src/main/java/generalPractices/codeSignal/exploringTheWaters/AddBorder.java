package generalPractices.codeSignal.exploringTheWaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For picture =
           ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
 */
public class AddBorder {
    public static void main(String[] args){
        String[] str = {"abc", "ded"};

        String[] str1 = {"aa", "**", "zz"};

        String[] str2 = {"a"};

        //System.out.println(Arrays.toString(solution(str2)));

        System.out.println(Arrays.toString(solutionWithList(str1)));

    }

    static String[] solution(String[] picture) {
        String[] framed = new String[picture.length +2];

        for(int i=0; i < picture.length; i++){
            framed[i+1] = '*' + picture[i] + '*';
        }

        framed[0] = framed[picture.length +1] = framed[1].replaceAll("\\.","*");

        return framed;
    }

    static String[] solutionWithList(String[] picture){
        List<String> borderedPicture = new ArrayList<>();

        // Add top border
        borderedPicture.add(String.format("%0" + (picture[0].length() + 2) + "d", 0).replace("0", "*"));

        // Add rows with left and right borders
        for (String row : picture) {
            borderedPicture.add("*" + row + "*");
        }


        // Add bottom border
        borderedPicture.add(String.format("%0" + (picture[0].length() + 2) + "d", 0).replace("0", "*"));


        return borderedPicture.toArray(new String[0]);
        }
    }

