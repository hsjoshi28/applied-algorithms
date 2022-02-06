class FamilyForest:
    parent = {}
    rank = {}

    def make_family(self, s: str) -> None:       
        self.parent[s] = s
        self.rank[s] = 0
        

    def union(self, y: str, t: str) -> str:
        x = self.find(y)
        y = self.find(t)

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
        
        
    def find(self, s: str) -> str:
        while(s != self.parent[s]):
            s = self.parent[s]
        return s

