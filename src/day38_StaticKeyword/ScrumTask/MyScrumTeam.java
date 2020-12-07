package day38_StaticKeyword.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();

        developer1.setInfo("Bektemir", "K-01", "Full stack Developer", "Amazon", 160000, 'M');
        developer2.setInfo("Nikola", "Y-821", "Software Developer", "Windows", 155000, 'M');
        developer3.setInfo("Meredith", "T-234", "Full stack Developer", "Apple", 140000, 'F');
        developer4.setInfo("Ian", "L-02", "Developer", "CVS Pharmacy", 135000, 'M');


        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan","0005","Tester",98000,'M');
        tester2.setInfo("Dean","0006","Tester",98500,'M');
        tester3.setInfo("Jair","0007","Tester",99000,'M');

        Tester[] testers= {tester1, tester2, tester3};
        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);

        for(Developer each   : scrum1.developersTeam ){
            System.out.println(each);
        }

        for(Tester each  : scrum1.testersTeam ){
            System.out.println(each);
        }

        System.out.println("==================================");

        Tester tester4 = new Tester();
        Tester tester5 = new Tester();
        tester4.setInfo("Asuman","GR-24","SDET", 170000,'F');
        tester5.setInfo("Ercan","GR-24","SDET",170000,'M');

        Developer developer5 = new Developer();
        Developer developer6 = new Developer();
        developer5.setInfo("ALtynai","GR-24","Full-Stack Developer","Javaholics", 180000,'F');
        developer6.setInfo("Shardae","GR-24","Full-Stack Developer","Javaholics", 170000,'F');

        ScrumTeam scrum2 = new ScrumTeam();
        System.out.println(scrum2);





    }







}
