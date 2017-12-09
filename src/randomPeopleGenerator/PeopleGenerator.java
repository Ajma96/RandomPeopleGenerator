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
 * @author matinal
 */
public class PeopleGenerator {

  /**
   * @param args the command line arguments
   */
  public static void main( String[] args ) {
      
    int peopleQuantity = 100;
    
    List<String> maleNames   = NameAndSurnameGenerator.getMaleNameList();
    List<String> femaleNames = NameAndSurnameGenerator.getFemaleNameList();
    List<String> surnameList = NameAndSurnameGenerator.getSurnameList();
    
    setNamesAndSurnames( maleNames, femaleNames, surnameList );
    // Pruebas
    NameAndSurnameGenerator.setSizeOfMaleNameList  ( maleNames.size() );
    NameAndSurnameGenerator.setSizeOfFemaleNameList( femaleNames.size() );
    NameAndSurnameGenerator.setSizeOfSurnameList( surnameList.size() );
    
      System.out.println( generatePeople( peopleQuantity ) );
    
  }
  
  private static void setNamesAndSurnames ( List<String> maleNames, List<String> femaleNames, List<String> surnames ) {
    // Esto está así solo para comprobar que funciona, hay que hacerlo bien, leyendo ficheros.
    maleNames.add("John");
    maleNames.add("Carl");
    maleNames.add("Leonard");
    maleNames.add("Michael");
    maleNames.add("Alex");
    
    femaleNames.add("Jane");
    femaleNames.add("Marie");
    femaleNames.add("Ingrid");
    femaleNames.add("Ann");
    femaleNames.add("Iria");
    
    surnames.add("Doe");  
    surnames.add("Harvey");   
    surnames.add("Scott");   
    surnames.add("Hernández");   
    surnames.add("Nasser");   
    surnames.add("Potato");    
    surnames.add("McNamara");   
    surnames.add("Hall");   
    surnames.add("Müller");
    surnames.add("Hoxha");
    surnames.add("Dacosta");
    surnames.add("Kojima");
    surnames.add("Moretti");
    
  }
  
  private static String generatePeople( int quantityOfPeople ) {
      
      List<Person> peopleList = new ArrayList();
      
      for ( int i = 0; i < quantityOfPeople; i ++ ) {
          peopleList.add( new Person() );
      }
      
      // Aquí debería generarme un fichero con los datos
      
      return peopleList.toString(); // Quitar los '[', ']' y las comas al imprimir
  }
  
}
