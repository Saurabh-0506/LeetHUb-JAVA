class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        int arr1 = a.length;
        int arr2 = b.length;

        // Result store karne ke liye dynamic array
        ArrayList<Integer> arr = new ArrayList<>();

        // i -> array a ka pointer
        // j -> array b ka pointer
        int i = 0;
        int j = 0;

        // Jab tak dono arrays mein elements available hain
        while(i < arr1 && j < arr2) {

            // a[i] chhota hai -> a[i] ko result mein add karo
            if(a[i] < b[j]) {

                // Duplicate element nahi hona chahiye
                if(arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                    arr.add(a[i]);
                }

                // a ka pointer aage badhao
                i++;
            }

            // b[j] chhota hai -> b[j] ko result mein add karo
            else if(a[i] > b[j]) {

                // Duplicate element nahi hona chahiye
                if(arr.isEmpty() || arr.get(arr.size() - 1) != b[j]) {
                    arr.add(b[j]);
                }

                // b ka pointer aage badhao
                j++;
            }

            // Dono elements equal hain
            else {

                // Ek hi element add karna hai
                if(arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                    arr.add(a[i]);
                }

                // Dono pointers ko aage badhao
                i++;
                j++;
            }
        }

        // Agar array a mein elements bach gaye
        while(i < arr1) {

            // Duplicate check
            if(arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
                arr.add(a[i]);
            }

            i++;
        }

        // Agar array b mein elements bach gaye
        while(j < arr2) {

            // Duplicate check
            if(arr.isEmpty() || arr.get(arr.size() - 1) != b[j]) {
                arr.add(b[j]);
            }

            j++;
        }

        return arr;
    }
}