import java.util.Map.Entry;
import java.util.TreeMap;


public class Vertex implements Comparable<Vertex> {
	private String name;
	private TreeMap<String, Integer> adjacencyList;//name, weight of an edge leaving this vertex
	public Integer dist = 0;
	public Vertex path = null;
	public boolean known = false;
	private int indegree;

	public int getIndegree()
	{
		return indegree;
	}
	
	public void addIndegree()
	{
		indegree++;
	}
	
	public void resetsIndegree()
	{
		indegree = 0;
	}

	public Vertex(String n)
	{
		indegree = 0;
		name = n;
		adjacencyList = new TreeMap<>();
	}
	public String getName()
	{
		return name;
	}
	public TreeMap<String, Integer> getAdjacencyList() {
		return adjacencyList;
	}

	public void addEdge(String name, Integer weight)
	{
	
		
		adjacencyList.put(name, weight);//add edge from this vertex to the one provided
		//will perform an update if connection already exists
		//could add check here to only keep smallest weight
	}
	public void addEdge(String name)
	{
		
		addEdge(name, 1);//default weight to 1 if not provided
	}

	public String toString()
	{
		String output = "Name:"+name;
		output += " Distance:"+dist;

		if(adjacencyList.size() > 0)
		{
			output += " Adjacent List:";
			for(Entry<String,Integer> e : adjacencyList.entrySet())
			{
				output += " (Name:"+e.getKey()+", Weight:"+e.getValue()+"), ";
			}
		}

		return output;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Vertex o) {
		return dist.compareTo(o.dist);
	}
}
