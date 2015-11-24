public class JSONObjectVariable extends JSONVariable
{
	private JSONObject value;
	
	public JSONObjectVariable(String name, JSONObject value)
	{
		super(name);
		this.value = value;
	}

	void display() 
	{
		System.out.println(this.name +" -> ");
		this.value.display();
	}

	@Override
	public String exportToJSON() 
	{
		return "\"" + this.name + "\"{\"" + this.value + "\"}";
	}
}