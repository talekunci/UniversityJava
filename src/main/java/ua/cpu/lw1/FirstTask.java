package ua.cpu.lw1;

public class FirstTask {

//    The first task
    public static void main(String[] args) {
        byte time = 11, speed = 37;

        int distance = time * speed;

        System.out.printf("time = %d,%n" +
                        "speed = %d,%n" +
                        "distance = %d%n",
                time,
                speed,
                distance
        );

    }

}
