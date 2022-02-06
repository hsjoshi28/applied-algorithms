
class MinimumSpanningTree:
    parent = {}
    rank = {}
    
    def mst(self, edges: [[int]], vertices: int) -> int:
        
        A = [[]]
        for vert in range(0, vertices):
            self.make_set(vert)

        edges.sort(key=lambda x: x[2])
        cost = 0
        
        for u,v,w in edges:
            if self.find_set(u) != self.find_set(v):
                cost = cost + w
                self.union(u,v)

        return cost
    
    def union(self, y: int, t: int) -> int:
        x = self.find_set(y)
        y = self.find_set(t)

        if (x == y):
            self.parent[x] = y
            return x
        elif(self.rank[x] > self.rank[y]):
            self.parent[y] = x
            return x
        elif(self.rank[x] < self.rank[y]):
            self.parent[x] = y
            return y
        else:
            self.parent[x] = y
            self.rank[y] = self.rank[y]+1
            return y

    def make_set(self, s: int) -> None:       
        self.parent[s] = s
        self.rank[s] = 0

    def find_set(self, s: int) -> int:
        while(s != self.parent[s]):
            s = self.parent[s]
        return s
        
