package recursividade;

public class Recursividade {
    static void loop(int i) {
        i++;
        System.out.println(i);
        loop(i);
    }

    public static void main(String[] args) {
        int i = 0;
        loop(i);
    }
    
}
