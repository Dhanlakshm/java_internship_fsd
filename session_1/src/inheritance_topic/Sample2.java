package inheritance_topic;

//Parent-1
interface Cse_Dept{
    void cse_subject();
}
//Parent-2
interface Ece_Dept{
    void ece_subject();
}
//child class
class Child implements Cse_Dept, Ece_Dept{

    @Override
    public void cse_subject() {
        System.out.println("from CSE_Dept--PArent-1");
    }

    @Override
    public void ece_subject() {
        System.out.println("from ECE_Dept--PArent-2");
    }
}
public class Sample2 {
    public static void main(String[] args) {
       Child c=new Child();
       c.cse_subject();
       c.ece_subject();
    }
}
