import java.util.*;

class Medicine{
    private String medicineNme;
    private String batchNo;
    private String disease;
    private int price;

    public Medicine(String medicineNme , String batchNo , String disease , int price){
        this.medicineNme = medicineNme;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;

    }
    public String getDisease() {
        return this.disease;
    }
    public int getPrice() {
        return this.price;
    }
}

public class Problem9_Medicine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] medicine = new Medicine[4];
        for(int i = 0 ; i < medicine.length ; i++){
            System.out.println("Enter name of Medicine "+(i+1));
            String MedicineNme = sc.nextLine();
            System.out.println("Enter Batch No of "+ (i+1));
            String BatchNo = sc.nextLine();
            System.out.println("Enter disease cured by medicine " + MedicineNme);
            String disease = sc.nextLine();
            System.out.println("Enter price of Medicine "+(i+1) + " " + MedicineNme);
            int price = sc.nextInt();
            sc.nextLine();
            medicine[i] = new Medicine(MedicineNme , BatchNo , disease , price);
        }
        System.out.println("Enter disease to search medicine price for...");
        String DieseaseToSearch = sc.nextLine();
        List<Integer> result = medicinePriceForGivenDisease(medicine , DieseaseToSearch);
        System.out.println("Price for medicine related to disease " + DieseaseToSearch);
        for(int price : result){
            System.out.println(price);
        }

    }
    public static List<Integer> medicinePriceForGivenDisease(Medicine[] medicine , String dis){
        List<Integer> prices = new ArrayList<>();
        for(Medicine m : medicine){
            if(m.getDisease().equals(dis))
                prices.add(m.getPrice());
        }
        Collections.sort(prices);
        return prices;
    }
}
