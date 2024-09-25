import java.util.Arrays;

class SinglyLinkedListNode<E>{
    public E data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(E data){
        this.data = data;
        this.next = null;
    }
}


class SinglyLinkedList{
    public static SinglyLinkedListNode<Integer> getLinkedList(int[] arr){
        // 関数を完成させてください   
        SinglyLinkedListNode numList = new SinglyLinkedListNode(arr[0]);
        SinglyLinkedListNode currentNode = numList;

        for(int i = 1; i < arr.length; i++){
            currentNode.next = new SinglyLinkedListNode(arr[i]);
            currentNode = currentNode.next;
        }

        return numList;
    }
}