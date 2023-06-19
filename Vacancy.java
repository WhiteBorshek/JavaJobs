package JavaJobs;

public class Vacancy {
    private String title;
    private String requirements;

    public Vacancy(String title, String requirements) {
        this.title = title;
        this.requirements = requirements;
    }

    public String getTitle() {
        return title;
    }

    public String getRequirements() {
        return requirements;
    }
}

