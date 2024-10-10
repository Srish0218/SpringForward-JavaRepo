import java.util.*;
class Sim{
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle){
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public String getCircle() {
        return this.circle;
    }
    public void setCircle(String newCircle) {
        this.circle = newCircle;
    }
    public int getSimId() {
        return this.simId;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    public double getratePerSecond() {
        return this.ratePerSecond;
    }

    public String toString(){
        return simId + " " + customerName + " " + circle + " " + ratePerSecond;
    }

}


public class Problem12_Sim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sim details: ");
        Sim[] sims = new Sim[5];
        for(int i = 0; i < sims.length; i++){
            System.out.println("Enter the sim id: ");
            int simId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter the balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter the rate per second: ");
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter the circle: ");
            String circle = sc.nextLine();

            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }
        System.out.println("Enter old circle: ");
        String oldCircle = sc.nextLine();
        System.out.print("Enter new circle: ");
        String newCircle = sc.nextLine();

        List<Sim> result = transferCustomerCircle(sims, oldCircle, newCircle);
        for (Sim sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getratePerSecond());
        }
        System.out.println();

        System.out.println(result);

        sc.close();



    }
    public static List<Sim> transferCustomerCircle(Sim[] sims , String oldCircle , String newCircle ){
        List<Sim> result = new ArrayList<>();
        for (Sim sim : sims){
            if(sim.getCircle().equals(oldCircle)){
                sim.setCircle(newCircle);
                result.add(sim);
            }
        }
        result.sort((s1 , s2) -> Double.compare(s2.getratePerSecond() , s1.getratePerSecond()));
        return result;
    }
}
