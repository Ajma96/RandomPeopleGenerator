/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomPeopleGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class NameAndSurnameGenerator {
    
    private static String name;
    
    public static List<String> maleNameList    = new ArrayList();
    public static List<String> femaleNameList  = new ArrayList();
    
    private static int sizeOfMaleNameList;    // = maleNameList  .size();
    private static int sizeOfFemaleNameList;  // = femaleNameList.size();
    
    private static List<String> surnameList = new ArrayList();
    
    private static int sizeOfSurnameList; // = surnameList.size();
    
    public static String getSurname() {
        return surnameList.get( RandomUtils.getRandomIntInZeroTo( sizeOfSurnameList ) );
    }
    
    public static String getName( boolean isMale ) {
        // 0 -> Female, 1 -> Male
        if ( isMale ) {
            name = maleNameList.get( RandomUtils.getRandomIntInZeroTo( sizeOfMaleNameList ) );
        }
        else {
            name = femaleNameList.get( RandomUtils.getRandomIntInZeroTo( sizeOfFemaleNameList ) );
        }
        
        return name;
    }
    
    public static List<String> getMaleNameList() {
        return maleNameList;
    }

    public static List<String> getFemaleNameList() {
        return femaleNameList;
    }
    
    public static List<String> getSurnameList() {
        return surnameList;
    }
    
    public static void setSizeOfMaleNameList(int sizeOfMaleNameList) {
        NameAndSurnameGenerator.sizeOfMaleNameList = sizeOfMaleNameList;
    }

    public static void setSizeOfFemaleNameList(int sizeOfFemaleNameList) {
        NameAndSurnameGenerator.sizeOfFemaleNameList = sizeOfFemaleNameList;
    }

    public static void setSizeOfSurnameList(int sizeOfSurnameList) {
        NameAndSurnameGenerator.sizeOfSurnameList = sizeOfSurnameList;
    }
    
}
