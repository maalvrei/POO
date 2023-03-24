package clase24032023;

public class Person {
    int yearOfBirth;    // valor por defecto 2023 (acaba de nacer)
    String name;        // máximo 20 caracteres
    String surname;     // máximo 20 caracteres
    boolean brokenName;
    boolean brokenSurname;

    public Person(String name, String surname) {
        this(2023, name, surname);
    }

    public Person(int yearOfBirth, String name, String surname) {
        
        this.yearOfBirth = yearOfBirth < 1900 ? 2023 : yearOfBirth;
        
        if(yearOfBirth < 1900) {
            this.yearOfBirth = 2023;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        this.yearOfBirth = yearOfBirth;
        if(name.length() > 20) {
            this.name = name.substring(0,20);
            this.brokenName = true;
        } else {
            this.name = name;
            this.brokenName = false;
        }
        if(surname.length() > 20) {
            this.surname = surname.substring(0,20);
            this.brokenSurname = true;
        } else {
            this.surname = surname;
            this.brokenSurname = false;
        }
    }

    public Person(Person p) {
        this.yearOfBirth = p.yearOfBirth;
        this.name = p.name;
        this.surname = p.surname;
        this.brokenName = p.brokenName;
        this.brokenSurname = p.brokenSurname;
    }
    
    public void show(){
        System.out.println("Person " + name + " " + surname + " de " + 
                (2023 - yearOfBirth) + " años.");
    }
    
    public void showExtendido(){
        System.out.println("Person " + name + "(" + brokenName + ") " + surname + "(" + 
                brokenSurname + ") de " + (2023 - yearOfBirth) + " años.");
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Manuel", "Romero");
        p1.showExtendido();
                
    }
    
    public boolean isBroken(){
        return brokenName || brokenSurname;
    }
    
    
    public boolean changeName(String name, String surname){
        
        // 3. Ninguno puede ser broken después del cambio: longitud debe ser como mucho 20.
         if (name.length() > 20 || surname.length() > 20)
             return false;
         // 4. No puede ser ninguno blanco: al menos debe haber una letra del alfabeto inglés.
         if("".equals(name.trim()) || "".equals(surname.trim()))
             return false;
         // 2. Deben tener solo 1 ó 2 palabras: 0 o 1 espacios en blanco que no pueden estar en los extremos. 
         int blancos = 0;
         for(int i=0; i< name.trim().length(); i++) {
             if (name.trim().charAt(i) == ' ')
                 blancos++;
             if(blancos > 1)
                 return false;
         }
         blancos = 0;
         for(int i=0; i< surname.trim().length(); i++) {
             if (surname.trim().charAt(i) == ' ')
                 blancos++;
             if(blancos > 1)
                 return false;
         }
         
         // 1. Usar solo caracteres del alfabeto inglés en mayúsculas.
         for(int i=0; i< name.trim().length(); i++) {
             if (!(name.trim().charAt(i) >= 'A' && name.trim().charAt(i) <= 'Z' || name.trim().charAt(i) == ' '))
                 return false;
         }         
         
         for(int i=0; i< surname.trim().length(); i++) {
             if (!(surname.trim().charAt(i) >= 'A' && surname.trim().charAt(i) <= 'Z' || surname.trim().charAt(i) == ' '))
                 return false;
         }     
         
         this.name = name;
         this.surname = surname;
         return true;
    }
 
}