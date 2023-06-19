package JavaJobs;

public class Student implements Observer {
    private String name;
    private JobAgency jobAgency;

    public Student(String name, JobAgency jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    @Override
    public void update(Object arg) {
        if (arg instanceof Vacancy) {
            Vacancy vacancy = (Vacancy) arg;
            // Обработка новой вакансии
            System.out.println("Студент " + name + " получил уведомление о новой вакансии:");
            System.out.println("Название: " + vacancy.getTitle());
            System.out.println("Требования: " + vacancy.getRequirements());
        } else if (arg instanceof Company) {
            Company company = (Company) arg;
            // Обработка запроса на сотрудника от компании
            System.out.println("Студент " + name + " получил запрос на сотрудника от компании " + company.getName());
            System.out.println("Зарплата: " + company.getSalary());
        }
    }
}

