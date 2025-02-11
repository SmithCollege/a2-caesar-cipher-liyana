// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArraySol<T> implements IndexAccess<T>{
    
    private T[] arr;

    // Need an offset to keep track of different index mappings
    private int offset;

    // Could have high and low
    private int highIndex;
    private int lowIndex;

    // Constructor to make a new IndexAccess Object
    @SuppressWarnings("unchecked")
    public DynamicArraySol(int offset, T[] seq){
        this.arr = (T[]) new Object[seq.length]; // Create an Object[] and cast
        
        for(int i = 0; i < seq.length; i++){
            arr[i] = seq[i];
        }

        this.offset = offset;
        this.highIndex = seq.length + offset - 1;
        this.lowIndex = 0 + offset;

    }

    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i){
        return arr[i - offset];
    }

    /** Stores the given value at the given index
     * @param i index of location to store
     * @param val value to store at given index
     */
    public void set(int i, T val){
        arr[i - offset] = val;
    }

    public int findIndex(T val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }


}