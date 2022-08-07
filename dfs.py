# DFS (Depath first search)
# run this in online python interpretor such as - 
# https://www.programiz.com/python-programming/online-compiler/

graph = {
  '5' : ['3','7'],
  '3' : ['2', '4'],
  '7' : ['8'],
  '2' : [],
  '4' : ['8'],
  '8' : []
}

visited = set()

def dfs(visited, graph, node):
  if node not in visited:
    print (node)
    visited.add(node)
    for neighbour in graph[node]:
      dfs(visited, graph, neighbour)


print("Follow Depth first search")
dfs(visited, graph, '5')
