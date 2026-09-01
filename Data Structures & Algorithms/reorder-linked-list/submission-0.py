# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        # Find midpoint
        orig_head = head
        slow = head
        fast = head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        
        mid = slow.next
        slow.next = None

        # Reverse 2nd half
        # From the slow pointer
        # slow is Node(4)
        # we need to keep Node (4)
        prev = None
        cur = mid
        # is node(6)
        while cur:
            # Need to point the next node at the prev
            temp = cur # temp is 4
            next_node = cur.next
            cur.next = prev # 4.next is None
            prev = temp # Prev is now 4
            cur = next_node # Cur is now pointing at 5
        


        # Merge into first list
        ref_a = orig_head
        ref_b = prev

        while ref_a and ref_b:
            temp = ref_a.next # 2 
            next_node = ref_b.next
            ref_a.next = ref_b # 1->5->4
            ref_a.next.next = temp #1-5-2-3-4
            ref_a = ref_a.next.next #ref_a = 2
            ref_b = next_node #ref_b = 
            
        





        

