import unittest
from BreadthFirstSearch import BreadthFirstSearch

class BreadthFirstSearchTest(unittest.TestCase):
    def test1(self):
        # links = [[0,1],[1,2],[2,0],[1,3]]
        graph = [[0,1],[0,2],[1,3],[1,4]]
        vertices = 5
        ans = [0,1,1,2,2]
        self.assertEqual(ans, BreadthFirstSearch().breadthFirstSearch(graph, vertices))
    
    def test2(self):
        # links = [[0,1],[1,2],[2,0],[1,3]]
        graph = [[0,1],[0,2],[1,3],[1,4],[2,5]]
        vertices = 6
        ans = [0,1,1,2,2,2]
        self.assertEqual(ans, BreadthFirstSearch().breadthFirstSearch(graph, vertices))

    def test3(self):
        # links = [[0,1],[1,2],[2,0],[1,3]]
        graph = [[0,1],[0,2],[1,3],[1,4],[6,6]]
        vertices = 6
        ans = [0,1,1,2,2,-1]
        self.assertEqual(ans, BreadthFirstSearch().breadthFirstSearch(graph, vertices))

    def test4(self):
        # links = [[0,1],[1,2],[2,0],[1,3]]
        graph = [[0,0],[1,1],[2,2]]
        vertices = 3
        ans = [0,-1,-1]
        self.assertEqual(ans, BreadthFirstSearch().breadthFirstSearch(graph, vertices))