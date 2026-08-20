package Interfaces;


//interface to class --> implemens
//interface to interface --> extends
//class to class ---> extends
//overrinding -- multiple methods same name but differe in paramtere(number, types, order)
interface Jain_clg{
    //abstract methods(methods without body)
    void cse_dept();
    void ece_Dept();
      default  void aiml_Dept(){
          System.out.println("aiml dept");
        }
}
interface jain_mba_clg extends Jain_clg{
    void branch1();
}


class Branches implements Jain_clg, jain_mba_clg{

    @Override
    public void cse_dept() {
        System.out.println("cse dept");
    }

    @Override
    public void ece_Dept() {
        System.out.println("ece dept");
    }

    @Override
    public void aiml_Dept() {
        System.out.println("aiml dept");
    }

    @Override
    public void branch1() {
        System.out.println("from mba clg");
    }
}
public class Main2 {
        public static void main(String[] args) {
//            Jain_clg j1=new Jain_clg(); // you cannot create object for interfaces
            Branches b1=new Branches();
            b1.aiml_Dept();
            b1.cse_dept();
            b1.ece_Dept();
        }
}
