class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sorted_arr_map = {}
        result = []
        for i in range(len(strs)):
            sorted_str = ''.join(sorted(strs[i]))
            if sorted_str not in sorted_arr_map.keys():
                sorted_arr_map[sorted_str] = len(result)
                result.append([strs[i]])
            else:
                index = sorted_arr_map[sorted_str]
                result[index].append(strs[i])

        return result