
public class JSONArray extends JSONVariable
{
	private JSONVariable[] theJSONArray;
	private int currSize;

	public JSONArray(String name)
	{
		super(name);
		this.theJSONArray = new JSONVariable[10];
		this.currSize = 0;
	}

	public void addJSONVariable(JSONVariable jv)
	{
		if(this.currSize < this.theJSONArray.length)
		{
			this.theJSONArray[this.currSize] = jv;
			this.currSize++;
		}
	}

	@Override
	void display()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public String exportToJSON() 
	{
		String answer = "\"" + this.name + "\":[";
		for(int i = 0; i < this.currSize; i++)
		{
			answer += this.theJSONArray[i].exportToJSON();
		}
		answer += "]";
		return answer;
	}
}