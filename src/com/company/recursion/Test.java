package com.company.recursion;

import com.company.custom.CustomQueue;
import com.company.custom.CustomStack;

import java.util.*;

public class Test {
    static int[] data = new int[200];
    //1 1 2 3 5 8 13
    public static int fibo(int num) {
        if (num == 1 || num == 2) {
            return data[num] = 1;
        } else if (data[num] != 0){
            return data[num];
        }
      return data[num] = fibo(num - 1) + fibo(num - 2);
    }

    public static int factory(int n) {
        if(n == 1) return 1;

        return n * factory(n - 1);
    }

    public static boolean isDuplicate() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10) + 1;
            if(!set.add(num))
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
//        fibo(7);
//        Arrays.stream(data).filter(a -> a != 0).forEach(a -> System.out.print(a + " "));
//        System.out.println();
//        System.out.println(factory(4));
//        System.out.println(isDuplicate());

        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty())
            System.out.println(stack.pop());
        System.out.println("============");
        CustomQueue queue = new CustomQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.search(0));
//        while(!queue.isEmpty())
//            System.out.println(queue.poll());
    }
}
