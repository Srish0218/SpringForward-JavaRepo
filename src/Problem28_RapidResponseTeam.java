//Create the class RRT(Rapid response team) with the below attributes:
//
//ticketNo-int
//
//raisedBy-String
//
//assignedTo-String
//
//priority-int
//
//project-String
//
//
//
//All attributes should be private,write getters and setters and
//
//parameterized constructor as required.
//
//
//
//Create class MyClass with main method.
//
//
//
//Implement a static method-getHighestPriorityTicket in MyClass class.
//
//
//
//getHighestPriorityTicket method:
//
//This method will take an array of RRT objects ,and a String value as parameters.This method will return the RRT object with highest priority
//ticket from the array of the RRT objects for the given project(String parameter passed).Highest priority is the one which has lesser value.
//
//for example:1 is considered as high priority and 5 is considered as low priority.
//
//If no RRT with the above condition is present in the array of the RRT objects,then the method should return null.
//
//The main method should print the ticketNo,raisedBy and assignedTo from returned object if the returned object is not null.if the returned object is null then main method should print "No such Ticket".
//
//
//
//
//
//input1:
//        ----------------------
//        123
//Velantish
//        Mani
//3
//Xperience
//234
//Sathish
//        Akshaya
//1
//AIG
//345
//John
//        Jack
//2
//AIG
//456
//Bhuvi
//        Jack
//5
//AIG
//        AIG
//
//
//output1:
//        ------------------
//        234
//Sathish
//        Akshaya
//
//**************
//
//Input2:
//        --------------
//        123
//Velantish
//        Mani
//3
//Xperience
//234
//Sathish
//        Akshaya
//1
//AIG
//345
//John
//        Jack
//2
//AIG
//456
//Bhuvi
//        Jack
//5
//AIG
//        Xplore
//
//
//output2:
//        --------------
//No such ticket.

import java.util.*;

class RapidResponseTeam{
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    public RapidResponseTeam(int ticketNo, String raisedBy, String assignedTo, int priority, String project){
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public String getProject() {
        return this.project;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public String toString() {
        return ticketNo + "\n" + raisedBy + "\n" + assignedTo;
    }

}

public class Problem28_RapidResponseTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ticket details: ");
        RapidResponseTeam[] tickets = new RapidResponseTeam[4];
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Enter ticket no: ");
            int ticketNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter raised by: ");
            String raisedBy = sc.nextLine();
            System.out.println("Enter assigned to: ");
            String assignedTo = sc.nextLine();
            System.out.println("Enter priority: ");
            int priority = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter project: ");
            String project = sc.nextLine();

            tickets[i] = new RapidResponseTeam(ticketNo , raisedBy , assignedTo , priority , project);
        }

        System.out.println("Enter project parameter: ");
        String projectParameter = sc.nextLine();

        RapidResponseTeam teamWithHighestPriorityTicket = getHighestPriorityTicket(tickets , projectParameter);
        System.out.println(teamWithHighestPriorityTicket == null ? "No such Ticket" : teamWithHighestPriorityTicket);

    }

    public static RapidResponseTeam getHighestPriorityTicket(RapidResponseTeam[] tickets, String projectParameter){
        List<RapidResponseTeam> ticketProject = new ArrayList<>();
        for (RapidResponseTeam ticket : tickets) {
            if(ticket.getProject().equalsIgnoreCase(projectParameter)){
                ticketProject.add(ticket);
            }
        }
        if(ticketProject.size() == 0){
            return null;
        }
        ticketProject.sort((s1 , s2) -> Integer.compare(s1.getPriority() , s2.getPriority()));
        return ticketProject.getFirst();

    }
}
