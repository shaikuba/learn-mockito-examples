package mockito.learning.example.test;

public final class FinalClassPerson {

    public final void finalSay(String msg) {
        System.out.println(msg);
    }

    public void publicSay(String msg) {
        System.out.println(msg);
    }

    private void privateSay(String msg) {
        System.out.println(msg);
    }
}
