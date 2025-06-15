package assignment;

public class App {

  public static int get(LinkedList list, int index) { // O(n)
    var result = list.head; // O(1)
    for (int i = 0; i < index; i++) { // O(n)
      result = result.next; // O(1)
    }
    return result.data; // O(1)
  }

  public static void set(LinkedList list, int index, int value) { // O(n)
    for (int i = 0; i < index; i++) { // O(n)
      list.head = list.head.next; // O(1)
    }
    list.head.data = value; // O(1)
  }

  public static void remove(LinkedList list, int index) { // O(n)
    var beforeTarget = list.head; // O(1)
    for (int i = 0; i < index - 1; i++) { // O(n)
      beforeTarget = beforeTarget.next; // O(1)
    }
    beforeTarget.next = beforeTarget.next.next; // O(1)
  }

  public static LinkedList reverse(LinkedList list) { // O(n)
    LinkedList.Node prev = null; // O(1)
    var current = list.head; // O(1)
    var next = list.head.next; // O(1)
    while (current != null) { // O(n)
      next = current.next; // O(1)
      current.next = prev; // O(1)
      prev = current; // O(1)
      current = next; // O(1)
    }
    list.head = prev; // O(1)
    return list; // O(1)
  }

  public static boolean isSortedAscending(LinkedList list) { // O(n)
    for (int i = 0; i < list.length(); i++) { // O(n)
      if (list.head.data > list.head.next.data) { // O(1)
        return false; // O(1)
      }
      list.head = list.head.next; // O(1)
    }
    return true; // O(1)
  }

  private App() {}
}
