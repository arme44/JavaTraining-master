package training.core.annotation;

@Information(author = "Awesome programmer", date = "2015-09-09", description = "Base class")

public class Soldier {
    @Information(author = "Awesome programmer", date = "2015-09-09", description = "Actual grade")

    private String grade;
    private String devision;
    private String name;

    @Deprecated
    @SuppressWarnings(value = "uncheced")
    public Soldier(String grade, String devision, String name) {
        this.grade = grade;
        this.devision = devision;
        this.name = name;
    }

    @Information(author = "Good writer", date = "2017-12-15", description = "Added as need")
    public Soldier() {
        grade = "privitr";
        devision = "NN";
        name = "NN";
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDevision() {
        return devision;
    }

    @Information(author = "Good writer", date = "2017-12-15", description = "Added as need")

    public void setDevision(String devision) {
        this.devision = devision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void attack() {
        System.out.println("ATTACK !!!!");
    }

    public void confirmOrder(String order) {

        System.out.println("ROGER " + order);
    }
}
