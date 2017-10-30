class IterativeLookupBST {
    
    public static void main(String[] args) {

        int list[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        if (args.length == 0) {
            System.out.printf("Please enter a value");
            return;
        }

        int lookupValue = Integer.parseInt(args[0]);
        System.out.printf("%d\n", lookupValue);

        int index =  FindValue(list, lookupValue, 0, list.length);

        if (index != -1) {

            System.out.printf("Found %d at index %d", list[index], index);

        } else {

            System.out.printf("%d is not in the current array.", lookupValue);

        }

    }

    private static int FindValue(int[] array, int wantedValue, int start, int end) {

        while (start < end) {

            int mid = (int) Math.floor((end-start)/2);
            int current = start + mid;
            System.out.printf("Mid: %d, Current: %d, Start: %d, End: %d\n", mid, current, start, end);

            if (array[current] == wantedValue) {

                return current;

            } else if (array[current] < wantedValue) {

                start = current;

            } else if (array[current] > wantedValue) {

                end = current;

            }

        }

        return -1;
        
    }

}