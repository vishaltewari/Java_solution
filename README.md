# Java_solution

## Merge Sort Implementation

This repository contains a comprehensive implementation of the Merge Sort algorithm in Java.

### About Merge Sort

Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts them, and then merges the two sorted halves.

**Key Characteristics:**
- **Time Complexity:** O(n log n) in all cases (best, average, and worst)
- **Space Complexity:** O(n) for the temporary array used during merging
- **Stable:** Yes, maintains the relative order of equal elements
- **Type:** Comparison-based sorting algorithm

### Files

- `MergeSort.java` - Complete implementation with multiple test cases

### How to Run

```bash
# Compile the program
javac MergeSort.java

# Run the program
java MergeSort
```

### Features

The implementation includes:
- Well-documented code with detailed comments
- Multiple test cases demonstrating various scenarios:
  - Random array
  - Already sorted array
  - Reverse sorted array
  - Array with duplicate elements
  - Single element array
  - Empty array
  - Larger array

### Algorithm Overview

1. **Divide:** Split the array into two halves
2. **Conquer:** Recursively sort each half
3. **Combine:** Merge the sorted halves back together