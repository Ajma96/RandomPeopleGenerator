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
public class Person {
    
    private String  id;
    private String  sex;
    private String  name;
    private String  surname;
    
    private static NameAndSurnameGenerator nameGen;

    public Person() {
        
        this.id      = IdGenerator.getOneByDefault();
        this.sex     = RandomUtils.getRandomBoolean() == true? "Female" : "Male" ;
        this.name    = nameGen.getName( this.sex ); // Concordancy sex-name
        this.surname = nameGen.getSurname();
        
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nSex: " + sex + "\nName: " + name + 
          "\nSurname: " + surname + "\n_ _ _ _ _ _ _ _ _\n\n";
    }
    
}
