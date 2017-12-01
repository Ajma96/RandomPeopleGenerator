/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomPeopleGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author matinal
 */
public class RandomPeopleGenerator {

  /**
   * @param args the command line arguments
   */
  public static void main( String[] args ) {
    
    String[] firstnames = {
      "John", "Jane", "Marie", "Ingrid", "Alex",
      "Carl", "Leonard", "Ann", "Michael", "Iria"
    };
    
    String[] surnames   = {
      "Sanders", "Ramirez", "Doe", "Goldman", "Harvey",
      "McNamara", "Jackson", "Murphy", "Smith", "Scott"
    };
    
    int expectedRandomNames  = 100;
    int cuantityOfFirstnames = firstnames.length;
    int cuantityOfSurnames   = surnames  .length;
    
    List randomPeopleList = new ArrayList();
    
    for ( int i = 0; i < expectedRandomNames; i ++ ) {
      randomPeopleList.add( 
        firstnames[ getRandomParameter( cuantityOfFirstnames ) ]
                    + " " +
        surnames  [ getRandomParameter( cuantityOfSurnames ) ]
      );
    }
    
    System.out.println( randomPeopleList );
    
  }
  
  /**
     * No provoca segmentation fault porque el return usa 'cuantityOfElements'
     * como tope máximo, sin incluirlo, así que no se sale de la lista
     */
  public static int getRandomParameter( int cuantityOfElements ) {
    return ThreadLocalRandom.current().nextInt( 0, cuantityOfElements );
  }
  
}
