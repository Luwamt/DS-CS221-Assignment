package assignment3;

public class StudentArray {
    private Student[] arr; // reference to array
    private int nElems;


    public StudentArray(int max) { // constructor max is a capacity/length
        arr = new Student[max];

    }

    public Student find(int id) {
        for (int i = 0; i < nElems; i++) {
            if (arr[i] != null && arr[i].getId() == id)
                return arr[i];
        }
        return null;
    }

    public void insert(int id, String name, int mark) { // Duplicates of id not allowed. Make a
        // check before inserting values
        if (nElems == arr.length)
            throw new IndexOutOfBoundsException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId() == id)
                throw new IllegalArgumentException();
            if (arr[i] == null) {
                arr[i] = new Student(id, name, mark);
                nElems++;
                break;
            }
        }
    }

    public boolean delete(int id) {
        int index = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (i == arr.length)
            return false;
        for (int j = index + 1; j < arr.length; j++) {//Shifting the data to remove the array;
            arr[j - 1] = arr[j];
        }
        nElems--;
        return true;
    }

    public void displayAll() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                //System.out.print(arr[i]+" \n");
                arr[i].displayStudent();
            }
        }
    }

    public Student maxMark() {
        int index = 0;
        int max = arr[0].getMark();
        for (int i = 0; i < nElems; i++) {
            if (max < arr[i].getMark())
                index = i;
        }
        return arr[index];
    }

    public Student miniMark() {
        int index = 0;
        int min = arr[0].getMark();
        for (int i = 0; i < nElems; i++) {
            if (min > arr[i].getMark())
                index = i;
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int arrs = 5;
        StudentArray std = new StudentArray(arrs);
        std.insert(20, "Luwam", 10);
        std.insert(12, "Fili", 15);
        std.insert(15, "Mercy", 10);
        std.insert(1, "Haile", 20);
        std.insert(2, "Arkan", 10);
        std.displayAll();
        System.out.print("----------------------------\n");
        std.delete(12);
        std.displayAll();
        System.out.print("----------------------------\n");
        Student y = std.find(15);
        if (y == null)
            System.out.print("not available");
        else
            y.displayStudent();
        System.out.print("----------------------------\n");
        Student x = std.find(3333);
        if (x == null)
            System.out.print("not available");
        else
            y.displayStudent();
        System.out.print("----------------------------\n");
        std.maxMark().displayStudent();

        System.out.print("----------------------------\n");
        std.miniMark().displayStudent();
    }
}