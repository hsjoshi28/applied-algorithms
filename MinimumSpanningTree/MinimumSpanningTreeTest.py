import unittest
from MinimumSpanningTree import MinimumSpanningTree

class MinimumSpanningTreeTest(unittest.TestCase):
    def test1(self):
        vertices = 3
        # [u, v, w]
        edges = [[0, 1, 3], [1, 2, 1], [2, 0, 2]]
        # select [0, 2] and [1, 2]
        ans = 3
        self.assertEqual(MinimumSpanningTree().mst(edges, vertices), ans)

        # [[0, 1, 1], [0, 2, -5], [0, 3, 1], [1, 2, 2], [2, 3, -1], [2, 4, 0], [3, 4, -2], [5, 4, 6], [5, 6, 1]]

    def test2(self):
        vertices = 7
        # [u, v, w]
        edges = [[0, 1, 1], [0, 2, -5], [0, 3, 1], [1, 2, 2], [2, 3, -1], [2, 4, 0], [3, 4, -2], [5, 4, 6], [5, 6, 1]]
        # select [0, 2] and [1, 2]
        ans = 0
        self.assertEqual(MinimumSpanningTree().mst(edges, vertices), ans)
