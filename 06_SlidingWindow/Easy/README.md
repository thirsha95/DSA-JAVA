# Sliding Window 🚀
Sliding Window
      |
      |---- Need sum/count? → Variable
      |
      |---- Need frequency? → HashMap / HashSet
      |
      |---- Need first/last element? → Queue
      |
      |---- Need max/min element? → Deque
      |
      |---- Need matching brackets? → Stack

## What I Learned

Sliding Window is a technique used to solve problems involving:

- Continuous subarrays
- Continuous substrings
- Finding maximum/minimum/count inside a range

Instead of calculating every window separately, we maintain the current window information and update it while moving the window.


# Core Idea

A window is a range between two pointers:

left  → starting point of window  
right → ending point of window


Example:

Array:

[1, 2, 3, 4, 5]

k = 3


First Window:

[1, 2, 3]


Next Window:

Remove outgoing element:
1

Add incoming element:
4


New Window:

[2, 3, 4]


The window moves by:

Add new element
+
Remove old element


--------------------------------------------------


# Important Concept

The actual window is NOT stored.

We only store the information required to solve the problem.


Example:

Window:

[1, 12, -5, -6]


We do not store:

[1,12,-5,-6]


We only store:

windowSum = 2


Because the answer only depends on the sum.


Different problems store different information:

Problem                  Stored Information

Maximum Sum              windowSum

Maximum Average          windowSum

Maximum Vowels           vowelCount

First Negative Number    Queue

Sliding Window Maximum   Deque

Longest Substring        HashMap / HashSet



--------------------------------------------------


# Fixed Size Sliding Window


Fixed window means:

The size of the window is already given.

Example:

k = 3


Window size always remains 3.


Template:


1. Create the first window.

2. Store required information.

3. Move the window:

   Add element entering the window

   Remove element leaving the window

   Update answer



General formula:


New Window = Previous Window + Incoming Element - Outgoing Element



Incoming element:

arr[right]


Outgoing element:

arr[right - k]



--------------------------------------------------


# Fixed Window Implementation Pattern


Example:


int information = 0;


// First window

for(int i = 0; i < k; i++)
{
    update information;
}



for(int right = k; right < n; right++)
{

    // Add new element
    update information;


    // Remove old element
    update information;


    // Update answer

}



--------------------------------------------------


# Maximum Sum Subarray of Size K


Problem:

Find maximum sum of any contiguous subarray of size k.


Stored Information:

windowSum


Sliding:


Add:

nums[right]


Remove:

nums[right-k]



Time Complexity:

O(n)


Space Complexity:

O(1)



--------------------------------------------------


# Maximum Average Subarray


Problem:

Find maximum average value of subarray size k.


Approach:

Use the same sliding window sum.

Average:


sum / k



Stored Information:

windowSum



Time Complexity:

O(n)


Space Complexity:

O(1)



--------------------------------------------------


# Maximum Number of Vowels in Substring of Length K


Problem:

Find maximum number of vowels in any substring of length k.


Stored Information:

vowelCount


Important Learning:

We don't store the substring.

We only store:

Number of vowels present in current window.



Sliding:


Add:

new character entering window


Remove:

old character leaving window



Example:


Window:

abc


vowelCount:

1


Slide:


Add:

i


Remove:

a


New Window:

bci


vowelCount:

1



--------------------------------------------------


# Helper Function Concept


Functions like:


isVowel()

isPrime()

isPalindrome()



are NOT Java built-in functions.


We create them ourselves.


Example:


public static boolean isVowel(char ch)
{

    return ch=='a' ||
           ch=='e' ||
           ch=='i' ||
           ch=='o' ||
           ch=='u';

}



Main logic becomes cleaner:


if(isVowel(str.charAt(i)))
{
    vowel++;
}



--------------------------------------------------


# Sliding Window With Queue


Problem:

First Negative Number in Every Window of Size K


Why Queue?


Because now we need the actual element.

Example:


Window:

[12,-1,-7]


Negative numbers:


Queue:

[-1,-7]


Answer:

First element in queue


-1



Queue follows:

FIFO

First In First Out



When adding:


If number is negative:

Add to queue



When removing:


If outgoing element is equal to queue front:

Remove from queue



Stored Information:

Queue of important elements



--------------------------------------------------


# Sliding Window With HashMap


Used when we need frequency.


Example:

Longest Substring With K Distinct Characters


Store:


Character -> Frequency



Example:


String:

abcabc


Map:


a -> 1

b -> 1

c -> 1



Used for:

- Longest substring problems
- Frequency counting
- Anagram problems



--------------------------------------------------


# Sliding Window With HashSet


Used when we only need to know:

"Does this element already exist?"


Example:


Longest Substring Without Repeating Characters


Window:


abc


Set:


[a,b,c]



If new character already exists:

Shrink the window.



HashSet stores only unique values.



--------------------------------------------------


# Sliding Window With Deque


Used when we need:

Maximum or minimum element in every window.


Example:

Sliding Window Maximum


Why Deque?


Because we need:

Remove elements from front

Remove useless smaller elements from back



--------------------------------------------------


# Choosing Data Structure


Question Requirement          Data Structure


Sum                           Variable


Count                         Variable


Frequency                     HashMap


Unique Values                 HashSet


First Element                 Queue


Maximum/Minimum               Deque



--------------------------------------------------


# Problems Completed


## Easy

✅ Maximum Sum Subarray of Size K

✅ Maximum Average Subarray I

✅ Maximum Number of Vowels in Substring of Length K


## Next Problems

⬜ First Negative Number in Every Window

⬜ Sliding Window Maximum

⬜ Longest Substring Without Repeating Characters

⬜ Longest Substring With K Distinct Characters


--------------------------------------------------


# Final Sliding Window Template


1. Identify window size.

2. Decide what information needs to be stored.

3. Build first window.

4. Move window:

   Add incoming element

   Remove outgoing element

   Update answer


Remember:


The window is not stored.

Only the required information about the window is stored.