package shuhuai.leetcode.problems.t138;

import java.util.*;

public class Test {
    public Node constructLinkedList(int[][] input) {
        if (input == null || input.length == 0) {
            return null;
        }
        Map<Integer, Node> indexToNodeMap = new HashMap<>();
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        for (int i = 0; i < input.length; i++) {
            Node newNode = new Node(input[i][0]);
            indexToNodeMap.put(i, newNode);
            current.next = newNode;
            current = newNode;
        }
        current = dummyHead.next;
        for (int[] ints : input) {
            int randomIndex = ints[1];
            if (randomIndex != -1 && indexToNodeMap.containsKey(randomIndex)) {
                current.random = indexToNodeMap.get(randomIndex);
            }
            current = current.next;
        }

        return dummyHead.next;
    }

    public void printLinkedList(Node head) {
        Map<Node, Integer> nodeToIndex = new HashMap<>();
        Node current = head;
        int index = 0;
        while (current != null) {
            nodeToIndex.put(current, index++);
            current = current.next;
        }
        current = head;
        while (current != null) {
            int randomIndex = current.random != null ? nodeToIndex.get(current.random) : -1;
            System.out.println(current.val + " " + (randomIndex == -1 ? "null" : randomIndex));
            current = current.next;
        }
    }

    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                int[] arr = new int[2];
                String[] str = input.split(" ");
                for (int i = 0; i < str.length; i++) {
                    if (str[i].equals("null")) {
                        arr[i] = -1;
                    } else {
                        arr[i] = Integer.parseInt(str[i]);
                    }
                }
                list.add(arr);
                input = scanner.nextLine();
            }
            int[][] arr = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = new int[2];
                arr[i][0] = list.get(i)[0];
                arr[i][1] = list.get(i)[1];
            }
            Node head = constructLinkedList(arr);
            Node result = new Solution().copyRandomList(head);
            printLinkedList(result);
            result = new Solution().copyRandomListClever(head);
            printLinkedList(result);
            input = scanner.nextLine();
        }
    }
}