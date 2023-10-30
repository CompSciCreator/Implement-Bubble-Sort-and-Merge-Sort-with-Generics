import java.util.ArrayList;


public class Sort {
    
    public static <E extends Comparable<E>> void mergeSort(ArrayList<E>  arrayList, int start, int end) {
        if (end - start <= 1 ) return;
        int middle = (start + end) / 2; 
        mergeSort(arrayList, start, middle);
        mergeSort(arrayList, middle, end);
        merge(arrayList, start, middle, end);


    }
    public static <E extends Comparable<E>> void mergeSort(ArrayList<E>  arrayList) {
        mergeSort(arrayList, 0, arrayList.size());
    }


    public static <E extends Comparable<E>> void merge(ArrayList<E> arrayList, int start, int middle, int end){
        int i = start, j=middle, k=0;
        ArrayList<E> temp = new ArrayList<>();
        while (i < middle && j < end){
            if (arrayList.get(i).compareTo(arrayList.get(j)) > 0 ){
                temp.add(arrayList.get(j));
                j++;
                
            } else {
                temp.add(arrayList.get(i));
                i++;
            }

        }

        while ( i < middle) {
            temp.add(arrayList.get(i));
            i++;
        }
        while (j < end) {
            temp.add(arrayList.get(j));
            j++;
        }
        for (k = 0 ; k < temp.size() ; k++);
        for(i=start; i<end; i++) {
            arrayList.set(i, temp.get(i-start));
        }


    } 

    public static <E extends Comparable<E>> boolean isSorted(ArrayList<E> arrayList) {
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i).compareTo(arrayList.get(i+1)) > 0) return false;
        }
        return true;
    }


    public static <E> void swap(ArrayList<E> arrayList, int i, int j) {
        E temp = arrayList.get(i);
        arrayList.set(i , arrayList.get(j));
        arrayList.set(j, temp);
    
    }
    
    public static <E extends Comparable<E>>void bubbleSort(ArrayList<E> arrayList) {
        bubbleSort(arrayList, 0, arrayList.size());
        }
    
        // 2 methods within the same class but with different parameter lists = overloading ^
        // the method name has been used multiple times.
    
    public static <E extends Comparable <E>> void bubbleSort(ArrayList<E> arrayList, int start, int end) {
        if (end - start <= 1 ) 
            return;
    
        for (int i = start; i < end - 1; i++) {
            if (arrayList.get(i).compareTo(arrayList.get(i+1)) > 0) {
                swap(arrayList, i, i + 1);
            }
        }
            
        bubbleSort(arrayList, start, end - 1);
    }
    
    
}

