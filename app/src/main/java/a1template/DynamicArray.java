// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    public int i;
    public T[] array;
    // DynamicArray<T> dynamicArray = new DynamicArray<T>(i, val);

    public DynamicArray(int i, T[] val) {
        this.i = i;
        this.array = val;
    }

    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i) {
        return array[i]; 
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset) {
        return array[i+offset];
    }


    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T val) {
        array[i] = val;
    }

    // Write a constructor to make a new DynamicArray Object from an array

    // Now implement the methods from IndexAccess?

}
