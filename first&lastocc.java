package NewKiet;



class FirstLast {
    public int first(int[] arr, int n, int x) {
        int start = 0, end = n - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid;
                end = mid - 1; 
            } else if (x < arr[mid]) {
                end = mid - 1; 
            } else {
                start = mid + 1; 
            }
        }
        return result;
    }

    public int last(int[] arr, int n, int x) {
        int start = 0, end = n - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid;
                start = mid + 1; 
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

  
    public int totalOccurrences(int[] arr, int n, int x) {
        int firstOccurrence = first(arr, n, x);
        int lastOccurrence = last(arr, n, x);

        if (firstOccurrence == -1) {
            return 0; // Target not found
        }
        return lastOccurrence - firstOccurrence + 1; 
    }

    public static void main(String[] args) {
        FirstLast obj = new FirstLast();
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 2;

        int first = obj.first(arr, n, x);
        int last = obj.last(arr, n, x);
        int total = obj.totalOccurrences(arr, n, x);

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
        System.out.println("Total Occurrences = " + total);
    }
}
