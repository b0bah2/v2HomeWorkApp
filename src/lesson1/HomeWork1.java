package lesson1;

public class HomeWork1 {

    public static void main(String[] args) {

        Team[] teams = {
                new Team("Команда 1", 4),
                new Team("Команда 2",8),
                new Team("Команда 3", 10),
                new Team("Команда 4",15),
        };

        Course [] courses = {
                new Course("Препятствие первое", 3),
                new Course("Препятствие второе", 5),
                new Course("Препятствие третье", 7),
        };

        for(Team team : teams){
            for(Course course : courses){
                team.doIt(course);
                }

        }
        for(Team team : teams) {
            team.showTeams();
        }
    }
}
