import java.util.*;

class CountDuplicatesInArray
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        repeatedElements(arr, n);
	}

	public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((int)pair.getValue()>1) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

	public static void repeatedElements(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {

            if(map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        printMap(map);

    }
}
