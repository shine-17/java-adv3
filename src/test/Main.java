package test;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("test");
        Member member2 = new Member("test");

        boolean equals = member1.equals(member2);
        System.out.println(equals);
    }
}
