package enumStudy;

public class AnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // ���ؽ�Ʈ �����̳ʸ� �ʱ�ȭ �մϴ�.
        MyContextContainer demo = new MyContextContainer();

        // MyOjbect ��ü�� �ϳ� �޾ƿɴϴ�.
        MyObject obj = demo.get(MyObject.class);

        System.out.println(obj.getName()); // print is "My name is JDM."
        System.out.println(obj.getDefaultValue()); // print is "This is StringInjector."
        System.out.println(obj.getInvalidType()); // print is "null".
    }
}