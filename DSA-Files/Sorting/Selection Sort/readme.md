# ***Selection Sort***

### ***Selection Sort Definition***

**Selection Sort** is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.

---

### ***How Selection Sort Works***

**Selection Sort Algorithm**:

* **Step 1:** Set MIN to location 0
* **Step 2:** Search the minimum element in the list
* **Step 3:** Swap with value at location MIN
* **Step 4:** Increment MIN to point to the next element
* **Step 5:** Repeat until the list is sorted

---

### ***Selection Sort Complexity***

**Time Complexity** and **Space Complexity** of the algorithm.

#### ***Time Complexity***

* **Best Case Complexity:** This occurs when there is **no sorting required**, meaning the array is already sorted. The best-case time complexity is $O(n^2)$.
* **Average Case Complexity:** This occurs when the array elements are in a jumbled order. The average case time complexity is also $O(n^2)$.
* **Worst Case Complexity:** This occurs when the array elements are required to be sorted in reverse order (e.g., you need to sort in ascending order, but the elements are in descending order). The worst-case time complexity is $O(n^2)$.

#### **Space Complexity**

* $O(1)$