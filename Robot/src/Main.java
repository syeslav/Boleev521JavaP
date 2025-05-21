public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.getDirection()); // UP

        robot.turnRight();
        System.out.println(robot.getDirection()); // RIGHT

        robot.stepForward();
        System.out.println(robot.getX()); // 1
        System.out.println(robot.getY()); // 0

        robot.turnLeft();
        robot.stepForward();
        System.out.println(robot.getX()); // 1
        System.out.println(robot.getY()); // 1
    }
}