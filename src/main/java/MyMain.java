import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count=0;
        for(int i = 0; i<list.size(); i++)
        {
            int a = list.get(i);
            if(a%2 == 1 || a%2 == -1)
            {
                count++;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++)
        {
            int a = list1.get(i);
            for (int j = 0; j < list2.size(); j++)
            {
                int b = list2.get(j);
                if (a == b)
                {
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for(int i = 0; i<arr.length; i++)
        {
            list.add(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {8, 9, 10, 11, 12, 13, 14, 15,};
        ArrayList<Integer> listA = new ArrayList<Integer>(convertToArrayList(arr));
        ArrayList<Integer> listB = new ArrayList<Integer>(convertToArrayList(arr2));
        System.out.println(listA);
        System.out.println(listB);
        System.out.println(countOdd(listA));
        System.out.println(checkDuplicates(listA, listB));

    }
}
