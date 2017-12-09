/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomPeopleGenerator;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author alex
 */
public class RandomUtils {
    
  public static int getRandomIntInZeroTo( int maxNumberNotIncluded ) {
    return ThreadLocalRandom.current().nextInt( 0, maxNumberNotIncluded );
  }
  
  public static int getRandomIntInInterval( int minNumber, int maxNumberNotIncluded ) {
    return ThreadLocalRandom.current().nextInt( minNumber, maxNumberNotIncluded );
  }
  
  public static boolean getRandomBoolean() {
      
      Integer randomNumber  = ThreadLocalRandom.current().nextInt( 0, 2 );
      boolean randomBoolean = false;
      
      switch ( randomNumber ) {
          
          case 0:
              randomBoolean = false;
              break;
              
          case 1:
              randomBoolean = true;
      }
      
      return randomBoolean;
  }
    
}
