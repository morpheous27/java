public class StaticBlock {

    static{
        code(1);
    }
    static void code(int a){
        System.out.println(a);
    }
    static{
      code(2);
    }

    {
        code(3);
    }

    {
        new StaticBlock();
    }

    StaticBlock(){
        code(6);
    }

    public static void main(String[] args) {

    }


}
