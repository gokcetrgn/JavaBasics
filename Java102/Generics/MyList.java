package Java102.Generics;
public class MyList <T>{

    private T[] array;
    private T[] newArray;
    private int capacity;
    private int size;

    public T[] getArray() {
        return array;
    }
    public void setArray(T[] array) {
        this.array = array;
    }
    public T[] getNewArray() {
        return newArray;
    }
    public void setNewArray(T[] newArray) {
        this.newArray = newArray;
    }

    public MyList(){
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }
    public MyList(int capacity){
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity]
        ;
    }

    public int getCapacity(){
        return this.array.length;
    }
    public int size(){
        size = 0;
        for(int i = 0; i < getCapacity(); i++){
            if(this.array[i] != null){
                size++;
            }
        }
        return size;
    }
    public void multiple2Capacity(){
        int newCapacity = this.capacity * 2;
        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
        this.capacity = newCapacity;
        
    }
    public void add(T element){ 
        
        if (this.size >= this.getCapacity()) {
            multiple2Capacity();
        }

        this.array[this.size] = element;
        this.size++;

            
    }
    
    public T get(int index){
        for(int i = 0; i<this.array.length; i++){
            if(i == index)
            {
                return this.array[index];
            }
        }return null;
    }
    public void remove(int index){
        newArray = (T[]) new Object[this.array.length - 1];
        if(index > this.array.length){
                System.out.println("null");
            }
        
            for (int i = 0, k = 0; i < this.array.length; i++) {
                if (i == index) {
                    continue;
                }
      
                newArray[k++] = array[i];
            }
            this.array = newArray;
    }

    public void set(int index, T data){
        for(int i = 0; i < this.array.length; i++){
            if(i == index){
                array[i] = data;
            }
        }
    }

    public String toString(){
        System.out.print("[");
       for(int i = 0; i<this.array.length; i++){
        System.out.print(this.array[i] + ",");
       }
       System.out.print("]");
       return "";
    }

    public int indexOf(T data){
       for(int i = 0; i < this.array.length; i++){
        if(this.array[i] == data){
            return i;
        }
       }
    return -1;
    }

    public int lastIndexOf(T data){
        int index = 0;
        for(int i = capacity - 1; i>=0; i--){
            if(this.array[i] == data){
                index = i;
                return index;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        for(int i = 0; i < this.array.length; i++){
            if(array[i] != null){
                return false;
            }
        }return true;
    }
    public Object[] toArray(){

            Object[] objectArray = (T[]) new Object[array.length];
    
            for (int i = 0; i < this.array.length - 1; i++) {
                objectArray[i] = this.array[i];
            }
    
            return objectArray;
    

    }
    public MyList<T> sublist(int start,int finish) {
        MyList<T> subList = new MyList<>(finish-start +1);
        for (int i=start;i<=finish;i++){
            subList.add((T)this.array[i]);
        }
        return subList;
    }
    public boolean contains(T data){
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i] == data){
                return true;
            }
        }
        return false;
    }

    public void clear(){
            int size = this.array.length;
            size = 0;
            this.array = (T[]) new Object[size];
    }
}
