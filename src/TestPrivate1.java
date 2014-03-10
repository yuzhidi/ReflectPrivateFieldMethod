import java.lang.reflect.Field;

public class TestPrivate1 {
    public static void main(String[] args) throws Exception {
        Private1 p = new Private1();

        Class<?> classType = p.getClass();

        // getDeclaredField与getField的差异同getDeclaredMethod与getMethod
        Field field = classType.getDeclaredField("name");

        field.setAccessible(true);// 压制Java对访问修饰符的检查

        field.set(p, "lisi");

        System.out.println(p.getName());
    }
}