
public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"Январь","Март"};
     HomeDog Charli = new HomeDog("Сибирский хаски", 15, 15., "Charli", 15, "white", a);
     System.out.println(Charli);
     HunterDog Bobic = new HunterDog("Сибирский хаски", 16, 15., "Bobic", 15, 18., "Кролик");
     System.out.println(Bobic);
  
     System.out.println(Bobic.compare(Charli, Bobic));

     
     
     Charli.ShowEat();
     Charli.ShowRun();
     Charli.ShowSwim();
     
     Bobic.ShowHunt();
     Bobic.ShowRun();
     Bobic.ShowSwim();
	}

}
