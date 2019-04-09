import java.lang.reflect.Field;

public class ReflectionAPI {

    public static void main(String[] args) {

        //Getting information about variables via Reflection API
        //getDeclaredFields() - returns all variable in a class
        Class<ClassExample> exampleClass = ClassExample.class;
        Field[] declaredFields = exampleClass.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }

        //getDeclaredField() - returns variable of specific name
        try {
            Field classNameField = exampleClass.getDeclaredField("className");
            System.out.println(classNameField);
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }

        //getFields - returns ONLY public variables
        Field[] field  = exampleClass.getFields();
        for(Field f: field){
            System.out.println(f);
        }
        //getField - returns ONLY public variable of specific name
        try {
            Field someField = exampleClass.getField("classCode");
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }

}
