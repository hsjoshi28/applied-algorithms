

class Bipartiteness:
        def bipartite(self, edges, vertices):
            if vertices == 0 or vertices == 1:
                return 1
            self.graph = {x : [] for x in range(vertices)}
            self.make_graph(edges)
            if self.bfs(vertices) :
                return 1
            return -1

        def make_graph(self, edges, vertices):
            for v1,v2 in edges:
                self.graph[v1].append(v2)
                self.graph[v2].append(v1)

        
        def bfs(self, vertices):
            color = [-1 for x in range(vertices)]
            fringe = []
            for i in range(vertices):
                if color[i] == -1:
                    fringe.append((i, 0))
                    color[i] = 0

                    while fringe:
                        node, col = fringe.pop(0)
                        for succ in self.graph[node]:
                            if color[succ] == col:
                                return False
                            if color[succ] == -1:
                                color[succ] = 1 - col
                                fringe.append((succ, color[succ]))
            return True