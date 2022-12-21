public class Aktiviti {
    public static void main(String[] args) {
        int w = 1, y =1, z = 1;
        int a = w++;
        int b = ++w;
        int c = y--;
        int d = --z;

        System.out.println("Post Increment a = "+a+" w ="+w);
        System.out.println("Pre increment b = "+b+" w ="+w);
        System.out.println("Post Increment c = "+c+" y ="+y);
        System.out.println("Pre increment d = "+d+" z ="+z);




    }
    
}
