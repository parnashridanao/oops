class Person{
    Person(){
        System.out.println("This is person's class constructor.");
    }
   void PrintName(){
    System.out.println("Programmer");
   }
   class Programmer extends Person{
    Programmer(){
        System.out.println("This is programmers class constructor");
    } 
     void PrintCodingLnguage(){
        System.out.println("JAVA");
     }
    }
     class Programm extends Programmer{
        Programm(){
            System.out.println("This is programm class constant");
        }
        void PrintLineOfCode(){
            System.out.println(20);
        }
    }
        public static void main(String[] args) {
            Program program= new Program();
            program.PrintName();
            program.PrintCodingLnguage();
            program.PrintLineOfCode();
        }
}



