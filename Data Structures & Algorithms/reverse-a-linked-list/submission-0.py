# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp = head
        previous = None # End will be none, so start needs to be None

        while temp != None:
            # Keep track of where we're going
            next_ = temp.next
            temp.next = previous
            previous = temp
            temp = next_
        
        return previous
