package JavaJobs;

public class Main {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();

        Student student1 = new Student("Борис", jobAgency);
        Student student2 = new Student("Сергей", jobAgency);
        Student student3 = new Student("Виталий", jobAgency);

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(student3);

        for (int i = 0; i < 5; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

        geekBrains.publishVacancy("Java Developer", "Experience with Java, Spring framework");
        google.publishVacancy("Software Engineer", "Strong programming skills in C++ or Python");
        yandex.publishVacancy("Data Scientist", "Deep understanding of machine learning algorithms");
    }
}

