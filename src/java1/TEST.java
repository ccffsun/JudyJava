package java1;

public class TEST {
    public void dog() throws Exception {
        cat();
    }
    public void cat() throws Exception {
        bird();
    }
    public void bird() throws Exception {
        int i = 1/0;
        System.out.println("woof woof");

    }
}
