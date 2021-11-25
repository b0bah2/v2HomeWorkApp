package lesson1;

public class Team {
    String nameTeam;
    int power;

    Team (String nameTeam, int power){
        this.nameTeam = nameTeam;
        this.power = power;
    }

    public void doIt(Course course){
        if(power >= course.let) {
            power = power - course.let;
            showResults();
            course.showLet();
        }
    }

    public void showResults(){
        System.out.print(nameTeam + " прошел ");
    }

    public void showTeams(){
        System.out.println(nameTeam);
    }

}
