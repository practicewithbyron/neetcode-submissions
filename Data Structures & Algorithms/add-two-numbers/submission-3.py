# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        # Traverse through both, build the numbers as string and convert to int?

        string_a = []
        string_b = []
        ref_a = l1
        ref_b = l2
        carry_over = False
        to_return = ListNode()
        cur = to_return

        # Look at a given node compute it, if the sum is greater than 10, carry a one over
        while ref_a or carry_over or ref_b:
            ref_a_val = 0
            ref_b_val = 0
            if ref_a:
                ref_a_val = ref_a.val
            if ref_b:
                ref_b_val = ref_b.val

            sum_ = ref_a_val + ref_b_val
            if carry_over == True:
                sum_ += 1

            if sum_ >= 10:
                cur.next = ListNode(sum_-10)
                carry_over = True
            else:
                cur.next = ListNode(sum_)
                carry_over = False
                
            if ref_a:
                ref_a = ref_a.next
            if ref_b:
                ref_b = ref_b.next
            cur = cur.next

            
        return to_return.next
            








