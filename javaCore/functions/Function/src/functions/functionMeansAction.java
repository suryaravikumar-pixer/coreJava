package functions;
import functions.FindMax;
public class functionMeansAction {
    public static void main(String[] args) {
        // can methos here also main method
        class ClassInsideMainMethod {
            static int Ktm(int bike) {
                return bike;
            }
        }
        System.out.println( FindMax.maxValue(199,245));

        // calling method from inside main
//        if (outdoor==) {
//            System.out.println(ClassInsideMainMethod.Ktm(100));
//        } else {
            //calling method from outside main method
//            Ktm(220);
//        }
    }

    // create method outside main method
    static int Ktm(int bike) {
        System.out.println(" is a rode bike");
        return bike;
    }


}
