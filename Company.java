package JavaJobs;

public class Company {
    private String name;
    private int salary;
    private JobAgency jobAgency;

    public Company(String name, int salary, JobAgency jobAgency) {
        this.name = name;
        this.salary = salary;
        this.jobAgency = jobAgency;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void needEmployee() {

        // Уведомление jobAgency о необходимости сотрудника
        jobAgency.notifyObservers(this);
    }

    public void publishVacancy(String title, String requirements) {
        Vacancy vacancy = new Vacancy(title, requirements);
        jobAgency.notifyObservers(vacancy);
    }
}


