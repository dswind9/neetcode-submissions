# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        if head.next is None:
            return head

        current_node = head.next
        head.next = None
        old_head = head
        head = current_node

        while head.next is not None:
            current_node = head.next
            head.next = old_head
            old_head = head
            head = current_node
        
        head.next = old_head

        return head