class StronglyConnectedComponents:
    def scc(self, students: int, knows: [[int]]) -> [[int]]:
        a = []
        known = {a: [] for a in range(students)}
        for i, j in knows:
            known[i].append(j)
        vertices = [a for a in range(students)]
        for self.scc in self.stronglu_conn_comp(vertices, known):
            self.scc = list(self.scc)
            print(a.append(self.scc))
        return a

    def stronglu_conn_comp(self,vertices, edges):
        identified = set()
        stack = []
        index = {}
        boundaries = []

        for v in vertices:
            if v not in index:
                stack1 = [('VISIT', v)]
                while stack1:
                    operation_type, v = stack1.pop()
                    if operation_type == 'VISIT':
                        self.visit_node(stack, index, v, boundaries, stack1, edges)
                    elif operation_type == 'VISITEDGE':
                        if v not in index:
                            stack1.append(('VISIT', v))
                        elif v not in identified:
                            while index[v] < boundaries[-1]:
                                boundaries.pop()
                    else:
                        if boundaries[-1] == index[v]:
                            boundaries.pop()
                            scc = set(stack[index[v]:])
                            del stack[index[v]:]
                            identified.update(scc)
                            yield scc

    def visit_node(self, stack, index, v, boundaries, stack1, edges):
        index[v] = len(stack)
        stack.append(v)
        boundaries.append(index[v])
        stack1.append(('POSTVISIT', v))
        stack1.extend(
            reversed([('VISITEDGE', w) for w in edges[v]]))

