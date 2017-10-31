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

            int mid = (int) Math.floor((end+start)/2);

            if (array[mid] == wantedValue) {

                return mid;

            } else if (array[mid] < wantedValue) {

                start = mid+1;

            } else if (array[mid] > wantedValue) {

                end = mid-1;

            }

        }

        return -1;
        
    }

}
