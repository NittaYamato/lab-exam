package csv;

public class Main {
    public static void main(String[] args) {
        var users = new UserCsvReader().readUserCsv("users.csv");
        // TODO Q2.1
        users.stream()
                .filter(u -> u.getCode().startsWith("m"))
                .map(u -> u.getName().toLowerCase())
                .sorted()
                .forEach(System.out::println);
    }
}
