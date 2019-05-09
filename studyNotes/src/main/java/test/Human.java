package test;

public class Human implements Runnable {

    private String food;

    public Human(String food) {
        this.food = food;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
