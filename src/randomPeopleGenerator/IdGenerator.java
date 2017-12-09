/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomPeopleGenerator;

/**
 *
 * @author alex
 */
public class IdGenerator {
    // Esto quizá se pueda hacer mejor con patrones
    private static int    idNumber;
    private static String idChars;
    
    private static final int defaultMinValue = 1_000_000;
    private static final int defaultMaxValue = 10_000_000;
    
    private static final String charSequence = "TRWAGMYFPDXBNJZSQVHLCKE";
    private static final int numberOfChars   = charSequence.length();
    
    static RandomUtils random;
    
    public static String getOneByDefault() {
        
        idNumber = random.getRandomIntInInterval( defaultMinValue , defaultMaxValue );
        
        idChars = "" + charSequence.charAt( idNumber % 23 );
        
        return idNumber + idChars;
    }
    
    public static String getOneWithPattern( String pattern ) {
        
        System.out.println( "To be implemented. Now returns \"OneByDefault\"" );
        
        return getOneByDefault();
    }
    
}
