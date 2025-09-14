package pro;
class prey{
    void hunt(){
        System.out.println("the prey hunts different animals");
    }
}
class hawk extends prey{
    @Override
    void hunt(){
        System.out.println("hawk also hunts and eats its pray");
    }
}
class lion extends prey{
    @Override
    void hunt(){
        System.out.println("lion also hunts and eats its pray");
    }
}
public class poly {
    public static void main(String args[]){
        prey p;

        p = new hawk();
        p.hunt();
        p = new lion();
        p.hunt();
    }
}
