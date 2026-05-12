//https://www.codewars.com/kata/547274e24481cfc469000416/train/java
    public  class God {
    public static Human[] create() {
        return new Human[]{
                new Man("Adam"),
                new Woman("Eva")
        };
    }

    public class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }
    }

    class Man extends Human {

        public Man(String name) {
            super(name);
        }

    }

    class Woman extends Human {
        public Woman(String name) {
            super(name);
        }

    }


    public static void main(String[] args) {
        Human[] paradise = God.create();
        boolean adam = paradise[0] instanceof Man;
        boolean eva = paradise[1] instanceof Woman;
        System.out.println(adam);
        System.out.println(eva);

    }
}
