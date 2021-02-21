import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        start("MyTests");
    }

    public static void start(Class classType){
        int beforeSuiteCount = 0;
        int afterSuiteCount = 0;
        Method beforeSuiteMethod = null;
        Method afterSuiteMethod = null;

        Method[] methods = classType.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteCount++;
                beforeSuiteMethod = method;
            }

            if (method.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteCount++;
                afterSuiteMethod = method;
            }
        }
        if (beforeSuiteCount != 1) throw new RuntimeException("Недопустимое количество методов с аннотацией beforeSuite!");
        if (afterSuiteCount != 1) throw new RuntimeException("Недопустимое количество методов с аннотацией afterSuite!");

        try {
            beforeSuiteMethod.invoke(new MyTests());
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < 11; i++) {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class) && method.getAnnotation(Test.class).priority() == i) {

                        try {
                            method.invoke(new MyTests());
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }

                }
            }
        }


        try {
            afterSuiteMethod.invoke(new MyTests());
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    public static void start(String className){
        try {
            start(Class.forName(className));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
