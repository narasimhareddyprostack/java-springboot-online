import java.util.function.Function;
class Demo{
    //Circle c = ()->{}  // custom defined FI
    //Function is predefined FI
    //static Function <Integer, Integer> f = (int n)->{ return n*n}
    static Function <Integer, Integer> f =  n -> n*n;
    public static void main(String[] args){
        System.out.println(f.apply(4));
    }
}