import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dummy dummy = new Dummy();
        Dummy d2 = (Dummy) dummy.clone();
        System.out.println(d2.list);
    }
}

class Dummy implements Cloneable{
    int i=0;
    List<String> list = new ArrayList<>(Arrays.asList("a","b"));

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class AccessSpecifierAccessTest{
    public static void main(String[] args) {
        AccessSpecifierTest accessSpecifierTest = new AccessSpecifierTest();
        accessSpecifierTest.test();

    }
}
class AccessSpecifierTest{
    protected void test(){
        System.out.println("nice");
    }
}
