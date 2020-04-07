class Solution:
	# @param A : tuple of integers
	# @return an integer
	def trap(self, A):
		n = len(A)
		max_left_height=[None]*n
		max_right_height=[None]*n

		# Scanning through the list to find the max_left_height for each gap
		current_left_height = 0
		for i in range(n):
			max_left_height[i] = current_left_height
			current_left_height = max(current_left_height, A[i])

		current_right_height = 0
		for i in range(n):
			max_right_height[n-i] = current_right_height
			current_right_height = Math.max(current_right_height, A[n-i])

		total_water_trapped = 0
		for i in range(n):
			total_water_trapped += max(0, min(max_left_height[i], max_right_height[i]) - A[i])

		return total_water_trapped