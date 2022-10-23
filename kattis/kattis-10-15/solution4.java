import java.util.*;

public class solution4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int j = 0;
        while(j < n){
            arr[j] = in.nextInt();
            j++;
        }
        int k = 0;
        long total = 0L;
        int[] mem = new int[n];
        HashSet<Integer>[] mems = new HashSet[n];
        Stack<Integer> stack = new Stack<>();
        while(k < n){
            System.out.println("index = " + k);   //INDEX PRINT
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set2 = new HashSet<>();
            int[] repeat = new int[n];
            int count = 0;
            int l = k;
            int start = 0;
            while(l >= 0 && l < mem.length){
                //value is already found
                if(mem[l] != 0){
                    System.out.println("mem " + l); //MEM PRINT
                    for(Map.Entry<Integer,Integer> entry : map.entrySet())
                    {
                        if(mems[l].contains(entry.getValue()))
                            repeat[entry.getKey()]--;
                    }
                    start = mem[l];
                    break;
                }
                //Contains a loop
                //find loop value and then set mem for each index to loop value
                if(map.containsKey(l)){
                    HashSet<Integer> s = new HashSet<>();
                    int temp = l;
                    int c = 1;
                    s.add(arr[l]);
                    l += arr[l];
                    while(l!= temp){
                        if(s.contains(arr[l]))
                            c--;
                        s.add(arr[l]);
                        c++;
                        l += arr[l];
                    }
                    while(stack.peek() != temp){
                        mems[stack.peek()] = s;
                        mem[stack.pop()] = c;
                    }
                    mems[stack.peek()] = s;
                    mem[stack.pop()] = c;
                    start = c;
                    break;
                }
                if(set2.contains(arr[l])){
                     repeat[l]--;
                }
                set2.add(arr[l]);
                map.put(l, arr[l]);
                stack.push(l);
                l += arr[l];
            }
            count += start;
            //bottom up add count to each mem index
            System.out.println(Arrays.toString(repeat));
            System.out.println(count);
            while(!stack.isEmpty()){
                int index = stack.pop();
                count++;
                count += repeat[index];
                mem[index] = count;
            }
            total += count;
            k++;
        }
        System.out.println("Array of numbers " + Arrays.toString(arr));  //ARRAY PRINT
        System.out.println("Memoization array " + Arrays.toString(mem)); //MEM PRINT
        System.out.println(total);
    }    
}