package interviewqueueing;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewQueue {
    Queue<Integer> hall = new LinkedList<>();
    Queue<Integer> room = new LinkedList<>();
    int totalAttendees = 5;
    void fillHall(){
        for(int i=1;i<=totalAttendees;i++){
            hall.add(i);
        }
    }
    void fillRoom(){
        for(int i=1;i<=3;i++){
            room.add(hall.poll());
        }
    }
    void interviewProcess(){
        Scanner sc = new Scanner(System.in);
        int presentCandidate =0;
        InterviewQueue interviewQueue = new InterviewQueue();
        interviewQueue.fillHall();
        interviewQueue.fillRoom();
        boolean isCandidatePresent = false;
        while(presentCandidate<=totalAttendees){
            System.out.println("Options : \n1.View Attendees in waiting hall. \n2.View Attendees in waiting room. \n3.Call a attendee. \n4.Remove a attendee.");
            System.out.println("Enter any option : ");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println(interviewQueue.hall);
                    break;
                case 2:
                    System.out.println(interviewQueue.room);
                    break;
                case 3:
                    if(isCandidatePresent == false){
                        isCandidatePresent = true;
                        presentCandidate++;
                        int temp = interviewQueue.room.poll();
                        System.out.println("Candidate "+temp+" is in interview room.");
                        interviewQueue.room.add(interviewQueue.hall.poll());
                    }else{
                        System.out.println("Someone is in interview room. To dequeue the candidate, choose option 4.");
                    }
                    break;
                case 4:
                    if(isCandidatePresent == true){
                        System.out.println("Interview finished for candidate "+presentCandidate+".");
                        isCandidatePresent = false;

                    }else{
                        System.out.println("There is no Attendee in the room.");
                    }
                    break;
                default:
                    System.out.println("Invalid option.");       
            }
        }
        System.out.println("Interview ends..");
        sc.close();
    }
    public static void main(String[] args) {
        InterviewQueue interviewQueue = new InterviewQueue();
        interviewQueue.interviewProcess();
    }
}
