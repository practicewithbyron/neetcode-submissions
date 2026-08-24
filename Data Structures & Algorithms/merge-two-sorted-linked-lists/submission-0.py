# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        current_1 = list1
        current_2 = list2
        result = ListNode()
        current_result = result

        while current_1 != None or current_2 != None:
            # If the next val is greater than the next of the other, add the other val to the result
            # 1, 2, 4
            # 1, 3, 5
            # 1 or 1
            # If the same then add both
            # 2 or 3
            # 2 is less than 3, add 2
            # 4 or 3
            # 3 is less than 4, add 3
            # Check the next val for each node, and add the lower one to the result
            # If either node.next is None, then add the rest of the other node to result
            if current_1 == None:
                current_result.next = ListNode(current_2.val)
                current_result = current_result.next
                current_2 = current_2.next
                continue
            
            if current_2 == None:
                current_result.next = ListNode(current_1.val)
                current_result = current_result.next
                current_1 = current_1.next
                continue

            if current_1.val <= current_2.val:
                current_result.next = ListNode(current_1.val)
                current_result = current_result.next
                current_1 = current_1.next
            else:
                current_result.next = ListNode(current_2.val)
                current_result = current_result.next
                current_2 = current_2.next

        return result.next
