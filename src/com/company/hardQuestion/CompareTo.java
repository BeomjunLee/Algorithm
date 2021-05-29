package com.company.hardQuestion;
import java.util.*;
import java.util.stream.Collectors;

public class CompareTo {

    static class Point implements Comparable<Point> {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        List<Point> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(new Point(scan.nextInt(), scan.nextInt()));
        }
//        Collections.sort(result);
        result = result.stream().sorted().collect(Collectors.toList());
        for (Point p : result) {
            System.out.println(p.getX() + " " + p.getY());
        }
    }
}
