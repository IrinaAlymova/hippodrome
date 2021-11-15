package game;

import java.util.ArrayList;
import java.util.List;
//import external_package.ExternalClass;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move() {
        //ExternalClass.printLine();
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = getHorses().get(0);
        for(Horse horse : getHorses()) {
            if (horse.getDistance() > winner.getDistance()) {
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.printf("Winner is %s!%n", getWinner().getName());
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                System.out.println("The run was interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse(args[0], 3, 0));
        horses.add(new Horse(args[1], 3, 0));
        horses.add(new Horse(args[2], 3, 0));

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
