package day31_CustomClasses_Constructor.ScrumTask;
import java.text.DecimalFormat;
public class MyScrumTeam {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$###,###.00");

        Tester tester1 = new Tester("Cassandra", 1817, "SDET", 125_000);
        Tester tester2 = new Tester("Yuliya", 1615, "SDET II", 130_000);
        Tester tester3 = new Tester("Sinem", 1319, "SENIOR SDET", 145_000);
        Tester tester4 = new Tester("Neira", 1925, "SDET", 126_000);

        Tester[] testers = {tester2, tester3, tester4};

        Developer developer1 = new Developer("Olga", 1223,"Java Developer", 125_000);
        Developer developer2 = new Developer("Aygun", 1338,"Java Master", 185_000);
        Developer developer3 = new Developer("Tunc", 1228,"Software Developer", 135_000);
        Developer developer4 = new Developer("Aliya", 1827,"Software Engineer", 145_000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Hulya", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);

        System.out.println("----------------------------------");
        for(Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name + " : "+ df.format(eachTester.salary));
        }
        System.out.println("----------------------------------");
        for(Developer eachDeveloper : scrum.devopsList){
            System.out.println(eachDeveloper.name + " : "+ df.format(eachDeveloper.salary));
        }
        System.out.println("----------------------------------");
        scrum.removeTester(1925);
        scrum.removeDeveloper(1338);
        System.out.println(scrum);
    }
}
/*create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team*/