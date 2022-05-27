public class Main {

    public static void main(String[] args) {
        //sum(1, 2, 3);
        Car miCoche = new Car();
        miCoche.addDoors();
        //miCoche.addDoors();
        System.out.println(miCoche.doors);
    }

    public static int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

    class Car {
        public int doors;

        public void addDoors() {
            this.doors++;
        }
    }

