package pro;
class prey{
    void hunt(){
        System.out.println("the prey is hunting");
    };
}
class hawk extends prey{
    void eat(){
        System.out.println("the hawk hunts and eats its prey");
    }
}
public class index {
    public static void main(String args[]){
        hawk eeagle = new hawk();
        eeagle.hunt();
        eeagle.eat();
    }
}
