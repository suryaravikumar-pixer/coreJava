package functions;

public class functionMeansAction {
    public static void main(String[] args) {
        // can methos here also main method
        class ClassInsideMainMethod{
            static String Ktm(String car){return car;}

        }
        // calling method from inside main
        if(condition){
            System.out.println(ClassInsideMainMethod.Ktm("for stunts inside indoor stadium"));
        }
        else {
            //calling method from outside main method
            Ktm();
        }
    }

    // create method outside main method
    static void Ktm(){
        System.out.println(CurrentMethodName+" is a rode bike");
    }


}
