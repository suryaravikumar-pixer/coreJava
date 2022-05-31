package functions;

public class MethodOverloading {

    static void methodOverloading(int wage){
        System.out.println(wage);
    }
  static void methodOverloading(float wage){
        System.out.println(wage);
    }
   static void methodOverloading(int wage, String perk){
        System.out.println(wage + " "+ perk);
    }

    public static void main(String[] args) {
        // calling a person for a work
        float daywage = 300.50f;
        methodOverloading(70.23f);
//        methodOverloading(daywage);

        methodOverloading(800);
        methodOverloading(500,"bottle of whisky");
    }
}

