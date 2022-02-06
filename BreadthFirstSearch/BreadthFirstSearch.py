from collections import defaultdict

class BreadthFirstSearch:
    def breadthFirstSearch(self, edges, vertices):
        if vertices == 0: 
            return []
        
        graph = defaultdict(list)
        for u, v in edges:
            graph[u].append(v)
        
        visited = [False] * vertices
        distance = [-1] * vertices
        visited[0] = True
        distance[0] = 0
 
        queue = [0]

        while queue:
            u = queue.pop(0)
            for i in graph[u]:
                if visited[i] == False:
                    queue.append(i)
                    visited[i] = True
                    distance[i] = distance[u] + 1
        return distance