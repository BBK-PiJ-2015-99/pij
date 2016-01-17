//5

import java.util.Random;

class DoublyLinkedList {
    

    private int number;
    private DoublyLinkedList nextDoublyLinkedList;
    private DoublyLinkedList previousDoublyLinkedList;

    public DoublyLinkedList(int initial_number){
        this.number = initial_number;
    }
    public int getValue(){
        return this.number;
    }
    public void setValue(int val){
        this.number = val;
    }
    public DoublyLinkedList getNextDoublyLinkedList(){
        return this.nextDoublyLinkedList;
    }
    public void  setNextDoublyLinkedList(DoublyLinkedList elem){
         this.nextDoublyLinkedList = elem;
    }
    public DoublyLinkedList etPreviousDoublyLinkedList(){
        return this.previousDoublyLinkedList;
    }
    public void setPreviousDoublyLinkedList(DoublyLinkedList elem){
         this.previousDoublyLinkedList = elem;
    }
    public void addElement(DoublyLinkedList elem){
        if (this.getNextDoublyLinkedList() != null){
            DoublyLinkedList nextElement = this.getNextDoublyLinkedList();
            nextElement.addElement(elem);
        } else {
            this.setNextDoublyLinkedList(elem);
        }
    }
    public void showAllElements(){
        System.out.println(this.getValue());
        if (this.getNextDoublyLinkedList() != null){
            DoublyLinkedList nextElement = this.getNextDoublyLinkedList();
            nextElement.showAllElements();
        }
    }
    public static void main(String[] args){
            Random random = new Random();        
            //add 10 elements
            DoublyLinkedList startDoublyLinkedList = new DoublyLinkedList(0);
            System.out.println("Adding elements.");
            for(int i = 1; i<=9; i++){
                //http://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
                //int rand_int = random.nextInt(97) + 1;
                DoublyLinkedList tempElem = new DoublyLinkedList(i); 
                startDoublyLinkedList.addElement(tempElem);
            }
            System.out.println("Printing all elements.");
           startDoublyLinkedList.showAllElements();
    }
}
