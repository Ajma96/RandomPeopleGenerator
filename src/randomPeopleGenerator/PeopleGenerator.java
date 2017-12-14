/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomPeopleGenerator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    int format = 1;
    
    List<String> maleNames   = NameAndSurnameGenerator.getMaleNameList();
    List<String> femaleNames = NameAndSurnameGenerator.getFemaleNameList();
    List<String> surnameList = NameAndSurnameGenerator.getSurnameList();
    
    setNamesAndSurnames( maleNames, femaleNames, surnameList );
    
    NameAndSurnameGenerator.setSizeOfMaleNameList  ( maleNames.size() );
    NameAndSurnameGenerator.setSizeOfFemaleNameList( femaleNames.size() );
    NameAndSurnameGenerator.setSizeOfSurnameList( surnameList.size() );
    
    System.out.println( generatePeople( peopleQuantity ) );
    
  }
  
  private static void setNamesAndSurnames ( List<String> maleNames, List<String> femaleNames, List<String> surnames ) {
    // Esto está así solo para comprobar que funciona, hay que hacerlo bien, leyendo ficheros.
    /*
    String inputString = "";
    
    try {
      Files.readAllBytes( Paths.get( "./maleNames.json", inputString ) );
    }
    catch (IOException ex) {
      System.out.println("Error al leer el archivo maleNames.json");
    }
    
     Gson gson = new GsonBuilder().create();
     gson.fromJson( inputString, String.class);
     
     System.out.println( inputString );
     */
    
    maleNames.add("John");
    maleNames.add("Carl");
    maleNames.add("Leonard");
    maleNames.add("Michael");
    maleNames.add("Alex");
    maleNames.add("Rodrigo");
    maleNames.add("Abdul");
    maleNames.add("Alistair");
    maleNames.add("Oswald");
    maleNames.add("Daniel");
    maleNames.add("Martin");
    
    femaleNames.add("Jane");
    femaleNames.add("Marie");
    femaleNames.add("Ingrid");
    femaleNames.add("Anya");
    femaleNames.add("Iria");
    femaleNames.add("Brianna");
    femaleNames.add("Darlene");
    femaleNames.add("Elsa");
    femaleNames.add("Flora");
    femaleNames.add("Patty");
    femaleNames.add("Susan");
    
    
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
    surnames.add("Ripley");
    surnames.add("Rodríguez");
    surnames.add("Huidobro");
    surnames.add("Jackson");
    surnames.add("Lee");
    surnames.add("Wan");
    surnames.add("Martínez");
    surnames.add("Smith");
    surnames.add("Carrey");
    surnames.add("Williams");
    surnames.add("Moore");
    surnames.add("King");
    surnames.add("Wright");
    
  }
  
  private static String generatePeople( int quantityOfPeople ) {
      
      String outputString = quantityOfPeople + " people generated in .json format ";
    
      List<Person> peopleList = new ArrayList();
      
      for ( int i = 0; i < quantityOfPeople; i ++ ) {
          peopleList.add( new Person() );
      }
      
      // Parseamos la lista de Java a JSON
      String jsonList = peopleList.toString();
      jsonList = new Gson().toJson( peopleList );
      
      // Creamos el fichero JSON
    try {
      Files.write( Paths.get("./randomPeople.json"), jsonList.getBytes() );
    }
    catch (IOException ex) {
      System.out.println("Error en escritura del fichero JSON");
    }
      
      System.out.println( jsonList );
      
      return outputString;
  }
  
}
