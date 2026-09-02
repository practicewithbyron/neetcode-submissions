# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Reach (m-N)th node via reference
        # Collapse given node
        # Two pointers, slow moves at 1, fast moves at slow + n
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy

        # Get fast ahead n steps
        for i in range(n+1):
            fast = fast.next

        while fast:
            # Keep moving both by one
            slow = slow.next
            fast = fast.next

        print(slow.val)
        print(fast)
 
        slow.next = slow.next.next
         
        # By the end slow should have the reference we need to collapse

        return dummy.next

            

