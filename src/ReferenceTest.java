public class ReferenceTest {
    public static void main(String[] args) {
        //int test
        System.out.println("INT TEST");
        int a = 4;
        System.out.println("Before: " + a);
        changeInt(a);
        System.out.println("After:  " + a);

        //object test
        System.out.println("\nOBJECT TEST");
        MyObject myObject1 = new MyObject(1, 2);
        System.out.println("Before: " + myObject1.getHeight() + "x" + myObject1.getWidth());
        changeObject(myObject1);
        System.out.println("After:  " + myObject1.getHeight() + "x" + myObject1.getWidth());

        //new object test
        System.out.println("\nNEW OBJECT TEST");
        MyObject myObject2 = new MyObject(1, 2);
        System.out.println("Before: " + myObject2.getHeight() + "x" + myObject2.getWidth());
        newObject(myObject2);
        System.out.println("After:  " + myObject2.getHeight() + "x" + myObject2.getWidth());
    }

    private static void changeInt(int x) {
        x = 6;
    }

    private static void changeObject(MyObject object) {
        object.setHeight(3);
        object.setWidth(4);
    }

    private static void newObject(MyObject object) {
        object = new MyObject();
        object.setHeight(3);
        object.setWidth(4);
    }
}
