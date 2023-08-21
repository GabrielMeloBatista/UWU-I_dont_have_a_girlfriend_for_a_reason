import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflexao {
    public static Class<?> getClass(String className) {
        Class<?> cls;
        try {
            cls = Class.forName(className);

            return cls;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     *
     * */
    public static void printAttributes(Class<?> cls) {
        try {

            System.out.println("Attributes");
            Field fieldList[] = cls.getDeclaredFields();
            Field superFieldList[] = cls.getSuperclass().getDeclaredFields();

            for (Field fld : fieldList) {
                System.out.println("Attribute: " + fld.getName());
            }

            for (Field fld : superFieldList) {
                System.out.println("Attribute: " + fld.getName());
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void printMethods(Class<?> cls) {
//        Method methodList[] = cls.getDeclaredMethods();
//        Method superMethodList[] = cls.getSuperclass().getDeclaredMethods();

        System.out.println("Methods");

        Method[] methodList = getMethods(cls);
        for (Method fld : methodList) {
            System.out.println("Method: " + fld.toString());
        }

//        for (Method fld : superMethodList) {
//            System.out.println("Method: " + fld.toString());
//        }
    }

    public static Method[] getMethods(Class<?> cls) {
        Method[] methodList = cls.getDeclaredMethods();
        Method[] superMethodList = cls.getSuperclass().getDeclaredMethods();
        ArrayList<Method> methodArrayList = new ArrayList<>(List.of(methodList));
        methodArrayList.addAll(List.of(superMethodList));

        return methodArrayList.toArray(new Method[0]);
    }
}
