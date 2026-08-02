class DynamicArray {
    private Integer[] array;
    // size is the number of elements
    private Integer size;

    public DynamicArray(Integer capacity) {
        this.array = new Integer[capacity];
        this.size = 0;
    }

    public Integer get(int i) {
        return array[i];
    }

    public void set(int i, Integer n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.size == getCapacity()) {
            resize();
        }
        this.array[this.size] = n;
        this.size++;
    }

    public int popback() {
        int val = array[size - 1];
        size--;
        return val;
    }

    public void resize() {
        Integer[] newArr = new Integer[this.array.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = this.array[i];
        }
        this.array = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.array.length;
    }
}