package ua.cpu.lw7;

public class SeventhTask {

    public static void main(String[] args) {
        new Thread(new DistanceCalculator()).start();
    }

}
