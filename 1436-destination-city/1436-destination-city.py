class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        current_pair = paths[0]
        start = current_pair[0]
        end = current_pair[1]

        while True:
            found_next = False
            for pair in paths:
                if pair[0] == end:
                    start = pair[0]
                    end = pair[1]
                    found_next = True
                    break
            if not found_next:
                return end
        return ""
        
