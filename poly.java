package pro;

public class poly {
    static class prey {
        void hunt() {
            System.out.println("the prey hunts different animals");
        }
    }

    static class hawk extends prey {
        @Override
        void hunt() {
            System.out.println("hawk also hunts and eats its prey");
        }
    }

    static class lion extends prey {
        @Override
        void hunt() {
            System.out.println("lion also hunts and eats its prey");
        }
    }

    public static void main(String[] args) {
        prey p1 = new hawk();
        p1.hunt();

        prey p2 = new lion();
        p2.hunt();
    }
}
