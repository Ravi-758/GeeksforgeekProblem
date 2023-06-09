class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

Link:-https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=submissions
