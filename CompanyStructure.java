package companyStructure;

public class CompanyStructure {

	public static void main(String[] args) {
		TechnicalLead CTO = new TechnicalLead("Satya Nadella");
		SoftwareEngineer seA = new SoftwareEngineer("Kasey");
		SoftwareEngineer seB = new SoftwareEngineer("Breana");
		SoftwareEngineer seC = new SoftwareEngineer("Eric");
		CTO.addReport(seA);
		CTO.addReport(seB);
		CTO.addReport(seC);
		System.out.println(CTO.getTeamStatus());
		TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
		SoftwareEngineer seD = new SoftwareEngineer("Winter");
		SoftwareEngineer seE = new SoftwareEngineer("Libby");
		SoftwareEngineer seF = new SoftwareEngineer("Gizan");
		SoftwareEngineer seG = new SoftwareEngineer("Zaynah");
		
		VPofENG.addReport(seD);
		VPofENG.addReport(seE);
		VPofENG.addReport(seF);
		VPofENG.addReport(seG);
		System.out.println(VPofENG.getTeamStatus());
		
		BusinessLead CFO = new BusinessLead("Amy Hood");
		Accountant actA = new Accountant("Niky");
		Accountant actB = new Accountant("Andrew");
		CFO.addReport(actA, CTO);
		CFO.addReport(actB, VPofENG);
		System.out.println(CFO.getTeamStatus());
		
		System.out.println(seB.toString() + "'s manager is " + seB.getManager().toString());
        System.out.println(seF.toString() + "'s manager is " + seF.getManager().toString());
        System.out.println(actB.toString() + "'s manager is " + actB.getManager().toString());
        System.out.println();

        System.out.println("Testing BusinessLead approvedBonus()");
        System.out.print(seA.getManager() + " is asking for $15,000 bonus for "+seA.getName()+", (the Approval result should be TRUE): ");
        System.out.println(CTO.requestBonus(seA, 10000));
        System.out.println("Updated budget is: "+seA.getManager().getAccountantSupport().getBonusBudget()+"\n");

        System.out.print(seF.getManager() + " is asking for $8,000 bonus for "+seF.getName() +", (the Approval result should be TRUE): ");
        System.out.println(VPofENG.requestBonus(seF, 5000));
        System.out.println("Updated budget is: "+seF.getManager().getAccountantSupport().getBonusBudget()+"\n");

        System.out.print(seF.getManager() + " is asking for $350,000 bonus  for "+seF.getName()+", (the Approval result should be FALSE): ");
        System.out.println(VPofENG.requestBonus(seF, 400000));
        System.out.println("Updated budget is: "+seF.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.println();
		
	}

}
