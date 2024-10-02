package LLDElevatorDesign;


import java.util.PriorityQueue;

public  class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){

        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);

    }
     public void submitExternalRequest(int floor, Direction direction){

        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
     }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        while(true) {

            if(elevatorCar.elevatorDirection == Direction.UP){

                   //Here we can implement LOOK algorithm. If the elevator is going up, it will take request from
                //minPriorityQueue and while going up if a request comes from a floor which elevator has passed
                // it will push that incoming request in a pendingQueue. When the Elevator reaches End and change the direction then, it will
                // first take the requests from pendingQueue and push all of them in minPriorityQueueForUp.
            }

            else if (elevatorCar.elevatorDirection == Direction.DOWN){
                //It will happen in the same way and while going DOWN, elevator car will only
                //serve requests from maxPriorityQueueDown and suppose a request came from floor
                //which it crossed past, that request will be put into pendingQueue. Now when the elevatorCar reaches 0th floor
                //and changes the direction then it will take all the requests from the pendingQueue and put into
                //the maxPriorityQueueDown.
            }
        }
    }
}
