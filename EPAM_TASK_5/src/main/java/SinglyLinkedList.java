public class SinglyLinkedList<T> {

        private  Node<T> headNode = null;

        private static int size=0;

    public void insert(T data){
        //creates a new Node
        Node<T> newNode = new Node<>(data);

        if(headNode==null){
            headNode = newNode;
        }else{
            Node<T> temporaryNodeHolder = headNode;
            while(temporaryNodeHolder.next!=null){
                temporaryNodeHolder = temporaryNodeHolder.next;
            }
            temporaryNodeHolder.next = newNode;
        }
        size++;
    }

    /*
     * The Element specified is stored at the index specified.
     * if the index is greater than or equal to the size of the list.
     * ArrayIndexOutOfBoundsException is thrown.
     */

    public void insert(int index, T data) throws ArrayIndexOutOfBoundsException{
          if(index >= size)
              throw new ArrayIndexOutOfBoundsException("index is "+index+" size is "+size);

            Node<T> temporaryNodeHolder = headNode;

            int cursor = 0;
            while(cursor!=index){
                temporaryNodeHolder = temporaryNodeHolder.next;
                cursor++;
            }

            temporaryNodeHolder.data = data;
    }

    /*
     *   remove method removes the value associated with the given index in the list
     *   if the list is empty or if the index is greater than or equal to the
     *   size of the list. ArrayIndexOutOfBoundsException is thrown.
     */

    public void remove(int index){

        if(index >= size)
            throw new ArrayIndexOutOfBoundsException("index is "+index+"size is "+size);
        if(index < 0)
            throw new ArrayIndexOutOfBoundsException("index is less than 0");

        Node<T> temporaryNodeHolder = headNode;

        int cursor = 1;
        while(cursor!=index){
            temporaryNodeHolder = temporaryNodeHolder.next;
            cursor++;
        }
        temporaryNodeHolder.next = temporaryNodeHolder.next.next;

        size--;
    }
    /*
        *   getElementAt returns the value of the element at a given index
        *   if the list is empty or if the index is greater than or equal to the
        *   size of the list. ArrayIndexOutOfBoundsException is thrown.
     */
    public T getElementAt(int index){

        if(index >= size)
            throw new ArrayIndexOutOfBoundsException("index is "+index+"size is "+size);
        if(index < 0)
            throw new ArrayIndexOutOfBoundsException("index is less than 0");

         int cursor=0;
        Node<T> temporaryNodeHolder = headNode;

        while(cursor!=index){
            temporaryNodeHolder = temporaryNodeHolder.next;
            cursor++;
        }
        return temporaryNodeHolder.data;
    }
    public int size(){
        return size;
    }
    public void display(){
        Node<T> temp = headNode;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

