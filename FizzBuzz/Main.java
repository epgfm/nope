class Main {

    static boolean fizz() {
        System.out.print("Fizz ");
        return true;
    }

    static boolean buzz() {
        System.out.print("Buzz ");
        return true;
    }

    static boolean fizzbuzz() {
        System.out.print("FizzBuzz ");
        return true;
    }

    static boolean echo(int i) {
        System.out.print(i + " ");
        return true;
    }

    static void brainfuck(boolean dump) {}

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            brainfuck(
                i % 3 == 0 && i % 5 == 0 && fizzbuzz() ||
                              i % 3 == 0 &&     fizz() ||
                              i % 5 == 0 &&     buzz() ||
                                                echo(i)
            );
        }

    }

}