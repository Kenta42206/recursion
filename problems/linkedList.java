class Item{
    public int data;
    public Item next;

    public Item(int data){
        this.data = data;
    }
}

class SinglyLinkedList{
    public Item head;

    public SinglyLinkedList(Item head){
        this.head = head;
    }

}


class MyClass{
    public static void main(String[] args){
        Item item1 = new Item(7);
        Item item2 = new Item(99);
        Item item3 = new Item(45);

        SinglyLinkedList numList = new SinglyLinkedList(item1);

        item1.next = item2;
        item2.next = item3;

        Item currentItem = numList.head;
        while(currentItem != null){
            System.out.println(currentItem.data);
            currentItem = currentItem.next;
        }

    }
}
