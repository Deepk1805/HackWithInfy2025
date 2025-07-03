import java.util.*;

 

class Problem2_FractionalKnapsack {
   

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // number of items
        int capacity = s.nextInt(); // knapsack capacity

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            int weight = s.nextInt();
            items[i] = new Item(value, weight);
        }

        // Sort items by value/weight ratio in decreasing order
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));

        double totalValue = 0.0;

        for (Item it : items) {
            if (capacity >= it.weight) {
                capacity -= it.weight;
                totalValue += it.value;
            } else {
                totalValue += it.value * ((double)capacity / it.weight);
                break; // capacity is full
            }
        }

        System.out.printf("Maximum value: %.2f\n", totalValue);
        s.close();
    }

    static class Item {
        int value, weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

}